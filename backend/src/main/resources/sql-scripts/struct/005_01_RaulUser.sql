CREATE TABLE RaulUser (
  username varchar(16) PRIMARY KEY,
  name varchar(32) NOT NULL,
  password_hash varchar(256) NOT NULL,
  salt varchar(256) NOT NULL
);