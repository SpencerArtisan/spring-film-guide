drop table T_FILM if exists;

create table T_FILM (ID integer identity primary key,
    VOTES integer not null,
    TITLE varchar(50) not null,
    RATING decimal(9,2) not null);