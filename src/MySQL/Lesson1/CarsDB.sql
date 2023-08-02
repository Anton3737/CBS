-- Завдання 7
-- Використовуючи MySQL Workbench, створити порожню базу даних автомобілів. Заповнити таблицю даними (id(Autoincrement), марка, модель, об'єм двигуна, ціна, макс. швидкість).

CREATE DATABASE CARS;
USE CARS;

CREATE TABLE AUTOMOBILES(
id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
mark VARCHAR(30) NOT NULL,
model VARCHAR(30) NOT NULL,
engine_cap DOUBLE NOT NULL,
price DOUBLE NOT NULL,
max_speed INT NOT NULL

);



SELECT * FROM AUTOMOBILES;


DROP TABLE AUTOMOBILES;
DROP DATABASE CARS;