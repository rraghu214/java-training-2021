use allstate;

create table BookItem(
bid INT NOT NULL ,
title varchar(50) NOT NULL,
price double NOT NULL,
year INT NOT NULL,
author varchar(50) NOT NULL,
PRIMARY KEY (bid));

create table AudioItem(
aid INT NOT NULL,
title varchar(50) NOT NULL,
price double NOT NULL,
year INT NOT NULL,
artist varchar(50) NOT NULL,
PRIMARY KEY (aid));