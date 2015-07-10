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