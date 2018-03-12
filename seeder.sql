
use fad_db;

TRUNCATE fads;

INSERT INTO fads (title, description, img_url, isPasse, created_at, updated_at)
VALUES ("A Fad Title 1", "This is a fad description 1.", "http://via.placeholder.com/300x300", true, NOW(), NOW()),
("A Fad Title 2", "This is a fad description 2.", "http://via.placeholder.com/300x300", true, NOW(), NOW()),
("A Fad Title 3", "This is a fad description 3.", "http://via.placeholder.com/300x300", true, NOW(), NOW()),
("A Fad Title 4", "This is a fad description 4.", "http://via.placeholder.com/300x300", true, NOW(), NOW()),
("A Fad Title 5", "This is a fad description 5.", "http://via.placeholder.com/300x300", true, NOW(), NOW());
