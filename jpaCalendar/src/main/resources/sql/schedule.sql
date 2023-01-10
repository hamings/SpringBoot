create table schedule(
    email VARCHAR(30) not NULL,
    id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(30) NULL,
    date  VARCHAR(30) NULL,
    CONSTRAINT fk_schedule_user
    FOREIGN KEY (email) REFERENCES schedule_user (email),
    PRIMARY KEY (id)

)