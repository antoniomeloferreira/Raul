CREATE TABLE CompetitionConfig (
  id SERIAL PRIMARY KEY,
  num_of_users int NOT NULL,
  num_of_rounds int NOT NULL,
  is_reverse boolean NOT NULL
);