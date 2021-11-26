CREATE TABLE CompetitionUser (
  competition_id int NOT NULL,
  username varchar(32) NOT NULL,

  CONSTRAINT fk_competition_id FOREIGN KEY(competition_id) REFERENCES Competition(id),
  CONSTRAINT fk_username FOREIGN KEY(username) REFERENCES RaulUser(username)
);