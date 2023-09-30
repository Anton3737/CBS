-- Завдання 7
-- Використовуючи MySQL Workbench, створити порожню базу даних автомобілів. Заповнити таблицю даними (id(Autoincrement), марка, модель, об'єм двигуна, ціна, макс. швидкість).

CREATE DATABASE CARS;
USE CARS;

CREATE TABLE AUTOMOBILES(
id INT AUTO_INCREMENT NOT NULL,
mark VARCHAR(30) NOT NULL,
model VARCHAR(30) NOT NULL,
engine_cap DOUBLE NOT NULL,
price DOUBLE NOT NULL,
max_speed INT NOT NULL,
PRIMARY KEY (id)								-- ВІДКОРИГОВАНО 17/08/23
);


INSERT INTO AUTOMOBILES                       -- ВІДКОРИГОВАНО 17/08/23
(mark,model,engine_cap,price,max_speed)
VALUES
('Mercedes','G55 AMG',5.5, 120000.12,   320),
('Mercedes','SomeTask.C'      ,1.2, 8900.99,     230),
('Mercedes','SL AMG', 7.2, 342000.01,   395),
('Mercedes','ML'     ,3.2, 55300.53,    200),
('Mercedes','SomeTask.A'      ,0.9, 3800.99,     110),
('Mercedes','CL'     ,3.2, 19000.00,    250);



SELECT * FROM AUTOMOBILES;


DROP TABLE AUTOMOBILES;
DROP DATABASE CARS;