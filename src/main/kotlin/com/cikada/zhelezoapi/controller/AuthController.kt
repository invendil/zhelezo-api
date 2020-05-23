package com.cikada.zhelezoapi.controller

import com.cikada.zhelezoapi.config.auth.JwtProvider
import com.cikada.zhelezoapi.model.auth.Roles.USER
import com.cikada.zhelezoapi.model.auth.User
import com.cikada.zhelezoapi.model.dto.JwtResponse
import com.cikada.zhelezoapi.model.dto.LoginUser
import com.cikada.zhelezoapi.model.dto.NewUser
import com.cikada.zhelezoapi.model.dto.ResponseMessage
import com.cikada.zhelezoapi.repository.RoleRepository
import com.cikada.zhelezoapi.repository.UserRepository
import com.cikada.zhelezoapi.util.objectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.*
import java.util.*
import java.util.stream.Collectors
import javax.validation.Valid

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
class AuthController() {

    @Autowired
    lateinit var authenticationManager: AuthenticationManager

    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var roleRepository: RoleRepository

    @Autowired
    lateinit var encoder: PasswordEncoder

    @Autowired
    lateinit var jwtProvider: JwtProvider

    @PostMapping("/signin")
    fun authenticateUser(@Valid @RequestBody loginRequest: LoginUser): ResponseEntity<*> {

        val userCandidate: Optional <User> = userRepository.findByUsername(loginRequest.username!!)

        if (userCandidate.isPresent) {
            val user: User = userCandidate.get()
            val authentication = authenticationManager.authenticate(
                UsernamePasswordAuthenticationToken(loginRequest.username, loginRequest.password))
            SecurityContextHolder
                .getContext()
                .authentication = authentication
            val jwt: String = jwtProvider.generateJwtToken(user.username!!)
            val authorities: List<GrantedAuthority> = user
                .roles!!
                .stream()
                .map { role -> SimpleGrantedAuthority(role.name)}
                .collect(Collectors.toList<GrantedAuthority>())
            return ResponseEntity.ok(JwtResponse(jwt, user.username, authorities))
        } else {
            return ResponseEntity(ResponseMessage("User not found!"),
                BAD_REQUEST)
        }
    }

    @PostMapping("/signup")
    fun registerUser(@Valid @RequestBody newUser: NewUser): ResponseEntity<*> {

        val userCandidate: Optional <User> = userRepository.findByUsername(newUser.username!!)

        if (!userCandidate.isPresent) {
            if (usernameExists(newUser.username!!)) {
                return ResponseEntity(ResponseMessage("Username is already taken!"),
                    BAD_REQUEST)
            } else if (emailExists(newUser.email!!)) {
                return ResponseEntity(ResponseMessage("Email is already in use!"),
                    BAD_REQUEST)
            }

            // Creating user's account
            val user = User(
                0,
                newUser.username,
                newUser.firstName,
                newUser.lastName,
                newUser.email,
                encoder.encode(newUser.password),
                true
            )
            user.roles = listOf(roleRepository.findByName(USER.name))

            userRepository.save(user)

            return ResponseEntity(ResponseMessage("User registered successfully!"), OK)
        } else {
            return ResponseEntity(ResponseMessage("User already exists!"), BAD_REQUEST)
        }
    }

    @GetMapping("/test")
    fun test() = authenticateUser(objectMapper.readValue(user))

    private fun emailExists(email: String): Boolean {
        return userRepository.findByUsername(email).isPresent
    }

    private fun usernameExists(username: String): Boolean {
        return userRepository.findByUsername(username).isPresent
    }

    companion object {
        val user = "{\n" +
            "  \"username\": \"cikada29\",\n" +
            "  \"password\":  123\n" +
            "}"
    }
}