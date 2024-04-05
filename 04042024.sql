SELECT * FROM autores;
SELECT * FROM editorial;
SELECT * FROM genero;
SELECT * FROM libros;
SELECT * FROM prestamos;
SELECT * FROM usuarios;

SELECT
    libros.titulo,
    libros.fechapublicacion,
    autores.nombre,
    autores.apellido,
    editorial.nombreeditorial,
    genero.nombregenero
FROM libros
INNER JOIN autores ON libros.idautor = autores.idautor
INNER JOIN editorial ON libros.ideditorial = editorial.ideditorial
INNER JOIN genero ON libros.idgenero = genero.idgenero;

SELECT 
    l.titulo,
    p.idusuario,
    us.nombre,
    us.direccion,
    p.fechaprestamo,
    p.fechadevolucion,
    p.estado
FROM prestamos p
INNER JOIN libros l ON p.idlibro = l.idlibro
inner join usuarios us ON p.idusuario = us.idusuario;

SELECT * FROM autores;