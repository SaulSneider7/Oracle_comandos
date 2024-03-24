-- insertando datos para los autores
INSERT INTO autores VALUES (1, 'Mario', 'Vargas Llosa', 'Peru');
INSERT INTO autores VALUES (2, 'Gabriel', 'García Márquez', 'Colombia');
INSERT INTO autores VALUES (3, 'Julio', 'Cortázar', 'Argentina');
INSERT INTO autores VALUES (4, 'Isabel', 'Allende', 'Chile');
INSERT INTO autores VALUES (5, 'Pablo', 'Neruda', 'Chile');
INSERT INTO autores VALUES (6, 'Jorge', 'Borges', 'Argentina');
INSERT INTO autores VALUES (7, 'Gabriela', 'Mistral', 'Chile');
INSERT INTO autores VALUES (8, 'Miguel de', 'Cervantes', 'España');
INSERT INTO autores VALUES (9, 'Octavio', 'Paz', 'México');
INSERT INTO autores VALUES (10, 'Horacio', 'Quiroga', 'Argentina');
INSERT INTO autores VALUES (11, 'Pablo', 'Picasso', 'España');

select * from autores;

-- insertando datos para la editorial
INSERT INTO editorial VALUES (1, 'Lumbreras');
INSERT INTO editorial VALUES (2, 'Alfaguara');
INSERT INTO editorial VALUES (3, 'Anagrama');
INSERT INTO editorial VALUES (4, 'Planeta');
INSERT INTO editorial VALUES (5, 'Santillana');
INSERT INTO editorial VALUES (6, 'Fondo de Cultura Económica');

select * from editorial;

-- insertando datos a generos
INSERT INTO genero VALUES (1, 'Drama');
INSERT INTO genero VALUES (2, 'Novela');
INSERT INTO genero VALUES (3, 'Ciencia Ficción');
INSERT INTO genero VALUES (4, 'Fantasía');
INSERT INTO genero VALUES (5, 'Política');
INSERT INTO genero VALUES (6, 'Economía');
INSERT INTO genero VALUES (7, 'Poesía');
INSERT INTO genero VALUES (8, 'Teatro');

SELECT * FROM genero;

--INSERTANDO DATOS A LIBROS
INSERT INTO LIBROS (IDLIBRO, TITULO, FECHAPUBLICACION,IDAUTOR,IDEDITORIAL,IDGENERO) VALUES (1, 'Cien años de soledad', TO_DATE('1967-05-30', 'YYYY-MM-DD'), 1, 1, 1);
INSERT INTO libros VALUES (2, 'Rayuela', TO_DATE('1963-06-01', 'YYYY-MM-DD'), 3, 2, 1);
INSERT INTO libros VALUES (3, 'La casa de los espíritus', TO_DATE('1982-06-11', 'YYYY-MM-DD'), 4, 3, 1);
INSERT INTO libros VALUES (4, 'Cien años de soledad', TO_DATE('1967-05-30', 'YYYY-MM-DD'), 2, 1, 2);
INSERT INTO libros VALUES (5, 'El amor en los tiempos del cólera', TO_DATE('1985-11-06', 'YYYY-MM-DD'), 2, 1, 3);

SELECT * FROM LIBROS;

-- INSERTANDO DATOS A USUARIOS
INSERT INTO usuarios (IDUSUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, SEXO) 
VALUES (1, 'Juan', 'Pérez', 'Calle 123', '123456789', 'M');

INSERT INTO usuarios (IDUSUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, SEXO) 
VALUES (2, 'María', 'López', 'Avenida 456', '987654321', 'F');

INSERT INTO usuarios (IDUSUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, SEXO) 
VALUES (3, 'Carlos', 'González', 'Plaza Principal', '456789123', 'M');


--INSERTANDO DATOS A PRESTAMOS
DESCRIBE PRESTAMOS;
INSERT INTO prestamos (IDPRESTAMO, IDLIBRO, IDUSUARIO, FECHAPRESTAMO, FECHADEVOLUCION, ESTADO) 
VALUES (1, 2, 3, TO_DATE('2024-03-13', 'YYYY-MM-DD'), TO_DATE('2024-03-27', 'YYYY-MM-DD'), 'Pendiente');

INSERT INTO prestamos (IDPRESTAMO, IDLIBRO, IDUSUARIO, FECHAPRESTAMO, FECHADEVOLUCION, ESTADO) 
VALUES (2, 3, 3, TO_DATE('2024-03-14', 'YYYY-MM-DD'), TO_DATE('2024-03-28', 'YYYY-MM-DD'), 'Pendiente');

INSERT INTO prestamos (IDPRESTAMO, IDLIBRO, IDUSUARIO, FECHAPRESTAMO, FECHADEVOLUCION, ESTADO) 
VALUES (3, 2, 1, TO_DATE('2024-03-15', 'YYYY-MM-DD'), TO_DATE('2024-03-29', 'YYYY-MM-DD'), 'Pendiente');


