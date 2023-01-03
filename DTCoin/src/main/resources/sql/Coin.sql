CREATE TABLE buy (
    id	int(11) NOT null AUTO_INCREMENT,
    email	varchar(20)	NOT NULL,
    coinId	varchar(30)	NULL,
    name	varchar(30)	NULL,
    price	DECIMAL(20,8)	NULL,
    amount	int(20)	NULL,
    total	DECIMAL(20,8)	NULL,
    indate	datetime NOT NULL DEFAULT current_timestamp(),
    PRIMARY KEY (id),
    CONSTRAINT fk_buy
    FOREIGN KEY (email) REFERENCES member (email)
);