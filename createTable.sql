


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

INSERT INTO news (id, title, author, content) values
                                                (1, 'Tencent Create new products in field of finance', 'Liz Jar', 'Dummy1'),
                                                (2, 'Microsoft moves business out of certain region', 'Beth Tank', 'Dummy2'),
                                                (3, 'NTT collaborates with Softbank in field of IoT', 'NTT news', 'Dummy3'),
                                                (4, 'Software companies giving up data protection right', 'Nikkei news', 'Dummy4');


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


INSERT INTO comment (uid, nid, id, content) values
                                                  (1, 1, 1, 'Big News Coming 1'),
                                                  (1, 2, 2, 'Big News Coming 2'),
                                                  (2, 2, 3, 'Big News Coming 3'),
                                                  (3, 2, 4, 'Big News Coming 4');


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

INSERT INTO ad (id, title, investor, content) values
                                                  (1, 'Buy Luna', 'Macau Casino 1', 'Dummy1'),
                                                  (2, 'Buy Shiba', 'Macau Casino 2', 'Dummy2'),
                                                  (3, 'Buy Doge', 'Macau Casino 3 Royal', 'Dummy3'),
                                                  (4, 'Buy TSLA Stock', 'Macau Casino 4 Platinum', 'Dummy4');
