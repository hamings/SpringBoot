CREATE TABLE contact (
    id	int(11) NOT null AUTO_INCREMENT,
    name	varchar(20)	NULL,
    email	varchar(20)	NULL,
    phone	varchar(20)	NULL,
    message	varchar(100)	null,
    indate datetime NOT NULL DEFAULT current_timestamp(),
    PRIMARY KEY (id)
);

CREATE TABLE subscribe (
    email	varchar(20)	NOT null,
    indate datetime NOT NULL DEFAULT current_timestamp()
);