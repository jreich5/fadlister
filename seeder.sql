
use fad_db;

TRUNCATE fads;

INSERT INTO fads (title, description, img_url, isPasse, created_at, updated_at)
VALUES ('A Fad Title 1', 'This is a fad description 1.', 'http://via.placeholder.com/300x300', true, NOW(), NOW()),
('A Fad Title 2', 'This is a fad description 2.', 'http://via.placeholder.com/300x300', true, NOW(), NOW()),
('A Fad Title 3', 'This is a fad description 3.', 'http://via.placeholder.com/300x300', true, NOW(), NOW()),
('A Fad Title 4', 'This is a fad description 4.', 'http://via.placeholder.com/300x300', true, NOW(), NOW()),
('A Fad Title 5', 'This is a fad description 5.', 'http://via.placeholder.com/300x300', true, NOW(), NOW());


TRUNCATE users;

INSERT INTO users (name, email, password, created_at, updated_at)
VALUES ('Bobby Bobberson', 'bobby@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Sally Smith', 'sally@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Walter White', 'walter@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Skylar White', 'skylar@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW()),
  ('Gus Fring', 'gus@email.com', '$2a$12$hMBHftmWPtdIWrgX1My8Wuhz9wrZULG5MrqmoVwCSBH24t/DDlPNS', NOW(), NOW());




# Testing

SELECT * FROM users;

SELECT * FROM fads;


SELECT * FROM users WHERE email = 'bobby@email.com';