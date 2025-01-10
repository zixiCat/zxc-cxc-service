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