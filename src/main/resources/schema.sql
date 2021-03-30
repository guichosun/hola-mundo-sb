DROP TABLE IF EXISTS message;

CREATE TABLE message (
  msg_id INT NOT NULL PRIMARY KEY,
  msg_name VARCHAR(256)
);


insert into message (msg_id, msg_name) values (0, 'Hola desde la bd',)
insert into message (msg_id, msg_name) values (1, 'Hola es el mensaje 1 desde la bd',)
insert into message (msg_id, msg_name) values (2, 'El mensaje de hola en 2 desde la bd',)
insert into message (msg_id, msg_name) values (3, 'Desde la bd es el mensaje 3',)
