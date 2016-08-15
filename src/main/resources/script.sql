CREATE TABLE status_type(

  id integer,
  name varchar2(15),

  constraint status_type_id PRIMARY KEY (id)

);

INSERT into status_type
       (id, name)
values (1, 'Создан');

commit;

INSERT into status_type
(id, name)
values (2, 'Назначен');

commit;

INSERT into status_type
(id, name)
values (3, 'Исполнен');

COMMIT;

INSERT into status_type
(id, name)
values (4, 'Отменен');

commit;

INSERT into status_type
(id, name)
values (5, 'Просрочен');

COMMIT;

CREATE TABLE  orders (

  id NUMERIC PRIMARY KEY,
  create_date TIMESTAMP NOT NULL ,
  close_date TIMESTAMP,
  consumer_ID NUMERIC NOT NULL ,
  driver_ID NUMERIC,
  address_from_ID NUMERIC NOT NULL ,
  address_to_ID NUMERIC NOT NULL ,
  is_Appointed BOOL,
  cost NUMERIC,
  status_ID INTEGER NOT NULL

);

CREATE TABLE history_status_changed(

  id NUMERIC PRIMARY KEY,
  order_id NUMERIC REFERENCES orders (id),
  changed_from_id INTEGER REFERENCES status_type (id),
  changed_to_id INTEGER REFERENCES status_type (id),
  changed_date TIMESTAMP

);

create table consumers (

  id NUMERIC PRIMARY KEY,
  name VARCHAR(150),
  document_ID NUMERIC

);

create table drivers (

  id NUMERIC PRIMARY KEY,
  name VARCHAR(100),
  vehicle_ID NUMERIC

);

create table vehicles (

  id NUMERIC PRIMARY KEY,
  name VARCHAR(100)

);

alter TABLE orders
add CONSTRAINT fk_consumer_id
FOREIGN KEY (consumer_id)
REFERENCES consumers (id);

alter TABLE orders
  add CONSTRAINT fk_driver_id
  FOREIGN KEY (driver_id)
  REFERENCES drivers (id);

alter TABLE orders
  add CONSTRAINT fk_status_id
  FOREIGN KEY (status_id)
  REFERENCES status_type (id);

alter TABLE drivers
add CONSTRAINT fk_vehicle_id
FOREIGN KEY (vehicle_id)
REFERENCES vehicles (id);