CREATE TABLE member (
    email	varchar(20)	NOT NULL,
    password	varchar(50)	NULL,
    name	varchar(20)	NULL,
    phone	varchar(20)	NULL,
    address	varchar(50)	NULL,
    detail	varchar(50)	null,
    indate datetime NOT NULL DEFAULT current_timestamp(),
    PRIMARY KEY (email)
);