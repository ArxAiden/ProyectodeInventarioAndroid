CREATE DATABASE invData
USE invData

CREATE TABLE Usuario (
id_usuario INT PRIMARY KEY NOT NULL,
nombre_usuario VARCHAR(MAX) NOT NULL,
correo_usuario VARCHAR(MAX) NOT NULL,
contraseña_usuario VARBINARY(MAX) NOT NULL,
rut_usuario VARCHAR(15) NOT NULL
)

CREATE TABLE Productos (
id_producto INT PRIMARY KEY NOT NULL,
id_usuario INT FOREIGN KEY REFERENCES Usuario(id_usuario),
nombre_producto VARCHAR(MAX) NOT NULL,
precio_producto INT NOT NULL,
marca_producto VARCHAR(MAX) NOT NULL,
categoria_producto VARCHAR(MAX) NOT NULL,
descripcion_producto VARCHAR(MAX) NOT NULL,
stock_producto INT NOT NULL
)

CREATE TABLE Orden (
id_orden INT PRIMARY KEY NOT NULL,
id_producto INT FOREIGN KEY REFERENCES Productos(id_producto),
id_usuario INT FOREIGN KEY REFERENCES Usuario(id_usuario),
nombre_orden VARCHAR(MAX) NOT NULL,
fecha_orden DATE NOT NULL,
)