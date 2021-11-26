CREATE TABLE Team (
  full_name varchar(64) PRIMARY KEY,
  initials varchar(30),
  is_national_team boolean,
  country_name varchar(255),

  CONSTRAINT fk_country FOREIGN KEY(country_name) REFERENCES Country(name)
);