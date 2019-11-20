use xpskakklub;
INSERT INTO Contingent (category, price) VALUES ("Junior", "250");
INSERT INTO Contingent (category, price) VALUES ("Senior", "450");
INSERT INTO Contingent (category, price) VALUES ("Voksen", "650");

select * from Contingent;

select (price) from Contingent where category='Junior';