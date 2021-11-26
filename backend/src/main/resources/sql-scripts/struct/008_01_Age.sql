CREATE TABLE Age (
  id SERIAL PRIMARY KEY,
  age_counter int NOT NULL,
  universe_id int NOT NULL,

  CONSTRAINT fk_universe_id FOREIGN KEY(universe_id) REFERENCES Universe(id)
);