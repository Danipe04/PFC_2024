INSERT INTO ROL (NOMBRE_ROL) VALUES ("ADMINISTRADOR");
INSERT INTO ROL (NOMBRE_ROL) VALUES ("COCINERO");
INSERT INTO ROL (NOMBRE_ROL) VALUES ("CAMARERO");
INSERT INTO USUARIO (NOMBRE_USUARIO, APELLIDOS_USUARIO, CONTRASENA) VALUES ("David", "Suarez", "dc5f2880cd6f8a8763e58fc0821338b02681029db7ad36e5f380e1ca4f76fa2e");
INSERT INTO USUARIO (NOMBRE_USUARIO, APELLIDOS_USUARIO, CONTRASENA) VALUES ("Jorge", "Perez", "dc5f2880cd6f8a8763e58fc0821338b02681029db7ad36e5f380e1ca4f76fa2e");
INSERT INTO USUARIO (NOMBRE_USUARIO, APELLIDOS_USUARIO, CONTRASENA) VALUES ("Angel", "Fernandez", "dc5f2880cd6f8a8763e58fc0821338b02681029db7ad36e5f380e1ca4f76fa2e");
INSERT INTO COMIDA (NOMBRE_COMIDA) VALUES ("Macarrones a la bolognesa");
INSERT INTO COMIDA (NOMBRE_COMIDA) VALUES ("Pizza cuatro quesos");
INSERT INTO COMIDA (NOMBRE_COMIDA) VALUES ("Espaguetti a la carbonara");
INSERT INTO BEBIDA (NOMBRE_BEBIDA) VALUES ("Coca-Cola");
INSERT INTO BEBIDA (NOMBRE_BEBIDA) VALUES ("Fanta");
INSERT INTO BEBIDA (NOMBRE_BEBIDA) VALUES ("Trina");
INSERT INTO POSTRE (NOMBRE_POSTRE) VALUES ("Tiramisu");
INSERT INTO POSTRE (NOMBRE_POSTRE) VALUES ("Filloas");
INSERT INTO POSTRE (NOMBRE_POSTRE) VALUES ("Helado");
INSERT INTO POSEER (ID_ROL, ID_USUARIO) VALUES (1, 1);
INSERT INTO POSEER (ID_ROL, ID_USUARIO) VALUES (2, 3);
INSERT INTO POSEER (ID_ROL, ID_USUARIO) VALUES (3, 3);