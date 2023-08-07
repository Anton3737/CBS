CREATE DATABASE MyTESTDB;
USE MyTESTDB;

-- CREATE - ключове слово що використовується при створенні як Бази даних так і нових таблиць.


CREATE TABLE TestTable(
id INT AUTO_INCREMENT NOT NULL,
FirstColumn VARCHAR(10),
SecondColumn VARCHAR(10),
PRIMARY KEY(id)
);


INSERT INTO TestTable
(FirstColumn,SecondColumn)
VALUES
('Андрій','Київ'),
('Оксана','Ніжин'),
('Катерина','Львів'),
('Олег','Чернігів'),
('Яна','Одеса');

SELECT * FROM TestTableGetGUN;



-- DELETE
-- Синтаксис DELITE видаляє конкретні дані з таблиці . 


DELETE FirstColumn FROM TestTable;

DROP TABLE TestTable; 

-- DROP - ключове слово за допомогою якого виконуєть видалення Баз данних, таблиць , сутностей , колонок в залежності від використання.

-- DROP DATABASEЕ
-- DROP TABLE 
-- ALTER TABLE таблиця DROP інформація з таблиці;
-- ALTER TABLE TestTable DROP COLUMN times;


-- PRIMARY KEY - ключ що однозначно характеризує КОЖЕН запис в таблиці тобто є його унікальним значенням - ідентифікатором.
-- PRIMARY KEY (Унікальне значення яке буде характеризувати запис) в прикладі це стовпчик id;


-- FOREIGN KEY - ключ (поле або їх сукупність) що вказується в таблиці і за допомогоу якого ми можемо зв'язувати таблиці між собою.
-- FOREIGN KEY (імя_поля, імя_поля_1);


CREATE TABLE TestTable(
idtb INT AUTO_INCREMENT NOT NULL,
FirstColumn VARCHAR(10),
SecondColumn VARCHAR(10),
PRIMARY KEY(idtb)
);


INSERT INTO TestTable
(FirstColumn,SecondColumn)
VALUES
('Андрій','Київ'),
('Оксана','Ніжин'),
('Катерина','Львів'),
('Олег','Чернігів'),
('Яна','Одеса');


SELECT * FROM TestTable;


CREATE TABLE TestTable2(
idtb2 INT AUTO_INCREMENT NOT NULL, 
age INT NOT NULL,
born_mounth VARCHAR(15),
PRIMARY KEY(idtb2),
FOREIGN KEY(idtb2) REFERENCES TestTable(idtb)
);


INSERT INTO TestTable2
(age,born_mounth)
VALUES
('22','Січень'),
('19','Травень'),
('18','Березень'),
('29','Квітень'),
('31','Грудень');


SELECT * FROM TestTable2;

SELECT TestTable.idtb, TestTable.FirstColumn, TestTable.SecondColumn,TestTable2.age, TestTable2.born_mounth   FROM TestTable INNER JOIN TestTable2 ON TestTable.idtb = TestTable2.idtb2 ;


DROP TABLE TestTable; 
DROP TABLE TestTable2; 


-- ALTER - використовується для зміни кількості колонок та сутностей(рядків), а також видалення та додаванян нових колонок ключовими словами ADD та DROP.


ALTER TABLE TestTable ADD times time;

SELECT * FROM TestTable;


ALTER TABLE TestTable DROP times;

SELECT * FROM TestTable;


