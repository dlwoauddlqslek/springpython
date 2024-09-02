-- [1] DB 생성 , DB생성은 mysql workbench
-- drop database if exists springpy;
-- create database springpy;
-- use springpy;
-- [2] user 테이블 생성
drop table if exists user;
create table user (
    id int auto_increment ,
    name varchar(20) ,
    age int ,
    primary key (id )
);
drop table if exists account;
create table account(
	id int auto_increment,
    ex varchar(30),
    amount int,
    date varchar(20),
    primary key(id)
)

