CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springapp;

CREATE TABLE insurances (
  insuranceID varchar(4) PRIMARY KEY,
  insuranceDescription varchar(255)
);
CREATE INDEX insurances_description ON insurances(description);

drop table insurances;