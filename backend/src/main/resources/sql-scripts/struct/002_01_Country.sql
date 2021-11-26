CREATE TABLE Country (
  name varchar(32) PRIMARY KEY,
  continent_name varchar(16),

  CONSTRAINT fk_continent FOREIGN KEY(continent_name) REFERENCES Continent(name)
);