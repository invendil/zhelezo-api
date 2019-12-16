INSERT INTO `zhelezo`.`form_factor` (`name`) VALUES ('ATX');
INSERT INTO `zhelezo`.`form_factor` (`name`) VALUES ('Mini-ITX');
INSERT INTO `zhelezo`.`form_factor` (`name`) VALUES ('MicroATX');
INSERT INTO `zhelezo`.`form_factor` (`name`) VALUES ('Desktop');

INSERT INTO `zhelezo`.`socket` (`name`) VALUES ('LGA1151');
INSERT INTO `zhelezo`.`socket` (`name`) VALUES ('AM4');
INSERT INTO `zhelezo`.`socket` (`name`) VALUES ('AM3+');

INSERT INTO `zhelezo`.`main_memory_type` (`name`) VALUES ('DDR1');
INSERT INTO `zhelezo`.`main_memory_type` (`name`) VALUES ('DDR2');
INSERT INTO `zhelezo`.`main_memory_type` (`name`) VALUES ('DDR3');
INSERT INTO `zhelezo`.`main_memory_type` (`name`) VALUES ('DDR4');
INSERT INTO `zhelezo`.`main_memory_type` (`name`) VALUES ('DDR5');

-- -- Main Memory
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5822/5822467_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance RGB PRO 16GB (2PK 8GB) 3GHz PC4-24000 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit with RGB Lighting - Black', '79.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6256/6256216_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - VENGEANCE LPX Series 16GB (2PK 8GB) 3.0GHz DDR4 Desktop Memory - Black', '74.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6337/6337727_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance RGB PRO 16GB (2PK 8GB) 3.2GHz PC4-25600 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit with RGB Lighting - Black', '94.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5822/5822470_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Dominator Platinum RGB 32GB (2PK 16GB) 3.2GHz PC4-25600 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit - Black', '194.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6319/6319885_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - VENGEANCE LPX Series 16GB (2PK 8GB) 2.4GHz DDR4 Desktop Memory - Black', '69.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6333/6333800_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance LPX 32GB (2PK 16GB) 2.4GHz PC4-19200 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit - Black', '129.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5878/5878702_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance RGB PRO 32GB (2PK 16GB) 3.2GHz PC4-25600 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit with RGB Lighting - Black', '164.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5822/5822465_sd.jpg;maxHeight=300;maxWidth=450', 'PNY - Anarchy-X 16GB (2PK 8GB) 3.2GHz DDR4 Desktop Memory - Red', '79.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6346/6346309_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - VENGEANCE LPX Series 16GB (2PK 8GB) 3.2GHz DDR4 Desktop Memory - White', '77.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5429/5429091_sd.jpg;maxHeight=300;maxWidth=450', 'PNY - XLR8 16GB (2PK 8GB) 2.666GHz PC4-21300 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit - Black/Red', '62.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6346/6346312_sd.jpg;maxHeight=300;maxWidth=450', 'PNY - 8GB 1.6 GHz DDR3 DIMM Desktop Memory - Green', '39.99', '3');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6319/6319887_sd.jpg;maxHeight=300;maxWidth=450', 'PNY - 8GB 2.4GHz PC4-19200 DDR4 SO-DIMM Unbuffered Non-ECC Laptop Memory - Black', '37.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6256/6256218_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance RGB PRO 32GB (2PK 16GB) 3GHz PC4-24000 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit with RGB Lighting - Black', '154.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/4895/4895530_sa.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance LPX 8GB 2.4GHz PC4-19200 DDR4 DIMM Unbuffered Non-ECC Desktop Memory - Black', '34.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/2824/2824528_sa.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance LPX 32GB (2PK x 16GB) 3.2 GHz DDR4 DRAM Desktop Memory Kit - Black', '149.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6063/6063100_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - 8GB (2PK x 4GB) 1.0GHz DDR3 SoDIMM Laptop Memory Kit - Green', '39.99', '3');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/4895/4895510_sa.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - VENGEANCE Series 16GB (2PK 8GB) 2.4GHz DDR4 Laptop Memory - Black', '62.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/4680/4680400_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance LPX 32GB (2PK x 16GB) 2.6 GHz DDR4 DRAM Desktop Memory Kit - Black', '129.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/4690/4690376_sd.jpg;maxHeight=300;maxWidth=450', 'PNY - 8GB 1.6 GHz DDR3 SoDIMM Laptop Memory - Green', '39.99', '3');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6337/6337723_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - ValueSelect 16GB (2PK x 8GB) 1.3 GHz DDR3 SDRAM Laptop Memory - Multi', '54.99', '3');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5822/5822461_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Dominator Platinum RGB 64GB (4PK 16GB) 3.2GHz PC4-25600 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit - Black', '389.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6256/6256221_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - VENGEANCE LPX Series 32GB (2PK 16GB) 3.0GHz DDR4 Desktop Memory - Black', '135.99', '4');
-- INSERT INTO `zhelezo`.`main_memory` (`img_url`, `name`, `price`, `main_memory_type_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5822/5822464_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Vengeance RGB PRO 16GB (2PK 8GB) 2.666GHz PC4-21300 DDR4 DIMM Unbuffered Non-ECC Desktop Memory Kit with RGB Lighting - Black', '84.99', '4');
--
-- -- Case --
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6319/6319965_rd.jpg;maxHeight=300;maxWidth=450', 'Garmin - vívoactive 4 Smartwatch 45mm Fiber-Reinforced Polymer - Silver with Shadow Gray Case and Silicone Band - Front_Standard', '299.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6364/6364328_sd.jpg;maxHeight=300;maxWidth=450', 'Garmin - vívoactive 4S Smartwatch 40mm Fiber-Reinforced Polymer - Light Gold With Dust Rose Case And Silicone Band - Front_Standard', '299.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6323/6323389_sd.jpg;maxHeight=300;maxWidth=450', 'X-Doria - Defense Edge Case for Apple Watch™ 40mm - Black - Angle_Zoom', '29.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6365/6365750_sd.jpg;maxHeight=300;maxWidth=450', 'NZXT - H510 Compact ATX Mid-Tower Case with Tempered Glass - Matte Black', '69.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6374/6374963_sd.jpg;maxHeight=300;maxWidth=450', 'NZXT - H510i Compact ATX Mid-Tower Case with RGB Lighting - Matte White', '99.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6370/6370546_sd.jpg;maxHeight=300;maxWidth=450', 'MSI - MPG GUNGNIR eATX Mid-Tower Case - Black/Light Gray', '109.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6237/6237542_sd.jpg;maxHeight=300;maxWidth=450', 'NZXT - H510 Elite Compact ATX Mid-Tower Case with Dual-Tempered Glass - Matte Black', '149.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6361/6361908_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - iCUE ATX Mid-Tower Case - Black', '149.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6198/6198945cv11a.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Carbide Series ATX Mid-Tower Case - Black', '79.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6321/6321230_sd.jpg;maxHeight=300;maxWidth=450', 'OtterBox - Symmetry Series Case for Apple® iPhone® 11 - Clear', '38.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5947/5947501_rd.jpg;maxHeight=300;maxWidth=450', 'Thule - Subterra PowerShuttle Travel Case - Dark Shadow', '24.95', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6339/6339169cv11a.jpg;maxHeight=300;maxWidth=450', 'MSI - MPG SEKIRA eATX Mid-Tower Case - Black/Silver', '249.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/5850/5850304_sd.jpg;maxHeight=300;maxWidth=450', 'Modal™ - Camera Wrist Strap (3-Pack) - Pink/Teal/Gold - Angle_Zoom', '2.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6353/6353122_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Carbide Series 678C ATX Mid-Tower Case - Black - Alt_View_Standard_11', '149.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6237/6237540_sd.jpg;maxHeight=300;maxWidth=450', 'Insignia™ - Portable Hard Drive Case - Black', '9.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6237/6237541_sd.jpg;maxHeight=300;maxWidth=450', 'Thermaltake - V Series ATX Mid-Tower Case - Black', '39.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6181/6181283_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Crystal Series ATX Mid-Tower Case - Mirror Black', '199.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6337/6337960_sd.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - LL Series 120mm Case Cooling Fan Kit with RGB lighting', '103.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6794/6794588_ra.jpg;maxHeight=300;maxWidth=450', 'CORSAIR - Graphite Series Full Tower Case - Black', '179.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6084/6084400_sd.jpg;maxHeight=300;maxWidth=450', 'GAMDIAS - TALOS Micro ATX Mid-Tower Case - Black', '79.99', FLOOR(RAND()*4)+1);
-- INSERT INTO `zhelezo`.`pc_case` (`img_url`, `name`, `price`, `form_factor_id`) VALUES ('https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6385/6385434_sd.jpg;maxHeight=300;maxWidth=450', 'Case Logic - 16-Disc CD Wallet - Black - Angle_Standard', '2.99', FLOOR(RAND()*4)+1);
--
-- -- Processor --
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Coffee Lake, LGA1151 v2, 6 ядер, частота 4.1\/2.9 ГГц, кэш 9 МБ, техпроцесс 14 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/fb078eb7abffe5cda1b67caae6a24969.jpeg', 'Intel Core i5-9400F', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Pinnacle Ridge, AM4, 6 ядер, частота 3.9\/3.4 ГГц, кэш 3 МБ + 16 МБ, техпроцесс 12 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/d0db14c9e3fdf56272a25a6aca289fba.jpeg', 'AMD Ryzen 5 2600', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Matisse, AM4, 6 ядер, частота 4.2\/3.6 ГГц, кэш 3 МБ + 32 МБ, техпроцесс 7 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/fca7b5fa257c9cfb99429ef84fa54f9e.jpeg', 'AMD Ryzen 5 3600', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Coffee Lake, LGA1151 v2, 8 ядер, частота 4.9\/3.6 ГГц, кэш 12 МБ, техпроцесс 14 нм, TDP 95W', 'content2.onliner.by/catalog/device/header/664c01a50c39b57d4c2aaf4cf7e1eaa9.jpeg', 'Intel Core i7-9700K', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Pinnacle Ridge, AM4, 8 ядер, частота 4.1\/3.2 ГГц, кэш 4 Мб + 16 МБ, техпроцесс 12 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/d0db14c9e3fdf56272a25a6aca289fba.jpeg', 'AMD Ryzen 7 2700', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Coffee Lake, LGA1151 v2, 6 ядер, частота 4.6\/3.7 ГГц, кэш 9 МБ, техпроцесс 14 нм, TDP 95W', 'content2.onliner.by/catalog/device/header/fb078eb7abffe5cda1b67caae6a24969.jpeg', 'Intel Core i5-9600K', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Matisse, AM4, 12 ядер, частота 4.6\/3.8 ГГц, кэш 6 МБ + 64 МБ, техпроцесс 7 нм, TDP 105W', 'content2.onliner.by/catalog/device/header/fca7b5fa257c9cfb99429ef84fa54f9e.jpeg', 'AMD Ryzen 9 3900X', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Coffee Lake, LGA1151 v2, 8 ядер, частота 5\/3.6 ГГц, кэш 16 МБ, техпроцесс 14 нм, TDP 95W', 'content2.onliner.by/catalog/device/header/6c89cf9c805a88fd6c7adca3dce3ab08.jpeg', 'Intel Core i9-9900K', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Raven Ridge, AM4, 4 ядра, частота 3.7\/3.5 ГГц, кэш 2 МБ + 4 МБ, техпроцесс 14 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/8893d4bf98eb2617af7d815f56a5d13e.jpeg', 'AMD Ryzen 3 2200G', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Summit Ridge, AM4, 4 ядра, частота 3.4\/3.1 ГГц, кэш 2 МБ + 8 МБ, техпроцесс 14 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/b2c95da634c3938b507faafbcb7174b0.jpeg', 'AMD Ryzen 3 1200 (BOX)', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Summit Ridge, AM4, 4 ядра, частота 3.4\/3.1 ГГц, кэш 2 МБ + 8 МБ, техпроцесс 14 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/b2c95da634c3938b507faafbcb7174b0.jpeg', 'AMD Ryzen 3 1200', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Vishera, AM3+, 8 ядер, частота 4.2\/3.3 ГГц, кэш 8 МБ + 8 МБ, техпроцесс 32 нм, TDP 95W', 'content2.onliner.by/catalog/device/header/d604a8c103b45880c817493038a97a67.jpg', 'AMD FX-8300 (FD8300WMW8KHK)', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Vishera, AM3+, 6 ядер, частота 4.2\/3.9 ГГц, кэш 6 МБ + 8 МБ, техпроцесс 32 нм, TDP 125W', 'content2.onliner.by/catalog/device/header/d604a8c103b45880c817493038a97a67.jpg', 'AMD FX-6350 BOX (FD6350FRHKBOX)', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Skylake, LGA1151, 4 ядра, частота 4.2\/4 ГГц, кэш 8 МБ, техпроцесс 14 нм, TDP 91W', 'content2.onliner.by/catalog/device/header/435ce9b946e49f5b6a3f8801c5c6b825.jpg', 'Intel Core i7-6700K', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Haswell, LGA1150, 4 ядра, частота 4\/3.6 ГГц, кэш 1 Мб + 8 МБ, техпроцесс 22 нм, TDP 84W', 'content2.onliner.by/catalog/device/header/6e9da2aa77351d60bf1f1f793a2dfb92.jpg', 'Intel Core i7-4790', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Matisse, AM4, 6 ядер, частота 4.1\/3.6 ГГц, кэш 16 МБ, техпроцесс 7 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/fca7b5fa257c9cfb99429ef84fa54f9e.jpeg', 'AMD Ryzen 5 3500', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Picasso, AM4, 4 ядра, частота 4.2\/3.7 ГГц, кэш 2 МБ + 4 МБ, техпроцесс 12 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/dec3a9dc6b1e2cb061dca0a79647191a.jpeg', 'AMD Ryzen 5 3400G (BOX)', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Picasso, AM4, 4 ядра, частота 4\/3.6 ГГц, кэш 2 МБ + 4 МБ, техпроцесс 12 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/dec3a9dc6b1e2cb061dca0a79647191a.jpeg', 'AMD Ryzen 3 3200G', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Matisse, AM4, 16 ядер, частота 4.7\/3.5 ГГц, кэш 8 МБ + 64 МБ, техпроцесс 7 нм, TDP 105W', 'content2.onliner.by/catalog/device/header/fca7b5fa257c9cfb99429ef84fa54f9e.jpeg', 'AMD Ryzen 9 3950X', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Matisse, AM4, 8 ядер, частота 4.4\/3.6 ГГц, кэш 4 Мб + 32 МБ, техпроцесс 7 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/fca7b5fa257c9cfb99429ef84fa54f9e.jpeg', 'AMD Ryzen 7 3700X', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Raven Ridge, AM4, 2 ядра, частота 3.2 ГГц, кэш 1 Мб + 4 МБ, техпроцесс 14 нм, TDP 35W', 'content2.onliner.by/catalog/device/header/0fb2be22804e203af8c50c09ee174870.jpeg', 'AMD Athlon 200GE (BOX)', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Pinnacle Ridge, AM4, 8 ядер, частота 4.3\/3.7 ГГц, кэш 4 Мб + 16 МБ, техпроцесс 12 нм, TDP 105W', 'content2.onliner.by/catalog/device/header/d0db14c9e3fdf56272a25a6aca289fba.jpeg', 'AMD Ryzen 7 2700X', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Pinnacle Ridge, AM4, 6 ядер, частота 3.9\/3.4 ГГц, кэш 3 МБ + 16 МБ, техпроцесс 12 нм, TDP 65W', 'content2.onliner.by/catalog/device/header/d0db14c9e3fdf56272a25a6aca289fba.jpeg', 'AMD Ryzen 5 2600 (BOX)', '', '');
-- INSERT INTO `zhelezo`.`processor` (`description`, `img_url`, `name`, `price`, `socket_id`) VALUES ('Coffee Lake, LGA1151 v2, 2 ядра, частота 3.7 ГГц, кэш 4 МБ, техпроцесс 14 нм, TDP 54W', 'content2.onliner.by/catalog/device/header/8c9bba8c2405072dc756538956407e7d.jpeg', 'Intel Pentium Gold G5400 (BOX)', '', '');

