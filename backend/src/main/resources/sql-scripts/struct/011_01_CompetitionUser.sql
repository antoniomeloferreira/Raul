CREATE TABLE CompetitionUser (
  competition_id int,
  username varchar(32),

  CONSTRAINT fk_competition_id FOREIGN KEY(competition_id) REFERENCES Competition(id),
  CONSTRAINT fk_username FOREIGN KEY(username) REFERENCES RaulUser(username)
);