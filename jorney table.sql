create database journey;
SET time_zone ='+00:00';
use journey;
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
create table Jorney(customerID int, foreign key (customerID) references customerDetails(customerId),swipein TIMESTAMP,swipeout timestamp,source_station varchar(20),destination_station varchar(20));



