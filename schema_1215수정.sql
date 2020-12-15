DROP TABLE TO_DO_LIST CASCADE CONSTRAINTS PURGE;

DROP TABLE Recruit_wish CASCADE CONSTRAINTS PURGE;

DROP TABLE Recruit CASCADE CONSTRAINTS PURGE;

DROP TABLE Company CASCADE CONSTRAINTS PURGE;

DROP TABLE Study_wish CASCADE CONSTRAINTS PURGE;

DROP TABLE Study CASCADE CONSTRAINTS PURGE;

DROP TABLE Member CASCADE CONSTRAINTS PURGE;

CREATE TABLE Company
(
	company_id           INT NOT NULL ,
	name                 VARCHAR2(50) NULL ,
	form                 VARCHAR2(10) NULL ,
	summary              VARCHAR2(50) NULL ,
	url                  VARCHAR2(2100) NULL 
);

ALTER TABLE Company
	ADD CONSTRAINT  XPKCompany PRIMARY KEY (company_id);

CREATE TABLE Member
(
	member_id            INT NOT NULL ,
	name                 VARCHAR2(40) NULL ,
	phone                VARCHAR2(11) NULL ,
	email                VARCHAR2(40) NULL ,
	age                  VARCHAR2(10) NULL ,
	password             VARCHAR2(20) NULL 
);

ALTER TABLE Member
	ADD CONSTRAINT  XPKMember PRIMARY KEY (member_id);

CREATE TABLE TO_DO_LIST
(
	member_id            INT NOT NULL ,
	TO_DO                VARCHAR2(50) NULL ,
	TO_DO_id             INT NOT NULL 
);

ALTER TABLE TO_DO_LIST
	ADD CONSTRAINT  XPKTO_DO_LIST PRIMARY KEY (TO_DO_id,member_id);

CREATE TABLE Recruit
(
	recruit_id           INT NOT NULL ,
	name                 VARCHAR2(40) NULL ,
	url                  VARCHAR2(2100) NULL ,
	form                 VARCHAR2(10) NULL ,
	title                VARCHAR2(50) NULL ,
	workingType          VARCHAR2(10) NULL ,
	regDate              DATE NULL ,
	deadline             DATE NULL ,
	company_id           INT NOT NULL 
);

ALTER TABLE Recruit
	ADD CONSTRAINT  XPKRecruit PRIMARY KEY (recruit_id,company_id);

CREATE TABLE Recruit_wish
(
	member_id            INT NOT NULL ,
	recruit_id           INT NOT NULL ,
	company_id           INT NOT NULL 
);

ALTER TABLE Recruit_wish
	ADD CONSTRAINT  XPKMember_Recruit PRIMARY KEY (member_id,recruit_id,company_id);

CREATE TABLE Study
(
	Study_id             INT NOT NULL ,
	title                VARCHAR2(50) NULL ,
	category             VARCHAR2(10) NULL ,
	location             VARCHAR2(10) NULL ,
	age                  VARCHAR2(10) NULL ,
	companyName          VARCHAR2(50) NULL ,
	maxheadcount         INT NULL ,
	period               INT NULL ,
	reportingdate        DATE NULL ,
	currheadcount        INT NULL 
);

ALTER TABLE Study
	ADD CONSTRAINT  XPKStudy PRIMARY KEY (Study_id);

CREATE TABLE Study_wish
(
	member_id            INT NOT NULL ,
	Study_id             INT NOT NULL 
);

ALTER TABLE Study_wish
	ADD CONSTRAINT  XPKMember_Study PRIMARY KEY (member_id,Study_id);

ALTER TABLE TO_DO_LIST
	ADD (CONSTRAINT R_8 FOREIGN KEY (member_id) REFERENCES Member (member_id));

ALTER TABLE Recruit
	ADD (CONSTRAINT R_25 FOREIGN KEY (company_id) REFERENCES Company (company_id));

ALTER TABLE Recruit_wish
	ADD (CONSTRAINT R_33 FOREIGN KEY (member_id) REFERENCES Member (member_id));

ALTER TABLE Recruit_wish
	ADD (CONSTRAINT R_34 FOREIGN KEY (recruit_id, company_id) REFERENCES Recruit (recruit_id, company_id));

ALTER TABLE Study_wish
	ADD (CONSTRAINT R_36 FOREIGN KEY (member_id) REFERENCES Member (member_id));

ALTER TABLE Study_wish
	ADD (CONSTRAINT R_37 FOREIGN KEY (Study_id) REFERENCES Study (Study_id));
