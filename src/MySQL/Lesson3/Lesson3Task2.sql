CREATE DATABASE NormaliziDB;
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
('Іващенко А.А.',201,212,'Глок','20','Рибаков Н.Г.'  ,'майор'),
('Духов Р.М.'   ,0  ,200,'АК'  ,'47','Буров О.С.'    ,'майор');



SELECT * FROM GetGUN;

SELECT id,received_the_weapon,Office_Number,Platoon,Gun,GunModefication,Issued_the_weapon,Runk FROM GetGUN ORDER BY Gun;

DROP TABLE GetGUN;
DROP DATABASE NormaliziDB ;

