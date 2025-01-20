DROP TABLE IF EXISTS home_page_info;

CREATE TABLE
    home_page_info (
        id BIGINT NOT NULL COMMENT 'ID',
        intro VARCHAR(30) NULL DEFAULT NULL COMMENT 'Intro',
        sub_intro VARCHAR(200) NULL DEFAULT NULL COMMENT 'Sub Intro',
        avatar VARCHAR(200) NULL DEFAULT NULL COMMENT 'Avatar',
        create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Creation Time',
        update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Update Time',
        deleted TINYINT (1) NOT NULL DEFAULT 0 COMMENT 'Logical Deletion',
        PRIMARY KEY (id)
    );

DELETE FROM home_page_info;

INSERT INTO
    home_page_info (id, intro, sub_intro, avatar, create_time, update_time, deleted)
VALUES
    (
        1,
        'Hello, World!',
        'Welcome to my blog.',
        'https://cdn.jsdelivr.net/gh/zhongzihao18/blog-pic/blog20210823124848.png',
        '2021-08-23 12:48:48',
        '2021-08-23 12:48:48',
        0
    ),
    (
        2,
        'Hello Again!',
        'Exploring tech and code.',
        'https://example.com/avatar2.png',
        '2024-01-10 09:00:00',
        '2024-01-10 09:00:00',
        0
    ),
    (
        3,
        'Welcome!',
        'Sharing development insights.',
        'https://example.com/avatar3.png',
        '2024-01-10 10:30:00',
        '2024-01-10 10:30:00',
        0
    );