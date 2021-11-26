CREATE TABLE goal (
    id SERIAL PRIMARY KEY,
    scorer varchar(32),
    minute int,
    game_id int,

    CONSTRAINT fk_game_id FOREIGN KEY(game_id) REFERENCES Game(id)
)