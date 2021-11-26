CREATE TABLE Player (
  name varchar(32) PRIMARY KEY,
  team_full_name varchar(64),
  nationality varchar(32),

  CONSTRAINT fk_team_name FOREIGN KEY(team_full_name) REFERENCES Team(full_name),
  CONSTRAINT fk_nationality FOREIGN KEY(nationality) REFERENCES Country(name)
);