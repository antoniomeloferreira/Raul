CREATE TABLE Country (
  name varchar(64) PRIMARY KEY,
  continent_name varchar(16) NOT NULL,

  CONSTRAINT fk_continent FOREIGN KEY(continent_name) REFERENCES Continent(name)
);