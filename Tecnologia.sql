-- INNER JOIN
SELECT pedidos.id_pedido, clientes.nombre
FROM pedidos
INNER JOIN clientes ON pedidos.id_cliente = clientes.id_cliente;

-- LEFT JOIN
SELECT departamentos.nombre AS departamento, empleados.nombre AS empleado
FROM departamentos
LEFT JOIN empleados ON departamentos.id_departamento = empleados.id_departamento;


-- RIGHT JOIN
SELECT departamentos.nombre AS departamento, empleados.nombre AS empleado
FROM empleados
RIGHT JOIN departamentos ON empleados.id_departamento = departamentos.id_departamento;

-- FULL JOIN
SELECT departamentos.nombre AS departamento, empleados.nombre AS empleado
FROM empleados
FULL JOIN departamentos ON empleados.id_departamento = departamentos.id_departamento;


-- STORED PROCEDURES
CREATE OR REPLACE PROCEDURE calcular_salario(
    in_employee_id IN NUMBER,
    out_salary OUT NUMBER
) AS
BEGIN
    SELECT salario INTO out_salary FROM empleados WHERE id_empleado = in_employee_id;
    -- Cálculo adicional o lógica de negocio
    -- Puede incluir actualizaciones, inserciones o cualquier otra lógica necesaria
END;


--VIEW
CREATE VIEW nombre_vista 
AS
    SELECT columnas
    FROM tablas
    WHERE condiciones;

--VISTA CON INNER JOIN
CREATE VIEW vista_empleados_departamentos 
AS
    SELECT e.nombre AS nombre_empleado, e.salario, d.nombre AS nombre_departamento
    FROM empleados e
    INNER JOIN departamentos d ON e.id_departamento = d.id_departamento;

-- LLAMAR VISTA
SELECT * FROM vista_empleados_departamentos