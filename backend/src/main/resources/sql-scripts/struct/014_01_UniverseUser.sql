CREATE TABLE UniverseUser (
  universe_id int NOT NULL,
  username varchar(32) NOT NULL,

  CONSTRAINT fk_universe_id FOREIGN KEY(universe_id) REFERENCES Universe(id),
  CONSTRAINT fk_username FOREIGN KEY(username) REFERENCES RaulUser(username)
);