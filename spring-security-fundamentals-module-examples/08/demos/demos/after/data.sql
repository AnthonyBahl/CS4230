{\rtf1\ansi\ansicpg1252\cocoartf1561\cocoasubrtf610
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 CREATE TABLE users (\
  username VARCHAR(50) NOT NULL,\
  password VARCHAR(100) NOT NULL,\
  enabled TINYINT NOT NULL DEFAULT 1,\
  PRIMARY KEY (username)\
);\
\
CREATE TABLE authorities (\
  username VARCHAR(50) NOT NULL,\
  authority VARCHAR(50) NOT NULL,\
  FOREIGN KEY (username) REFERENCES users(username)\
);\
\
\
CREATE TABLE accounts (\
  username VARCHAR(50) NOT NULL,\
  password VARCHAR(100) NOT NULL,\
  email VARCHAR(100) NOT NULL,\
  firstname VARCHAR(50) NOT NULL,\
  lastname VARCHAR(50) NOT NULL,\
  PRIMARY KEY (username)\
);\
\
CREATE TABLE verification_tokens (\
  username VARCHAR(50) NOT NULL,\
  token VARCHAR(100) NOT NULL,\
  expiry_date DATETIME NOT NULL,\
  PRIMARY KEY (username, token)\
 );\
\
select * from accounts;\
select * from verification_tokens;\
delete from accounts where username = 'asdf';\
delete from verification_tokens where username = 'zxcv';\
\
commit;}