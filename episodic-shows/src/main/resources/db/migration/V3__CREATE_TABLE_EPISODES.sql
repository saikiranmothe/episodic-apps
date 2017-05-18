CREATE TABLE episodes (
     id BIGINT NOT NULL AUTO_INCREMENT,
     season_number INTEGER NOT NULL,
     episode_number INTEGER NOT NULL,
     show_id BIGINT NOT NULL,
     PRIMARY KEY (id),
     FOREIGN KEY (show_id)
        REFERENCES shows(id)
);