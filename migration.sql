# fads
#
# id, int, PK
# title, VARCHAR(255)
# description, TEXT
# img_url, VARCHAR(255)
# isPasse, boolean
# created_at, DATETIME
# updated_at, DATETIME

create DATABASE IF NOT EXISTS fad_db;

USE fad_db;

DROP TABLE IF EXISTS fads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (

  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(120) NOT NULL,
  email VARCHAR(120) NOT NULL UNIQUE,
  password VARCHAR(120) NOT NULL,
  created_at DATETIME,
  updated_at DATETIME,
  PRIMARY KEY (id)

);

CREATE TABLE fads (

  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  title VARCHAR(255) NOT NULL,
  description TEXT,
  img_url VARCHAR(2083) DEFAULT 'http://via.placeholder.com/300x300',
  passe BOOLEAN,
  created_at DATETIME,
  updated_at DATETIME,
  user_id INT UNSIGNED NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE

);

