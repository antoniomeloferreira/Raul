CREATE TABLE Competition (
  id SERIAL PRIMARY KEY,
  edition int NOT NULL,
  name varchar(16) NOT NULL,
  is_over boolean NOT NULL DEFAULT false,
  winner_username varchar(16),
  competition_config_id int,
  season_id int NOT NULL,

  CONSTRAINT fk_competition_config_id FOREIGN KEY(competition_config_id) REFERENCES CompetitionConfig(id),
  CONSTRAINT fk_season_id FOREIGN KEY(season_id) REFERENCES Season(id)
);