--Drop's
Drop table account;
Drop table address;
Drop table city;
Drop table states;
Drop table country;
Drop table games;
Drop table genre;
Drop table requests;
Drop table reviews;
Drop table roles;
Drop table status;

--Commit
COMMIT;

--Status table
CREATE TABLE status(
status_id int,
status_name VARCHAR2(4000)UNIQUE NOT NULL,
primary key(status_id)
)

--City table
CREATE TABLE city(
city_id int,
city_name VARCHAR2(4000)UNIQUE NOT NULL,
primary key(city_id)
)
--Inserting Data
INSERT INTO city(city_id,city_name) VALUES (01, 'Tampa');
INSERT INTO city(city_id,city_name) VALUES (02, 'Brooklyn');
INSERT INTO city(city_id,city_name) VALUES (03, 'Baltimore');

CREATE TABLE states(
state_id int,
state_name VARCHAR2(4000) UNIQUE NOT NULL,
primary key(state_id)
)
--Inserting Data
INSERT INTO states(state_id,state_name)VALUES(001, 'Florida');
INSERT INTO states(state_id,state_name)VALUES(002, 'New York');
INSERT INTO states(state_id,state_name)VALUES(003, 'Maryland');

--Country table
CREATE TABLE country(
country_id int,
country_name VARCHAR2(4000) UNIQUE NOT NULL,
primary key(country_id)
)
--Inserting Data
INSERT INTO country(country_id,country_name) VALUES(101,'USA');
INSERT INTO country(country_id,country_name) VALUES(102,'UK');
INSERT INTO country(country_id,country_name) VALUES(103,'CANADA');

--Roles tbale
CREATE TABLE roles(
role_id int,
role_name VARCHAR2(4000) NOT NULL,
primary key(role_id)
)
--Inserting data 
INSERT INTO roles(role_id, role_name) VALUES(1, 'Manager');
INSERT INTO roles(role_id, role_name) VALUES(2, 'User');

--Account table
CREATE TABLE account(
user_id int,
role_id int,
email VARCHAR2(4000) UNIQUE NOT NULL,
first_name VARCHAR2(4000) NOT NULL,
last_name VARCHAR2(4000) NOT NULL,
username VARCHAR2(4000)UNIQUE NOT NULL,
password VARCHAR2(4000) NOT NULL,
phone_number int NOT NULL,
street_address VARCHAR2(4000) NOT NULL,
city_id int,
state_id int,
country_id int,
primary key(user_id),
Foreign key(role_id) references roles(role_id),
FOREIGN key(city_id) references city(city_id),
FOREIGN key(state_id) references states(state_id),
FOREIGN key(country_id) references country( country_id)
)
--Inserting Data
INSERT INTO account(user_id,role_id,email,first_name,last_name,username,password,phone_number,street_address,city_id,state_id,country_id) VALUES(111,2,'nisat@yahoo.com','Nisat','Chowdhury','nisat24','nisat24',4109870009,'Bruce B Downs',01,001,101);
INSERT INTO account(user_id,role_id,email,first_name,last_name,username,password,phone_number,street_address,city_id,state_id,country_id) VALUES(112,2,'josh@yahoo.com','Josh','Maciejewski','josh24','josh24',6108761029,'Albee Square',02,002,102);
INSERT INTO account(user_id,role_id,email,first_name,last_name,username,password,phone_number,street_address,city_id,state_id,country_id) VALUES(113,2,'beckl@yahoo.com','Beck','Larson','beckl24','beckl24',3100079124,'Owings Mills',03,003,103);

--Altering Table Account
ALTER TABLE account
ADD account_status_id INT constraint account_status_id references account_status(account_status_id);

--Account_status table
CREATE TABLE account_status(
account_status_id INT,
status VARCHAR(4000),
primary key (account_status_id)
)

--Inserting Values
INSERT INTO account_status(account_status_id, status) VALUES (1, 'Activated');
INSERT INTO account_status(account_status_id, status) VALUES (2, 'Deactivated');

--Reviews table
CREATE TABLE reviews(
review_id int,
rating int NOT NULL,
review VARCHAR2(4000) NOT NULL,
game_id int,
primary key(review_id),
Foreign key(game_id) references games(game_id)
)

--Genre table
CREATE TABLE genre(
genre_id int,
genre_type VARCHAR2(4000),
primary key(genre_id)
)

--Games table
CREATE TABLE games(
game_id int,
plot VARCHAR2(4000) NOT NULL,
title VARCHAR2(4000)UNIQUE NOT NULL,
genre_id int,
primary key(game_id),
Foreign key(genre_id) references genre(genre_id) 
)

--Requests Table
CREATE TABLE requests(
request_id int,
user_id int,
game_id int,
description VARCHAR2(4000) NOT NULL,
status_id int,
primary key(request_id),
Foreign key(user_id) REFERENCES account(user_id),
Foreign key(game_id) references games(game_id),
Foreign key(status_id) references status(status_id)
)

--SEQUENCES for account
CREATE SEQUENCE user_id_seq
START WITH 1
INCREMENT BY 1;

--SEQUENCES for requests
CREATE SEQUENCE request_id_seq
START WITH 1
INCREMENT BY 1;

--SEQUENCES for games
CREATE SEQUENCE game_id_seq
START WITH 1
INCREMENT BY 1;

--SEQUENCES for review
CREATE SEQUENCE review_id_seq
START WITH 1
INCREMENT BY 1;

--Triggers for sequences
--account
CREATE OR REPLACE TRIGGER user_id_trigger
BEFORE INSERT ON account
FOR EACH ROW 
BEGIN
  IF :new.user_id IS NULL THEN
    SELECT user_id_seq.nextval INTO :new.user_id FROM dual;
  END IF;
END;
/

--requests
CREATE OR REPLACE TRIGGER request_id_trigger
BEFORE INSERT ON requests
FOR EACH ROW 
BEGIN
  IF :new.request_id IS NULL THEN
    SELECT request_id_seq.nextval INTO :new.request_id FROM dual;
  END IF;
END;
/

--games
CREATE OR REPLACE TRIGGER game_id_trigger
BEFORE INSERT ON games
FOR EACH ROW 
BEGIN
  IF :new.game_id IS NULL THEN
    SELECT game_id_seq.nextval INTO :new.game_id FROM dual;
  END IF;
END;
/

--review
CREATE OR REPLACE TRIGGER review_id_trigger
BEFORE INSERT ON reviews
FOR EACH ROW 
BEGIN
  IF :new.review_id IS NULL THEN
    SELECT review_id_seq.nextval INTO :new.review_id FROM dual;
  END IF;
END;
/

