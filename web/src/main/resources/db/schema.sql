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
    )