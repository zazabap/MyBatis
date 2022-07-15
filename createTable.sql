


/*
+---------------------+-------------+------+-----+---------+----------------+
| Field               | Type        | Null | Key | Default | Extra          |
+---------------------+-------------+------+-----+---------+----------------+
| user_id             | int         | NO   | PRI | NULL    | auto_increment |
| user_phone          | text        | YES  |     | NULL    |                |
| user_avatar         | text        | YES  |     | NULL    |                |
| user_name           | text        | YES  |     | NULL    |                |
| user_email          | varchar(50) | YES  |     | NULL    |                |
| user_password       | varchar(50) | YES  |     | NULL    |                |
| user_favorite       | int         | YES  |     | NULL    |                |
| user_bias           | int         | YES  |     | NULL    |                |
| user_history_browse | int         | YES  |     | NULL    |                |
| user_history_review | int         | YES  |     | NULL    |                |
| user_last_login     | datetime    | YES  |     | NULL    |                |
+---------------------+-------------+------+-----+---------+----------------+
*/

CREATE TABLE `user`(
    `id` bigint(20) NOT NULL COMMENT 'Primary',
    `phone` varchar(20),
    `avatar` text,
    `name` varchar(30) DEFAULT NULL COMMENT 'name',
    `email` varchar(50) DEFAULT NULL COMMENT 'email',
    `password` varchar(50) DEFAULT NULL COMMENT 'pwd',
    `favorite` INT,
    `bias` INT,
    `history_browse` INT,
    `history_review` INT,
    `last_login` DATETIME,
    PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (id, name, email, password) values
(1, 'Liz', 'Liz@gg.com', '123456'),
(2, 'Beth', 'Beth@ms.com', '123456'),
(3, 'Anna', 'Anna@fb.com', '123456'),
(4, 'Bell', 'Bell@ibm.com', '123456');

GRANT ALL ON mybatis.* TO 'user'@'localhost';

CREATE TABLE news(
    id INT NOT NULL COMMENT 'Primary',
    title VARCHAR(200) NOT NULL,
    cover_pic LONGBLOB,
    datetime DATETIME,
    author VARCHAR(40) NOT NULL,
    content text NOT NULL,
    hit_vol INT,
    favorite_vol INT,
    forward_vol INT,
    paid_flag tinyint(1),
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE comment(
    uid INT,
    nid INT,
    id INT not null COMMENT 'Primary',
    content text,
    datetime datetime,
    upvote INT,
    downvote INT,
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE ad(
    id INT NOT NULL COMMENT 'Primary',
    title VARCHAR(200) NOT NULL,
    content text,
    pic_hyperlink VARCHAR(400),
    position_x DOUBLE(20,5),
    position_y DOUBLE(20,5),
    investor VARCHAR(200) NOT NULL,
    datetime datetime,
    region  VARCHAR(200),
    device  VARCHAR(200),
    hit INT,
    weight  DOUBLE(20,5),
    PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


