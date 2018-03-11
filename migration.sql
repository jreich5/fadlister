# fads
#
# id, int, PK
# title, VARCHAR(255)
# description, TEXT
# img_url, VARCHAR(255)
# isPasse, boolean
# created_at, DATETIME
# updated_at, DATETIME

USE fad_db;

DROP TABLE IF EXISTS fads;

CREATE TABLE fads (

  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  title VARCHAR(255) NOT NULL,
  description TEXT,
  img_url VARCHAR(2083) DEFAULT 'http://via.placeholder.com/300x300',
  isPasse BOOLEAN,
  created_at DATETIME,
  updated_at DATETIME,
  PRIMARY KEY (id)

);