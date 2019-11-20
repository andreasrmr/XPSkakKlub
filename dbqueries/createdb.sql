DROP DATABASE IF EXISTS xpskakklub;
CREATE DATABASE xpskakklub;
USE xpskakklub;

CREATE TABLE CompanyInfo (
	row_id int PRIMARY KEY DEFAULT TRUE NOT NULL,
	name varchar(50),
    phone varchar(50),
    CONSTRAINT onerow_uni CHECK (ContactInfo.name)
);

CREATE TABLE member (
  id int NOT NULL AUTO_INCREMENT, 
  name  varchar(25) NOT NULL, 
  phone varchar (50) NOT NULL,
  email varchar (255) NOT NULL unique,
  birthday Date NOT NULL,
  #contingent_id int NOT NULL,
  PRIMARY KEY (id));

CREATE TABLE Contingent (
	id int(10) NOT NULL auto_increment,
	category varchar(50) NOT NULL unique,
    price int(20) NOT NULL,
    primary key (id));

#ALTER TABLE Members ADD CONSTRAINT FKContingentInMembers foreign key (contingent_id) REFERENCES Contingent (id);
   
  SELECT * FROM member;
  SELECT * FROM CompanyInfo;
  SELECT * FROM Contingent;
  
  use xpskakklub;
  
  
