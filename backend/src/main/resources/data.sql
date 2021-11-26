CREATE TABLE RaulUser (
    user_name varchar(200) PRIMARY KEY,
    name varchar(200)
);

CREATE table Competition (

	edition int serial PRIMARY KEY,
	name varchar(200),
	is_over BOOLEAN,
	winner_user_id varchar(200),
	number_of_games INT
);

CREATE table Game (

	ID int PRIMARY KEY,
	home_user varchar(200),
	away_user varchar(200),
	home_team varchar(200),
	away_team varchar(200),
	competition varchar(200)
);