CREATE DATABASE NormaliziDB;
DROP DATABASE NormaliziDB;

USE NormaliziDB;

CREATE TABLE GetGUN
(
  id INT AUTO_INCREMENT NOT NULL,
  received_the_weapon VARCHAR(20),
  Office_Number INT, 
  Platoon INT NOT NULL,
  Gun VARCHAR(10),
  GunModefication VARCHAR(10),
  Issued_the_weapon VARCHAR(20),
  Runk VARCHAR(20),
  PRIMARY KEY(id)

);

INSERT INTO GetGUN
(received_the_weapon,Office_Number,Platoon,Gun,GunModefication,Issued_the_weapon,Runk)
VALUES
('Петров В.А.'  ,205,222,'АК'  ,'47','Буров О.С.'    ,'майор'),
('Петров В.А.'  ,205,222,'ГЛОК','20','Рибаков Н.Г.'  ,'майор'),
('Лодарев П.С.' ,221,232,'АК'  ,'74','Деребанов В.Я.','підполковник'),
('Лодарев П.С.' ,221,232,'ГЛОК','20','Рибаков Н.Г.'  ,'майор'),
('Іващенко А.А.',201,212,'АК'  ,'47','Буров О.С.'    ,'майор'),
('Іващенко А.А.',201,212,'ГЛОК','20','Рибаков Н.Г.'  ,'майор'),
('Духов Р.М.'   ,0  ,200,'АК'  ,'47','Буров О.С.'    ,'майор');



SELECT * FROM GetGUN;

SELECT id,received_the_weapon,Office_Number,Platoon,Gun,GunModefication,Issued_the_weapon,Runk FROM GetGUN ORDER BY Gun;

DROP TABLE GetGUN;
DROP DATABASE NormaliziDB ;


CREATE TABLE Persons
(
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
idPer INT NOT NULL,
received_the_weapon VARCHAR(30)
-- PRIMARY KEY (id,received_the_weapon)
);

INSERT INTO Persons
(idPer,received_the_weapon)
VALUE
(1,'Петров В.А.'),
(2,'Лодарев П.С.'),
(3,'Іващенко А.А.'),
(4,'Духов Р.М.');


CREATE TABLE Office
(
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
idOAP INT NOT NULL,
Office_Number INT,
-- PRIMARY KEY (id),
FOREIGN KEY(idOAP) REFERENCES Persons(id)
);

INSERT INTO Office
(idOAP,Office_Number)
VALUE
(1,200),
(2,212),
(3,222),
(4,232);

CREATE TABLE Weapon
(
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
idWeapon INT NOT NULL,
Gun VARCHAR(10),
GunModefication VARCHAR(10),
-- PRIMARY KEY (id),
FOREIGN KEY(idWeapon) REFERENCES Persons(id)
);

INSERT INTO Weapon
(idWeapon,Gun,GunModefication)
VALUE
(1,'АК','47'),
(2,'АК','74'),
(3,'ГЛОК','20');

CREATE TABLE Gunsmith(
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
idGunsmith INT NOT NULL,
Issued_the_weapon VARCHAR(20),
Runk VARCHAR(20),
-- PRIMARY KEY (id),
FOREIGN KEY(idGunsmith) REFERENCES Persons(id)
);

INSERT INTO Gunsmith
(idGunsmith,Issued_the_weapon,Runk)
VALUE 
(1,'Буров О.С.','майор'),
(2,'Рибаков Н.Г.','майор'),
(3,'Деребанов В.Я.','підполковник');


SELECT * FROM Persons;
SELECT * FROM Office;
SELECT * FROM Weapon;
SELECT * FROM Gunsmith;


CREATE TABLE UnionTable(
id INT AUTO_INCREMENT NOT NULL,



PRIMARY KEY (id),
FOREIGN KEY(idGunsmith) REFERENCES Persons(id)
);






DROP TABLE Persons;
DROP TABLE Office;
DROP TABLE Weapon;
DROP TABLE Gunsmith;


