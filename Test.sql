create database shell;

use shell;

CREATE TABLE city (
   id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
   name VARCHAR(50) NOT NULL,
   population INT NOT NULL
);

CREATE TABLE country (
   id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
   name VARCHAR(50) NOT NULL,
   language VARCHAR(50) NOT NULL
);

ALTER TABLE city
ADD COLUMN country_id INT NOT NULL,
ADD FOREIGN KEY (country_id) REFERENCES country(id);

INSERT INTO country (name, language) VALUES
   ('Ukraine', 'Ukrainian'),
   ('France', 'French'),
   ('Germany', 'German'),
   ('Spain', 'Spanish');

INSERT INTO city (name, population, country_id) VALUES
   ('Kyiv', 2800000, 1),
   ('Paris', 2200000, 2),
   ('Berlin', 3600000, 3),
   ('Madrid', 3200000, 4);


SELECT * FROM city
SELECT * FROM country