CREATE TABLE  transportDB.orders (

  id NUMERIC PRIMARY KEY,
  create_date TIMESTAMP NOT NULL,
  close_date DATETIME,
  consumer_ID NUMERIC NOT NULL ,
  driver_ID NUMERIC,
  address_from_ID NUMERIC NOT NULL ,
  address_to_ID NUMERIC NOT NULL ,
  is_Appointed BOOL,
  cost NUMERIC,
  status_ID INTEGER NOT NULL

);

CREATE TABLE transportDB.history_status_changed(

  id NUMERIC PRIMARY KEY,
  order_id NUMERIC REFERENCES orders (id),
  changed_from_id INTEGER REFERENCES status_type (id),
  changed_to_id INTEGER REFERENCES status_type (id),
  changed_date TIMESTAMP

);

create table transportDB.consumers (

  id NUMERIC PRIMARY KEY,
  name VARCHAR(150),
  document_ID NUMERIC

);

create table transportDB.drivers (

  id NUMERIC PRIMARY KEY,
  name VARCHAR(100),
  vehicle_ID NUMERIC

);

create table transportDB.vehicles (

  id NUMERIC PRIMARY KEY,
  name VARCHAR(100)

);

alter TABLE transportDB.orders
add CONSTRAINT fk_consumer_id
FOREIGN KEY (consumer_id)
REFERENCES transportDB.consumers (id);

alter TABLE transportDB.orders
  add CONSTRAINT fk_driver_id
  FOREIGN KEY (driver_id)
  REFERENCES transportDB.drivers (id);


alter TABLE transportDB.drivers
add CONSTRAINT fk_vehicle_id
FOREIGN KEY (vehicle_id)
REFERENCES transportDB.vehicles (id);