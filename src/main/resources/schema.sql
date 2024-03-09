create table orderinfo
(
   id integer not null,
   name varchar(255) not null,
   type varchar(10) not null,
   price integer not null,
   number_of_item integer,
   primary key(id)
);