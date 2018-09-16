--Drop's
Drop table account;
Drop table account_status;
Drop table city;
Drop table states;
Drop table country;
Drop table games;
Drop table genre;
Drop table requests;
Drop table reviews;
Drop table roles;
Drop table status;
Drop table trade;

--Commit
COMMIT;

--Status table
CREATE TABLE status(
status_id int,
status_name VARCHAR2(4000)UNIQUE NOT NULL,
primary key(status_id)
)

--Inserting Data
INSERT INTO status(status_id, status_name) VALUES ( 1, 'approved');
INSERT INTO status(status_id, status_name) VALUES ( 2, 'pending');
INSERT INTO status(status_id, status_name) VALUES ( 3, 'open');
INSERT INTO status(status_id, status_name) VALUES ( 4, 'closed');


DELETE FROM status where status_id = 3;

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
INSERT INTO STATES VALUES (4, 'Alaska');
INSERT INTO STATES VALUES (5, 'Alabama');
INSERT INTO STATES VALUES (6, 'Arkansas');
INSERT INTO STATES VALUES (7, 'Arizona');
INSERT INTO STATES VALUES (8, 'California');
INSERT INTO STATES VALUES (9, 'Colorado');
INSERT INTO STATES VALUES (10, 'Connecticut');
INSERT INTO STATES VALUES (11, 'District of Columbia');
INSERT INTO STATES VALUES (12, 'Delaware');
INSERT INTO STATES VALUES (13, 'Georgia');
INSERT INTO STATES VALUES (14, 'Hawaii');
INSERT INTO STATES VALUES (15, 'Iowa');
INSERT INTO STATES VALUES (16, 'Idaho');
INSERT INTO STATES VALUES (17, 'Illinois');
INSERT INTO STATES VALUES (18, 'Indiana');
INSERT INTO STATES VALUES (19, 'Kansas');
INSERT INTO STATES VALUES (20, 'Kentucky');
INSERT INTO STATES VALUES (21, 'Louisiana');
INSERT INTO STATES VALUES (22, 'Massachusetts');
INSERT INTO STATES VALUES (23, 'Maine');
INSERT INTO STATES VALUES (24, 'Michigan');
INSERT INTO STATES VALUES (25, 'Minnesota');
INSERT INTO STATES VALUES (26, 'Missouri');
INSERT INTO STATES VALUES (27, 'Mississippi');
INSERT INTO STATES VALUES (28, 'Montana');
INSERT INTO STATES VALUES (29, 'North Carolina');
INSERT INTO STATES VALUES (30, 'North Dakota');
INSERT INTO STATES VALUES (31, 'Nebraska');
INSERT INTO STATES VALUES (32, 'New Hampshire');
INSERT INTO STATES VALUES (33, 'New Jersey');
INSERT INTO STATES VALUES (34, 'New Mexico');
INSERT INTO STATES VALUES (35, 'Nevada');
INSERT INTO STATES VALUES (36, 'Ohio');
INSERT INTO STATES VALUES (37, 'Oklahoma');
INSERT INTO STATES VALUES (38, 'Oregon');
INSERT INTO STATES VALUES (39, 'Pennsylvania');
INSERT INTO STATES VALUES (40, 'Rhode Island');
INSERT INTO STATES VALUES (41, 'South Carolina');
INSERT INTO STATES VALUES (42, 'South Dakota');
INSERT INTO STATES VALUES (43, 'Tennessee');
INSERT INTO STATES VALUES (44, 'Texas');
INSERT INTO STATES VALUES (45, 'Utah');
INSERT INTO STATES VALUES (46, 'Virginia');
INSERT INTO STATES VALUES (47, 'Vermont');
INSERT INTO STATES VALUES (48, 'Washington');
INSERT INTO STATES VALUES (49, 'Wisconsin');
INSERT INTO STATES VALUES (50, 'West Virginia');
INSERT INTO STATES VALUES (51, 'Wyoming');
/

INSERT INTO city VALUES (4, 'Aaronsburg');
INSERT INTO city VALUES (5, 'Abbeville');
INSERT INTO city VALUES (6, 'Abbot');
INSERT INTO city VALUES (7, 'Abbotsford');
INSERT INTO city VALUES (8, 'Abbott');
INSERT INTO city VALUES (9, 'Abbottstown');
INSERT INTO city VALUES (10, 'Abbyville');
INSERT INTO city VALUES (11, 'Abell');
INSERT INTO city VALUES (12, 'Abercrombie');
INSERT INTO city VALUES (13, 'Aberdeen');
INSERT INTO city VALUES (14, 'Aberdeen Proving Ground', 'MD');
INSERT INTO city VALUES (15, 'Abernant');
INSERT INTO city VALUES (16, 'Abernathy');
INSERT INTO city VALUES (17, 'Abie');
INSERT INTO city VALUES (18, 'Abilene');
INSERT INTO city VALUES (19, 'Los Angeles');
INSERT INTO city VALUES (20, 'Abingdon');
INSERT INTO city VALUES (21, 'Abiquiu');
INSERT INTO city VALUES (22, 'Abita Springs');
INSERT INTO city VALUES (23, 'Abrams');
INSERT INTO city VALUES (24, 'Absaraka');
/
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
/
INSERT INTO country VALUES (1, 'Afghanistan');
INSERT INTO country VALUES(2, 'Albania');
INSERT INTO country VALUES(3, 'Algeria');
INSERT INTO country VALUES(4, 'American Samoa');
INSERT INTO country VALUES(5, 'Andorra');
INSERT INTO country VALUES(6, 'Angola');
INSERT INTO country VALUES(7, 'Anguilla');
INSERT INTO country VALUES(8, 'Antarctica');
INSERT INTO country VALUES(9, 'Antigua and Barbuda');
INSERT INTO country VALUES(10, 'Argentina');
INSERT INTO country VALUES(11, 'Armenia');
INSERT INTO country VALUES(12, 'Aruba');
INSERT INTO country VALUES(13, 'Australia');
INSERT INTO country VALUES(14, 'Austria');
INSERT INTO country VALUES(15, 'Azerbaijan');
INSERT INTO country VALUES(16, 'Bahamas');
INSERT INTO country VALUES(17, 'Bahrain');
INSERT INTO country VALUES(18, 'Bangladesh');
INSERT INTO country VALUES(19, 'Barbados');
INSERT INTO country VALUES(20, 'Belarus');
INSERT INTO country VALUES(21, 'Belgium');
INSERT INTO country VALUES(22, 'Belize');
INSERT INTO country VALUES(23, 'Benin');
INSERT INTO country VALUES(24, 'Bermuda');
INSERT INTO country VALUES(25, 'Bhutan');
INSERT INTO country VALUES(26, 'Bolivia');
INSERT INTO country VALUES(27, 'Bosnia and Herzegovina');
INSERT INTO country VALUES(28, 'Botswana');
INSERT INTO country VALUES(29, 'Bouvet Island');
INSERT INTO country VALUES(30, 'Brazil');
INSERT INTO country VALUES(31, 'British Indian Ocean Territory');
INSERT INTO country VALUES(32, 'Brunei Darussalam');
INSERT INTO country VALUES(33, 'Bulgaria');
INSERT INTO country VALUES(34, 'Burkina Faso');
INSERT INTO country VALUES(35, 'Burundi');
INSERT INTO country VALUES(36, 'Cambodia');
INSERT INTO country VALUES(37, 'Cameroon');
INSERT INTO country VALUES(38, 'Canada');
INSERT INTO country VALUES(39, 'Cape Verde');
INSERT INTO country VALUES(40, 'Cayman Islands');
INSERT INTO country VALUES(41, 'Central African Republic');
INSERT INTO country VALUES(43, 'Chile');
INSERT INTO country VALUES(44, 'China');
INSERT INTO country VALUES(45, 'Christmas Island');
INSERT INTO country VALUES(46, 'Cocos (Keeling) Islands');
INSERT INTO country VALUES(47, 'Colombia');
INSERT INTO country VALUES(48, 'Comoros');
INSERT INTO country VALUES(49, 'Congo');
INSERT INTO country VALUES(50, 'Congo, the Democratic Republic of the');
INSERT INTO country VALUES(51, 'Cook Islands');
INSERT INTO country VALUES(52, 'Costa Rica');
INSERT INTO country VALUES(53, 'Cote D''Ivoire');
INSERT INTO country VALUES(54, 'Croatia');
INSERT INTO country VALUES(55, 'Cuba');
INSERT INTO country VALUES(56, 'Cyprus');
INSERT INTO country VALUES(57, 'Czech Republic');
INSERT INTO country VALUES(58, 'Denmark');
INSERT INTO country VALUES(59, 'Djibouti');
INSERT INTO country VALUES(60, 'Dominica');
INSERT INTO country VALUES(61, 'Dominican Republic');
INSERT INTO country VALUES(62, 'Ecuador');
INSERT INTO country VALUES(63, 'Egypt');
INSERT INTO country VALUES(64, 'El Salvador');
INSERT INTO country VALUES(65, 'Equatorial Guinea');
INSERT INTO country VALUES(66, 'Eritrea');
INSERT INTO country VALUES(67, 'Estonia');
INSERT INTO country VALUES(68, 'Ethiopia');
INSERT INTO country VALUES(69, 'Falkland Islands (Malvinas)');
INSERT INTO country VALUES(70, 'Faroe Islands');
INSERT INTO country VALUES(71, 'Fiji', 'FJI');
INSERT INTO country VALUES(72, 'Finland');
INSERT INTO country VALUES(73, 'France');
INSERT INTO country VALUES(74, 'French Guiana');
INSERT INTO country VALUES(75, 'French Polynesia');
INSERT INTO country VALUES(76, 'French Southern Territories');
INSERT INTO country VALUES(77, 'Gabon');
INSERT INTO country VALUES(78, 'Gambia');
INSERT INTO country VALUES(79, 'Georgia');
INSERT INTO country VALUES(80, 'Germany');
INSERT INTO country VALUES(81, 'Ghana');
INSERT INTO country VALUES(82, 'Gibraltar');
INSERT INTO country VALUES(83, 'Greece');
INSERT INTO country VALUES(84, 'Greenland');
INSERT INTO country VALUES(85, 'Grenada');
INSERT INTO country VALUES(86, 'Guadeloupe');
INSERT INTO country VALUES(87, 'Guam');
INSERT INTO country VALUES(88, 'Guatemala');
INSERT INTO country VALUES(89, 'Guinea');
INSERT INTO country VALUES(90, 'Guinea-Bissau');
INSERT INTO country VALUES(91, 'Guyana');
INSERT INTO country VALUES(92, 'Haiti');
INSERT INTO country VALUES(93, 'Heard Island and Mcdonald Islands');
INSERT INTO country VALUES(94, 'United States');
INSERT INTO country VALUES(95, 'United Kingdom');
INSERT INTO country VALUES(96, 'Hong Kong');
INSERT INTO country VALUES(97, 'Hungary');
INSERT INTO country VALUES(98, 'Iceland');
INSERT INTO country VALUES(99, 'India');
INSERT INTO country VALUES(100, 'Nigeria');

/
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
INSERT INTO account(user_id,role_id,email,first_name,last_name,username,password,phone_number,street_address,city_id,state_id,country_id) VALUES(114,1,'lilu@yahoo.com','Lily','Mason','lily24','lil24',3122370004,'Owings Mills',03,003,103);
INSERT INTO account VALUES (120,2,'rhysyamasaki@yahoo.com','Rhys','Yamasaki','rhys20','rhys20',7000431223,'Rosedeen lane',19,8,94, 1);
INSERT INTO account VALUES (121,2,'daniel@yahoo.com','Daniel','Sidhu','daniel21','dan21',7043100223,'Flowdnry Dr',4,44,94, 1);
INSERT INTO account VALUES (122,2,'alexh@yahoo.com','Alexander','Hudson','alexh22','savy22',2237043100,'Rick and Morty lane',5,5,94, 1);
INSERT INTO account VALUES (123,2,'alexm@yahoo.com','Alex','Moraga','alexm23','supreme23',3704322100,'Yeezy Str',6,46,94, 1);
INSERT INTO account VALUES (124,2,'aliciad@yahoo.com','Alicia','Douglas','alicia24','aliciad24',7034322100,'Dandy ln',7,002,94, 1);
INSERT INTO account VALUES (125,2,'chinedu@yahoo.com','Chinedu','Ozodi','chin25','chino25',3227034100,'Wistory ln',8,44,94, 1);
INSERT INTO account VALUES (126,2,'chris@yahoo.com','Chris','Holmes','chris26','chrish26',2100703432,'Tory ln',9,001,94, 1);
INSERT INTO account VALUES (127,2,'drake@yahoo.com','Drake','Mapel','drake27','spicy27',4322100703,'Fly Dr',10,003,94, 1);
INSERT INTO account VALUES (128,2,'eddie@yahoo.com','Eddie','Gray','eddie28','gamer28',2214300703,'Narrow Dr',11,003,94, 1);
INSERT INTO account VALUES (129,2,'humphry@yahoo.com','Humphry','Minott','humphry29','humm29',4302210703,'Sturdy Dr',12,001,95, 1);
INSERT INTO account VALUES (130,2,'jazzy@yahoo.com','Jasmine','Onwuzulike','jasmin30','jazzy30',3022104703,'Sunny Dr',13,21,94, 1);
INSERT INTO account VALUES (131,2,'joey@yahoo.com','Joey','Shannon','joey31','joeyshan31',7033022104,'Tree ln',12,22,94, 1);
INSERT INTO account VALUES (132,2,'marcin@yahoo.com','Marcin','Salamon','marcin32','marcins32',3370022104,'Clorcky ln',15,37,94, 1);
INSERT INTO account VALUES (133,2,'stephen@yahoo.com','Stephen','Hong','stephen33','badguy33',2104337002,'Gamer Dr',16,001,94, 1);
INSERT INTO account VALUES (134,2,'tosin@yahoo.com','Tosin','Onilogbo','tosin34','tosino34',4332107002,'Music Dr',17,35,95, 1);
INSERT INTO account VALUES (135,2,'oby@yahoo.com','Obosa','Nosa-Igiebor','areahh35','slimreaper35',4107332002,'Kevin D Dr',19,8,100, 1);
INSERT INTO account VALUES (136,2,'tyler@yahoo.com','Tyler','Atkinson','tyler36','tylert36',1074332002,'Rachel ln',18,23,95, 1);
/
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

--Inserting Data
INSERT INTO reviews(review_id, rating, review, game_id) VALUES ( 1, 5, 'This game is amazing, i definitley recommend it',1);

--Genre table
CREATE TABLE genre(
genre_id int,
genre_type VARCHAR2(4000),
primary key(genre_id)
)

--Inserting Data
INSERT INTO genre (genre_id, genre_type) VALUES (1 ,'action');
INSERT INTO genre (genre_id, genre_type) VALUES (2 ,'adventure');
INSERT INTO genre (genre_id, genre_type) VALUES (3 ,'platformer');
INSERT INTO genre (genre_id, genre_type) VALUES (4 ,'horror');
INSERT INTO genre (genre_id, genre_type) VALUES (5 ,'puzzle');
INSERT INTO genre (genre_id, genre_type) VALUES (6 ,'Real Time Strategy');
INSERT INTO genre (genre_id, genre_type) VALUES (7 ,'Role-playing');
INSERT INTO genre (genre_id, genre_type) VALUES (8,'Shooter');
INSERT INTO genre (genre_id, genre_type) VALUES (9 ,'Music');
INSERT INTO genre (genre_id, genre_type) VALUES (10 ,'point-and-click');
INSERT INTO genre (genre_id, genre_type) VALUES (11 ,'Simulator');
INSERT INTO genre (genre_id, genre_type) VALUES (12 ,'Sports');


--Games table
CREATE TABLE games(
game_id int,
plot VARCHAR2(4000) NOT NULL,
title VARCHAR2(4000)UNIQUE NOT NULL,
image VARCHAR2(4000),
genre_id int,
primary key(game_id),
Foreign key(genre_id) references genre(genre_id) 
)
/
SELECT * FROM games;
--Inserting Data
DELETE FROM games;
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

DELETE FROM requests;
--Inserting Data
INSERT INTO requests(request_id, user_id, game_id, description, status_id) VALUES (1, 111, 1, 'I am looking to exchange for this game',2);


drop table trade;

--Trade table
CREATE TABLE Trade(
trade_id int,
requested_offer_id int,
given_offer_id int,
primary key (trade_id),
Foreign key(requested_offer_id) REFERENCES requests(request_id),
Foreign key(given_offer_id) REFERENCES requests(request_id)
);

ALTER TABLE trade 
ADD status_id INT constraint status_id references status(status_id);

/
--Inserting Data
INSERT INTO Trade(trade_id, requested_offer_id, given_offer_id) VALUES (100, 1, 2);

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

