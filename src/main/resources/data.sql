-- Insertar datos en la tabla circuitos
INSERT INTO circuitos (nombre, localidad) VALUES
('Circuito de Jerez', 'Jerez'),
('Circuito de Cataluña', 'Cataluña');

-- Insertar datos en la tabla pilotos
INSERT INTO pilotos (nombre, conduccion) VALUES
('Piloto 1', 'AGRESIVA'),
('Piloto 2', 'PASIVA');
('Piloto 2', 'TEMERARIA');

-- Insertar datos en la tabla carreras
INSERT INTO carreras (temporada, posicion, piloto_id, circuito_id) VALUES
('2023', 1, 1, 1),
('2023', 2, 2, 1),
('2023', 3, 1, 2),
('2023', 4, 2, 2);