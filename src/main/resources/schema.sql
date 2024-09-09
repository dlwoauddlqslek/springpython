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
-- [3] account 테이블 생성
drop table if exists account;
create table account (
    id int auto_increment ,
    content varchar(100) ,
    price int ,
    date varchar( 10 ) ,
    primary key (id)
);


