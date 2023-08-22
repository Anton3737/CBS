CREATE DATABASE WholesaleStorageDB;

USE WholesaleStorageDB;

DROP TABLE WholesaleStorage;
DROP DATABASE WholesaleStorageDB;


-- Завдання 2

-- Спроектуйте базу даних для оптового складу, який має постачальники товарів, персонал, постійні замовники. Поля таблиць продумати самостійно.


CREATE TABLE WholesaleStorage(
-- ХТО 
id INT AUTO_INCREMENT NOT NULL,  	 -- інкрементована ІД
Provider VARCHAR(20),    			 -- постачальник 
Cashier_First_name VARCHAR(20),      -- імя відправника 
Cashier_Second_name VARCHAR(20),     -- прізвище відправника 
Date_of_shipment VARCHAR(10),  		 -- дата відправлення 
-- ---------------------------------------------------------------
-- ЩО 
nomenclature VARCHAR(20), 			 -- номенклатура                                                
consignment VARCHAR(20),   			 -- партія    
Product_name VARCHAR(100), 			 -- найменування товару 
Quantyti INT NOT NULL,               -- кількість                                                  
Price INT NOT NULL,					 -- ціна 
Currency VARCHAR(3),      			 -- валюта 
Amount INT NOT NULL,                 -- сума 
-- -- ----------------------------------------------------------------
-- -- КУДИ
City VARCHAR(20),					-- місто 
Street VARCHAR(50),    				-- вулиця 
Build_numbers INT NOT NULL,			-- номер будинку 
Apartments INT NOT NULL,			-- номер квартири
Phone_number VARCHAR(20), 			-- телефон отримувача 
TNN VARCHAR(30), 					-- накладна 
-- -- ----------------------------------------------------------------
-- -- КОМУ
Regular_customer VARCHAR(3),        -- постійний клієнт 
Recipient_First_name VARCHAR(20),   -- імя отримувача
Recipient_Second_name VARCHAR(20),  -- прізвище отримувача 
Delivery_data VARCHAR(10),  		-- дата доставки
PRIMARY KEY(id)

);


INSERT INTO WholesaleStorage
(Provider, Cashier_First_name, Cashier_Second_name, Date_of_shipment, nomenclature, consignment, Product_name, Quantyti, Price, Currency, Amount, City, Street, Build_numbers, Apartments, Phone_number, TNN, Regular_customer, Recipient_First_name, Recipient_Second_name, Delivery_data)
VALUES
('Розетка','Іванова','Іванна','01/08/2022','2214222','P-220101','Навушники Sony WH-1000XM3', 1 , 3900,'UAH' ,3900, 'Київ','Хрещатик вул.', 1, 100, '380911112233', '11111333332287698767', 'YES', 'Інесса','Шапокляк','01/08/2023'),

('Цитрус','Татьяна','Горобець','03/08/2022','12333341123','BWPX522','Навушники Bowers & Wilkins PX7 Carbon Edition', 1 , 15900,'UAH' ,15900, 'Київ','Велика Васильківська вул.', 113, 23, '3800505556788', '55555778961236748234', 'NO', 'Незнайка','Незнайков','05/08/2023'),

('Era in Ear','Людмила','Людмилова','29/07/2022','НАУ77789','EAR202222','Навушники Apple AirPods Max', 1 , 20299,'UAH' ,20299, 'Львів','Коперніка прв.', 10, 3, '380967778899', '12356789345671255567', 'NO', 'Андрій','Степанов','03/10/2023'),

('Стилус','Сорока','Ігор','03/07/2022','BS009221','BS202210','Навушники Bose QuietComfort 35 II', 1 , 12247,'UAH' ,12247, 'Вінниця','Северинівська вул.', 20, 0, '380234288433', '00000077789343427134', 'NO', 'Клименко','Вадим','05/09/2023'),

('Техно Їжак','Костенко','Андрій','14/07/2022','123400','PH805aa','Навушники Philips Performance TAPH805BK', 1 , 3299,'UAH' ,3299, 'Київ','Дарницька пл.', 1, 33, '380996667788', '55567412350958367945', 'NO', 'Гайворовська','Надія','15/12/2023'),

('Ябко','Яровець','Ярослава','13/08/2022','ААА4456','PЗ90345','Навушники KOSS KPH7 Wireless', 1 , 1599,'UAH' ,1599, 'Київ','Хрещатик вул.', 1, 100, '380911112233', '45678934567345678934', 'YES', 'Шапокляк','Інесса','14/08/2023'),

('Ябко','Яровець','Ярослава','13/08/2022','1234444','EARPRO20','Навушники Apple AirPods PRO', 1 , 4900,'UAH' ,4900, 'Одеса','Дерибасівська вул.', 100, 1, '380634445566', '23456234562345623456', 'NO', 'Козловський','Володимир','19/08/2023'),

('MOYO.ua','Кузьменко','Ірина','12/08/2022','678666','MOYO999','Навушники bang & olufsen beoplay h4 2nd gen matte black', 1 , 10768,'UAH' ,10768, 'Житомир','Володимирська вул.', 77, 0, '38067886633', '12345474568567853452', 'NO', 'Огризко','Кирило','12/08/2023');


SELECT * FROM WholesaleStorage;

DROP TABLE ProviderData;
DROP TABLE OrderData;
DROP TABLE TransportDocument;



CREATE TABLE ProviderData(
idProv INT AUTO_INCREMENT NOT NULL,
idSeller INT NOT NULL,
Provider VARCHAR(20),    			 -- постачальник 
Cashier_First_name VARCHAR(20),      -- імя відправника 
Cashier_Second_name VARCHAR(20),     -- прізвище відправника 
PRIMARY KEY(idProv)
);

INSERT INTO ProviderData
(       	idSeller,   	Provider,		Cashier_First_name,			Cashier_Second_name)
VALUES
(				1,            'Розетка',		'Іванова',					'Іванна'),
(				2,            'Цитрус',		    'Татьяна',					'Горобець'),
(				3,            'Era in Ear', 	'Людмила',					'Людмилова'),
(				4,            'Стилус',		    'Сорока',					'Ігор'),
(				5,            'Техно Їжак',	    'Костенко',					'Андрій'),
(				6,            'Ябко',			'Яровець',					'Ярослава'),
(				7,            'MOYO.ua',		'Кузьменко',				'Ірина');


SELECT * FROM ProviderData;





CREATE TABLE OrderData(
idOrderData INT AUTO_INCREMENT NOT NULL,
idTicket  INT NOT NULL,
nomenclature VARCHAR(20), 			 -- номенклатура
Recipient_First_name VARCHAR(20),    -- імя отримувача
Recipient_Second_name VARCHAR(20),   -- прізвище отримувача
consignment VARCHAR(20),   			 -- партія
Product_name VARCHAR(100), 			 -- найменування товару
Quantyti INT NOT NULL,               -- кількість
Price INT NOT NULL,					 -- ціна
Currency VARCHAR(3),      			 -- валюта
Amount INT NOT NULL,				 -- сума
Regular_customer VARCHAR(3),         -- постійний клієнт 
Delivery_data VARCHAR(10),  		 -- дата доставки
PRIMARY KEY (idOrderData),
FOREIGN KEY (idTicket) REFERENCES ProviderData(idProv)
);

INSERT INTO OrderData
(idTicket,      nomenclature,      Recipient_First_name,       Recipient_Second_name,    consignment,               Product_name,                                           Quantyti,       Price,      Currency,       Amount,     Regular_customer,             Delivery_data)
VALUES
(    7,           '2214222',        'Інесса',                      'Шапокляк',                 'P-220101',           'Навушники Sony WH-1000XM3',                                1 ,         3900,       'UAH' ,         3900,       'YES',                           '01/08/2023'),
(    2,           '12333341123',    'BWPX522',                     'Незнайка',                 'Незнайков',          'Навушники Bowers & Wilkins PX7 Carbon Edition',            1 ,         15900,      'UAH' ,         15900,      'NO',                            '05/08/2023'),
(    3,           'НАУ77789',       'EAR202222',                   'Андрій',                   'Степанов',           'Навушники Apple AirPods Max',                              1 ,         20299,      'UAH' ,         20299,      'NO',                            '03/10/2023'),
(    4,           'BS009221',       'BS202210',                    'Клименко',                 'Вадим',              'Навушники Bose QuietComfort 35 II',                        1 ,         12247,      'UAH' ,         12247,      'NO',                            '05/09/2023'),
(    6,           '123400',         'PH805aa',                     'Гайворовська',             'Надія',              'Навушники Philips Performance TAPH805BK',                  1 ,         3299,       'UAH' ,         3299,       'NO',                            '15/12/2023'),
(    2,           'ААА4456',        'PЗ90345',                     'Шапокляк',                 'Інесса',             'Навушники KOSS KPH7 Wireless',                             1 ,         1599,       'UAH' ,         1599,       'YES',                           '14/08/2023'),
(    1,           '1234444',        'EARPRO20',                    'Козловський',              'Володимир',          'Навушники Apple AirPods PRO',                              1 ,         4900,       'UAH' ,         4900,       'NO',                            '19/08/2023'),
(    6,           '678666',         'MOYO999',                     'Огризко',                  'Кирило',             'Навушники bang & olufsen beoplay h4 2nd gen matte black',  1 ,         10768,      'UAH' ,         10768,      'NO',                            '12/08/2023');

SELECT * FROM OrderData;



CREATE TABLE TransportDocument(
idTd INT AUTO_INCREMENT NOT NULL,
idTTN INT,
City VARCHAR(20),					-- місто 
Street VARCHAR(50),    				-- вулиця 
Build_numbers INT NOT NULL,			-- номер будинку 
Apartments INT NOT NULL,			-- номер квартири
Phone_number VARCHAR(20), 			-- телефон отримувача 
TNN VARCHAR(30), 					-- накладна 
PRIMARY KEY(idTd),
FOREIGN KEY (idTTN) REFERENCES ProviderData(idProv)
);


INSERT INTO TransportDocument
( idTTN,  City,			 Street,						Build_numbers,		Apartments,		Phone_number,		 TNN)
VALUES
( 	1,    'Київ',		'Хрещатик вул.', 				1,					 100, 			'380911112233',      '11111333332287698767'),
(	2,    'Київ',		'Велика Васильківська вул.', 	113, 				 23, 			'3800505556788',     '55555778961236748234'),
(	3,    'Львів',		'Коперніка прв.', 				10, 				 3, 			'380967778899',      '12356789345671255567'),
(	4,    'Вінниця',	'Северинівська вул.', 			20, 				 0, 			'380234288433',      '00000077789343427134'),
(	5,    'Київ',		'Дарницька пл.',			    1, 					 33, 			'380996667788',      '55567412350958367945'),
(	1,   'Київ',		'Хрещатик вул.', 			    1, 					 100, 			'380911112233',      '45678934567345678934'),
(	6,    'Одеса',		'Дерибасівська вул.', 			100, 				 1, 			'380634445566',      '23456234562345623456'),
(	6,    'Житомир',	'Володимирська вул.', 			77, 				 0, 			'38067886633',       '12345474568567853452');

SELECT * FROM TransportDocument;










