create database TestDatabaseGithub
go
use TestDatabaseGithub
go

create table Users(
Id nvarchar(20) primary key,
Password nvarchar(50),
Fullname nvarchar(50),
Email nvarchar(50),
Admin bit
);
go

CREATE TABLE Videos(
Id char(11) primary key,
Title nvarchar(50),
Poster nvarchar(50),
Description nvarchar(MAX),
Active bit,
Views int
);
go

create table Favorites(
Id bigint primary key not null,
VideoId char(11) null,
UserId nvachar(20) null,
LikeDate date null
foreign key (VideoId) references Videos(Id),
foreign key (UserId) references Users(Id)
);