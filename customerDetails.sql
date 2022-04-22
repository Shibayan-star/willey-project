create database willeyproject;
use willeyproject;
create table metroCardDetails(metroId int primary key,metroStartValidity date,metroEndValidity date, metroBalance int);

insert ignore into metroCardDetails values(1,'2022-01-01','2022-01-01',100),
(2,'2022-03-02','2022-09-01',80),
(3,'2022-01-01','2022-07-06',100),
(4,'2022-01-01','2022-03-01',100),
(5,'2022-01-01','2023-04-06',100);

select * from metroCardDetails;


create table customerDetails
( customerId int primary key, name varchar(20),
 phonenumber varchar(20), metrocardId int references metroCarDetails(metroId));
insert into customerDetails values
(10,'Shibayan','9008648284',1),
(20,'Sai Krishna','8876645532',2),
(30,'Sridevi','9987765654',3),
(40,'Aditya','9887123234',4),
(50,'Ayyappa','7845624331',5);
select * from customerDetails;

