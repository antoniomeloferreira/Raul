CREATE TABLE TeamRank (
  competition_id int,
  team_name varchar(32),
  ranking int,

  CONSTRAINT fk_competition_id FOREIGN KEY(competition_id) REFERENCES Competition(id),
  CONSTRAINT fk_team_name FOREIGN KEY(team_name) REFERENCES Team(full_name)
);