DROP TABLE IF EXISTS reservations;

CREATE TABLE reservations (
  reservation_id    VARCHAR(100) PRIMARY KEY NOT NULL,
  room_id  		    TEXT NOT NULL,
  guest_id      	TEXT NOT NULL,
  start_date      	TIMESTAMP NOT NULL,
  end_date       	TIMESTAMP NOT NULL,
  comment           VARCHAR(100));


INSERT INTO reservations (reservation_id,  room_id, guest_id, start_date, end_date, comment)
VALUES ('reservation01', 'room01', 'guest01',NOW(), NOW() + interval '2' day, 'Comment 1');