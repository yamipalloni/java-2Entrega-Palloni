DROP TABLE CLIENTE IF EXISTS;

CREATE TABLE CLIENTE (
id INT autoincrement PRIMARY KEY,
nombre VARCHAR(75) NOT NULL,
apellido VARCHAR(75) NOT NULL,
dni VARCHAR(11),
);

DROP TABLE PRODUCTOS IF EXISTS;

CREATE TABLE PRODUCTOS (
id INT autoincrement PRIMARY KEY,
descripcion VARCHAR(150) NOT NULL,
code VARCHAR(50),
stock INT,
precio DOUBLE,
);

DROP TABLE VENTAS IF EXISTS;

CREATE TABLE VENTAS (
id INT autoincrement PRIMARY KEY,
cliente_id INT FOREIGN KEY (id),
created_at DATE TIME,
total DOUBLE,
)

CREATE TABLE VENTAS_DETALLE (
ventas_id INT FOREIGN KEY (id),
ventas_detalle_id INT autoincrement PRIMARY KEY,
cantidad INT,
producto_id INT,
precio DOUBLE,
)


