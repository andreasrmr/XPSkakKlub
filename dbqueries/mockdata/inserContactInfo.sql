use xpskakklub;

#add
INSERT INTO company_info (id, company_info.name, phone) VALUES (1, "XP Skakklub", "23232323");

select * from contingent;
insert into contingent (id, category, price) values (1, "Senior", 200);
insert into contingent (id, category, price) values (0, "Pensionits", 150);
delete from company_info where id=1;
#delete()
DELETE FROM CompanyInfo WHERE row_id=null;

select * from company_info;