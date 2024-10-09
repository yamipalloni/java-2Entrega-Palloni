INSERT INTO CLIENTE (id, nombre, apellido, dni) values
(1, 'Juan', 'Perez', 12345678),
(2, 'Azucena', 'García', 23456789),
(3, 'Serafin' , 'Lopez', 345678901);

INSERT INTO PRODCUTOS (id, descripcion, code, stock, precio) values
(1, 'Vitamina D', 'Suplemento para prevenir la deficiencia de vitamina D', 1, 500, 18),
(2, 'Buenas Noches', 'Medicamento inductor del sueno', 2 , 2000, 20),
(3, 'Veg12', 'Suplemento para prevenir la deficineica de vitamina B12', 3 , 1200 , 20);

INSERT INTO VENTAS (id, cliente_id, created_at, total) values
(1,'Juan Perez', 1000, 5),
(2, 'Azucena Garcia', 3000, 5);
