drop table FILM if exists;

create table FILM (ID integer identity primary key,
    VOTES integer not null,
    TITLE varchar(50) not null,
    RATING decimal(9,2) not null);