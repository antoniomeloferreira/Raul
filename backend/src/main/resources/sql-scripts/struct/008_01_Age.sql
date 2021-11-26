CREATE TABLE Age (
  id SERIAL PRIMARY KEY,
  age_counter int,
  universe_id int,

  CONSTRAINT fk_universe_id FOREIGN KEY(universe_id) REFERENCES Universe(id)
);