CREATE TABLE RaulUser (
  username varchar(16) PRIMARY KEY,
  name varchar(32),
  password_hash varchar(256),
  salt varchar(256)
);