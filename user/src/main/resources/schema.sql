drop table user if exists;

create table user (
  id bigint generated by default as identity,
  username varchar(40),
  name varchar(20),
  age int(3),
  balance decimal(10,2),
  primary key(id)
)