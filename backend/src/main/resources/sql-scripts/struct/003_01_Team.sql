CREATE TABLE Team (
  full_name varchar(64) PRIMARY KEY,
  initials varchar(30) NOT NULL,
  is_national_team boolean NOT NULL,
  country_name varchar(64) NOT NULL,

  CONSTRAINT fk_country FOREIGN KEY(country_name) REFERENCES Country(name)
);