create database wileydatabase;

use wileydatabase;

create table metroCardDetails(metroId int primary key,metroStartValidity date,metroEndValidity date, metroBalance int);

insert ignore into metroCardDetails values(1,'2022-01-01','2022-01-01',100),
(2,'2022-03-02','2022-09-01',80),
(3,'2022-01-01','2022-07-06',100),
(4,'2022-01-01','2022-03-01',100),
(5,'2022-01-01','2023-04-06',100);

drop table metroCardDetails;

create table metroCardDetails(metroId int primary key,metroStartValidity date,metroEndValidity date, metroBalance int);

insert ignore into metroCardDetails values(1,'2022-01-01','2022-01-01',100),
(2,'2022-03-02','2022-09-01',80),
(3,'2022-01-01','2022-07-06',100),
(4,'2022-01-01','2022-03-01',100),
(5,'2022-01-01','2023-04-06',100);

select * from metroCardDetails;
