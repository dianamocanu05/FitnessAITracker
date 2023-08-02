USE fitness_database;

CREATE TABLE users(
	id int PRIMARY KEY,
    email VARCHAR(256),
    name VARCHAR(256),
    password VARCHAR(256),
    age int,
    weight DECIMAL,
    height DECIMAL,
    fitness_goal VARCHAR(256)
);

CREATE TABLE health_data_entries(
	id int,
    user_id int,
    date datetime,
    calorie_intake int,
    exercise_duration int,
    steps_walked int,
    heart_rate int,
    hours_slept int,
    weight DECIMAL,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE exercise_recommendations(
	id int,
    user_id int,
    exercise VARCHAR(256),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE auth_tokens(
	id int,
    user_id int,
    token VARCHAR(512),
    expiration_date datetime,
	FOREIGN KEY (user_id) REFERENCES users(id)
);
