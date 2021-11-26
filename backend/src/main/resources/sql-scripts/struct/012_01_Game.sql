CREATE TABLE Game (
  id SERIAL PRIMARY KEY,
  home_user varchar(32),
  away_user varchar(32),
  home_team varchar(32),
  away_team varchar(32),
  home_score varchar(32),
  away_score varchar(32),
  competition_id int,

    CONSTRAINT fk_home_user FOREIGN KEY(home_user) REFERENCES RaulUser(username),
    CONSTRAINT fk_away_user FOREIGN KEY(away_user) REFERENCES RaulUser(username),
    CONSTRAINT fk_home_team FOREIGN KEY(home_team) REFERENCES Team(full_name),
	CONSTRAINT fk_away_team FOREIGN KEY(away_team) REFERENCES Team(full_name),
    CONSTRAINT competition_id FOREIGN KEY(competition_id) REFERENCES Competition(id)
);
