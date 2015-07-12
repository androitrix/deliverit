create database deliverit;

CREATE USER 'deliver_admin'@'localhost' IDENTIFIED BY 'deliver';
GRANT ALL PRIVILEGES ON deliverit.* TO 'deliver_admin'@'localhost'
    WITH GRANT OPTION;

CREATE USER 'deliver_admin'@'%' IDENTIFIED BY 'deliver';
GRANT ALL PRIVILEGES ON deliverit.* TO 'deliver_admin'@'%'
    WITH GRANT OPTION;
    
CREATE TABLE job (
  id                         BIGINT                           NOT NULL        AUTO_INCREMENT,
  description          VARCHAR(50)         NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE user (
  id                         BIGINT                            NOT NULL        AUTO_INCREMENT,
  user_name          VARCHAR(30)         NOT NULL,
  password            VARCHAR(100)       NOT NULL,
  first_name           VARCHAR(50)         NOT NULL,
  PRIMARY KEY(id)
);

alter table job 
add column job_type varchar(30), 
add column when_commitment_start date, 
add column when_commitment_end date;
alter table user add column last_name varchar(50);

CREATE TABLE customer (
  id                         BIGINT                            NOT NULL        AUTO_INCREMENT,
  name          VARCHAR(100)         NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE location (
  id                         BIGINT                            NOT NULL        AUTO_INCREMENT,
  name                       VARCHAR(50),
  description                VARCHAR(50),
  street_number1             VARCHAR(10),
  street_number2             VARCHAR(10),
  street_name                VARCHAR(50),
  street_suffix              VARCHAR(20),
  address2                   VARCHAR(100),     
  address3                   VARCHAR(100),
  city                       VARCHAR(50),
  state                      VARCHAR(20),
  post_code                  VARCHAR(20),
  country                    VARCHAR(50),
  PRIMARY KEY(id)
);

CREATE TABLE contact (
  id                         BIGINT                            NOT NULL        AUTO_INCREMENT,
  first_name                 VARCHAR(50),
  last_name                  VARCHAR(50),
  home_number                VARCHAR(20),
  work_number                VARCHAR(20),
  mobile_number              VARCHAR(20),
  email_address              VARCHAR(100),
  website                    VARCHAR(100),
  fax_number                 VARCHAR(20),
  contact_type               VARCHAR(10),
  PRIMARY KEY(id)
);

CREATE TABLE company (
  id                         BIGINT                            NOT NULL        AUTO_INCREMENT,
  name                       VARCHAR(50),
  description                VARCHAR(100),
  PRIMARY KEY(id)
);

ALTER TABLE job ADD company BIGINT;
ALTER TABLE job ADD CONSTRAINT fk_job_company 
FOREIGN KEY IND_JOB_COMPANY (company) 
REFERENCES company(id);

ALTER TABLE job ADD customer BIGINT;
ALTER TABLE job ADD CONSTRAINT fk_job_customer
FOREIGN KEY IND_JOB_CUSTOMER (customer)
REFERENCES customer(id);


ALTER TABLE customer ADD location BIGINT;
ALTER TABLE customer ADD CONSTRAINT fk_customer_location
FOREIGN KEY IND_CUST_LOC (location)
REFERENCES location(id);
