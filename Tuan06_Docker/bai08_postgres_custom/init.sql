CREATE DATABASE mydatabase;

\c mydatabase;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);

INSERT INTO users (username, email)
VALUES ('chaan', 'chaan@example.com'),
       ('admin', 'admin@example.com');
