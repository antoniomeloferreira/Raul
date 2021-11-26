CREATE TABLE TeamRank (
  universe_id int NOT NULL,
  team_name varchar(32) NOT NULL,
  ranking int NOT NULL,
  is_default boolean NOT NULL,

  CONSTRAINT fk_universe_id FOREIGN KEY(universe_id) REFERENCES Universe(id),
  CONSTRAINT fk_team_name FOREIGN KEY(team_name) REFERENCES Team(full_name)
);