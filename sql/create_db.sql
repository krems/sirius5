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
    foreign key license(id));

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
