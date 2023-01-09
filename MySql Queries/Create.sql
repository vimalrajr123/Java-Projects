create table dbs_schema.Movies (
Id Int(5),
Name varchar(100),
Genere varchar(100),
Year Int(10),
Minutes Int(3),
primary key(Id)
);
commit;

insert into dbs_schema.Movies values(1002,'Aiyaa','Action',2005,180);
commit;
