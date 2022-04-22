create database wileyproject;
use wileyproject;
create table station(
station_id int primary key,
station_name varchar(20));

insert into station
values(1,'delhi'),
(2,'kolkata'),
(3,'mumbai'),
(4,'noida'),
(5,'hyderabad');

create table Fare (
source_station int,
destination_station int,
price int,
foreign key(source_station) references station(station_id) ,
foreign key(destination_station) references station(station_id) 
);

