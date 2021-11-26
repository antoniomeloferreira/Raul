CREATE TABLE Season (
  id SERIAL PRIMARY KEY,
  season_counter int NOT NULL,
  age_id int NOT NULL,

  CONSTRAINT fk_age_id FOREIGN KEY(age_id) REFERENCES Age(id)
);