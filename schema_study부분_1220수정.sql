CREATE TABLE Study
(
	study_id             INT NOT NULL ,
	title                VARCHAR2(50) NULL ,
	writer		VARCHAR2(20) NOT NULL ,
	reportingdate        DATE NULL ,
	category             VARCHAR2(15) NULL ,
	location             VARCHAR2(10) NULL ,
	age                  VARCHAR2(10) NULL ,
	companyname          VARCHAR2(50) NULL ,
	period               INT NULL ,
	maxheadcount         INT NULL ,
	currheadcount        INT NULL
);

ALTER TABLE Study
	ADD CONSTRAINT  XPKStudy PRIMARY KEY (study_id);

ALTER TABLE Study
	ADD (CONSTRAINT fk_study_writer FOREIGN KEY (writer) REFERENCES Member (memberId));

CREATE TABLE Study_wish
(
	member_id            VARCHAR2(20) NOT NULL ,
	study_id             INT NOT NULL 
);

ALTER TABLE Study_wish
	ADD CONSTRAINT  XPKMember_Study PRIMARY KEY (member_id,study_id);

ALTER TABLE Study_wish
	ADD (CONSTRAINT R_36 FOREIGN KEY (member_id) REFERENCES Member (memberId));

ALTER TABLE Study_wish
	ADD (CONSTRAINT R_37 FOREIGN KEY (study_id) REFERENCES Study (study_id));