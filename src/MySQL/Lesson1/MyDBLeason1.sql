-- Завдання 2
-- Створити базу даних під назвою “MyDB”.

DROP DATABASE MyDB;
DROP TABLE WorkerNameAndPhone;
DROP TABLE SalaryPosition;
DROP TABLE BorndateLifePlacesAndMariedStatus;

CREATE DATABASE MyDB;
USE MyDB;

-- Завдання 3
-- У створеній базі даних (із завдання 2) створити 3 таблиці:
-- 1-а містить імена та номери телефонів співробітників певної компанії,

CREATE TABLE WorkerNameAndPhone(
idNP INT AUTO_INCREMENT NOT NULL,
name VARCHAR(50) NOT NULL,
phone VARCHAR(35) NOT NULL,
PRIMARY KEY (idNP)          -- ВІДКОРИГОВАНО 17/08/23
);

INSERT INTO WorkerNameAndPhone
(name,phone)                                           -- ВІДКОРИГОВАНО 17/08/23
VALUES
('Viktor', '380912223344'),
('Nikolay','380507772233'),
('Dmitiy', '380636668291'),
('Olga',   '380507783292'),
('Liubov', '380911112233'),
('Iryna',  '380687772143'),
('Natalia', '380994258611');

-- 2-а містить відомості про їхню зарплату, та посади,

CREATE TABLE SalaryPosition(
idSPP INT AUTO_INCREMENT NOT NULL,
salary DOUBLE NOT NULL,
position VARCHAR(100),
PRIMARY KEY (idSPP),                                       -- ВІДКОРИГОВАНО 17/08/23
FOREIGN KEY (idSPP) REFERENCES WorkerNameAndPhone(idNP)     -- ВІДКОРИГОВАНО 17/08/23
);

INSERT INTO SalaryPosition
(salary,position) 									-- ВІДКОРИГОВАНО 17/08/23
VALUES
(2400.33,'SQL developer'),
(12000.99, 'Frontand developer'),
(22321.12, 'Java developer'),
(5300.22 , 'JS developer'),
(10000.00 , 'SomeTask.C# developer'),
(1500.02 , 'Project manager'),
(12550.55, 'SomeTask.C++ developer');

-- 3-тя містить інформацію про сімейне становище, дату народження та місце проживання.

CREATE TABLE BorndateLifePlacesAndMariedStatus(
idBLM INT AUTO_INCREMENT NOT NULL,
mariedStatus VARCHAR(20) NOT NULL,
bornDate VARCHAR(20) NOT NULL,
livePlace VARCHAR(100) NOT NULL,
PRIMARY KEY (idBLM),
FOREIGN KEY (idBLM) REFERENCES WorkerNameAndPhone(idNP)
);

INSERT INTO BorndateLifePlacesAndMariedStatus
(mariedStatus,bornDate,livePlace)
VALUES
('НЕ одружений/на','19/06/1985','Київ'),
('НЕ одружений/на','31/12/1989','Житомир'),
('одружений/на','01/01/1994','Чернігів'),
('НЕ одружений/на','20/03/1994','Одеса'),
('одружений/на','07/07/1986','Київ'),
('НЕ одружений/на','25/02/1999','Харків'),
('НЕ одружений/на','12/07/1991','Черкаси');


SELECT * FROM WorkerNameAndPhone;
SELECT * FROM SalaryPosition;
SELECT * FROM BorndateLifePlacesAndMariedStatus;


-- Завдання 4
-- З завдання 3 таблиці 2 отримати id співробітників, зарплата яких більша за 10000.

SELECT idSPP FROM SalaryPosition WHERE salary > 10000.00; 

SELECT idSPP,salary,position FROM SalaryPosition WHERE salary > 10000.00; 


-- Завдання 5
-- З завдання 3 співробітник по id 1 був неодружений, одружився. Змінити дані у третій таблиці про сімейне становище.

UPDATE BorndateLifePlacesAndMariedStatus SET mariedStatus = 'одружений/на' WHERE idBLM = 1;
SELECT * FROM BorndateLifePlacesAndMariedStatus;






