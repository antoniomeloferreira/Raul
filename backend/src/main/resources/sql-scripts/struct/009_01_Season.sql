CREATE TABLE Season (
  id SERIAL PRIMARY KEY,
  season_counter int,
  age_id int,

  CONSTRAINT fk_age_id FOREIGN KEY(age_id) REFERENCES Age(id)
);