CREATE DATABASE RESTAURANTE;
USE RESTAURANTE;
CREATE TABLE ROL (
    ID_ROL int IDENTITY(1, 1),
    NOMBRE_ROL VARCHAR(255),
    PRIMARY KEY (ID_ROL)
);
CREATE TABLE USUARIO (
    ID_USUARIO INT IDENTITY(1, 1),
    NOMBRE_USUARIO VARCHAR(255),
    APELLIDOS_USUARIO VARCHAR(255)
    PRIMARY KEY (ID_USUARIO)
);
CREATE TABLE TICKET (
    ID_TICKET INT IDENTITY(1, 1),
    MESA VARCHAR(255),
    PRIMARY KEY (ID_TICKET)
);
CREATE TABLE POSTRE (
    ID_POSTRE INT IDENTITY(1, 1),
    NOMBRE_POSTRE VARCHAR(255)
    PRIMARY KEY (ID_POSTRE),
);
CREATE TABLE COMIDA (
    ID_COMIDA INT IDENTITY(1, 1),
    NOMBRE_COMIDA VARCHAR(255),
    PRIMARY KEY (ID_COMIDA)
);
CREATE TABLE BEBIDA (
    ID_BEBIDA INT IDENTITY(1, 1),
    NOMBRE_BEBIDA VARCHAR(255),
    PRIMARY KEY (ID_BEBIDA)
);
CREATE TABLE POSEER (
    ID_ROL INT,
    ID_USUARIO INT,
    FOREIGN KEY (ID_ROL) REFERENCES ROL(ID_ROL),
    PRIMARY KEY (ID_ROL, ID_USUARIO)
);
CREATE TABLE CREAR (
    ID_TICKET INT,
    ID_USUARIO INT,
    FOREIGN KEY (ID_TICKET) REFERENCES TICKET(ID_TICKET),
    FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID_USUARIO),
    PRIMARY KEY (ID_TICKET, ID_USUARIO)
);
CREATE TABLE CONTENER (
    ID_TICKET INT,
    ID_POSTRE INT,
    NUMP_PEDIDO INT,
    NUMP_ENTREGADO INT,
    FOREIGN KEY (ID_TICKET) REFERENCES TICKET(ID_TICKET),
    FOREIGN KEY (ID_POSTRE) REFERENCES POSTRE(ID_POSTRE),
    PRIMARY KEY (ID_TICKET, ID_POSTRE)
);
CREATE TABLE INCLUIR (
    ID_TICKET INT,
    ID_BEBIDA INT,
    NUMB_PEDIDO INT,
    NUMB_ENTREGADO INT,
    FOREIGN KEY (ID_TICKET) REFERENCES TICKET(ID_TICKET),
    FOREIGN KEY (ID_BEBIDA) REFERENCES BEBIDA(ID_BEBIDA),
    PRIMARY KEY (ID_TICKET, ID_BEBIDA)
);
CREATE TABLE TENER (
    ID_TICKET INT,
    ID_COMIDA INT,
    NUMC_PEDIDO INT,
    NUMC_ENTREGADO INT,
    FOREIGN KEY (ID_TICKET) REFERENCES TICKET(ID_TICKET),
    FOREIGN KEY (ID_COMIDA) REFERENCES COMIDA(ID_COMIDA),
    PRIMARY KEY (ID_TICKET, ID_COMIDA)
);