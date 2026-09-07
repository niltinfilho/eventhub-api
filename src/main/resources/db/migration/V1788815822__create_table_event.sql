-- create_table_event

CREATE TABLE event (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    title VARCHAR(50) NOT NULL,
    description VARCHAR(150) NOT NULL,
    date TIMESTAMP NOT NULL,
    in_person BOOL NOT NULL,
    location VARCHAR(150) NULL,
    max_participants INT8 NULL
);