CREATE TABLE payment (
    id	int(11) NOT null AUTO_INCREMENT,
    email	varchar(20)	NOT NULL,
    amount	int(12)	NULL,
    uid	varchar(50)	NULL,
    indate datetime NOT NULL DEFAULT current_timestamp(),
    PRIMARY KEY (id)
);