DROP TABLE IF EXISTS admin_user;

CREATE TABLE
    admin_user (
        id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'ID',
        username VARCHAR(50) NOT NULL COMMENT 'Username',
        password VARCHAR(255) NOT NULL COMMENT 'Hashed Password',
        email VARCHAR(100) NOT NULL COMMENT 'Email',
        created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Creation Time',
        updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Update Time',
        deleted TINYINT (1) NOT NULL DEFAULT 0 COMMENT 'Logical Deletion',
        PRIMARY KEY (id),
        UNIQUE KEY (username),
        UNIQUE KEY (email)
    );

DELETE FROM admin_user;