create table cars (
    id int,
    color varchar(20),
    lplate varchar(10),
    primary key (id));

create table client (
    id int,
    name varchar(30),
    rating float,
    primary key (id));
create table license (
    id int,
    primary key (id));
create table driver (
    id int,
    license int,
    primary key (id),
    foreign key (license) references license(id));
create table ride (
    id int,
    driver int,
    client int,
    car int,
    duration bigint,
    primary key (id),
    foreign key (driver) references driver(id),
    foreign key (client) references client(id),
    foreign key (car) references cars(id));

insert into cars values (1, 'white', 'A000AA000');
insert into client values (1, 'Valerii', 4.8);
insert into license values (1);
insert into driver values (1, 1);
insert into ride values (1, 1, 1, 1, 15);
commit;


create table driver_cars (
    drivers_id int,
    cars_id int,
    foreign key (drivers_id) references driver(id),
    foreign key (cars_id) references cars(id));

insert into driver_cars values (1, 1);
commit;

alter table license add column code varchar(100);
update license set code = 'ABCDE';
commit;

create sequence car_seq;
create sequence client_seq;
create sequence driver_seq;
create sequence license_seq;
create sequence ride_seq;
