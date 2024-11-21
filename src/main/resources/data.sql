-- Insertar datos en la tabla circuitos
INSERT INTO circuitos (nombre, localidad) VALUES
('Circuito de Jerez - Ángel Nieto', 'Jerez'),
('Circuito de Cataluña', 'Montmeló'),
('Circuito de Mugello', 'Mugello'),
('Circuito de Assen', 'Assen'),
('Circuito de Phillip Island', 'Phillip Island'),
('Circuito de Sepang', 'Sepang');

-- Insertar datos en la tabla pilotos
INSERT INTO pilotos (nombre, conduccion) VALUES
('Marc Márquez', 'AGRESIVA'),
('Fabio Quartararo', 'PASIVA'),
('Francesco Bagnaia', 'TEMERARIA'),
('Joan Mir', 'AGRESIVA'),
('Aleix Espargaró', 'TEMERARIA'),
('Enea Bastianini', 'TEMERARIA');

-- Insertar datos en la tabla carreras (2022 y 2023)
INSERT INTO carreras (temporada, posicion, piloto_id, circuito_id) VALUES
-- Temporada 2022
('2022', 1, 1, 1), -- Marc Márquez gana en Jerez
('2022', 2, 5, 1), -- Aleix Espargaró segundo en Jerez
('2022', 3, 3, 1), -- Francesco Bagnaia tercero en Jerez
('2022', 1, 3, 2), -- Francesco Bagnaia gana en Cataluña
('2022', 2, 2, 2), -- Fabio Quartararo segundo en Cataluña
('2022', 3, 6, 2), -- Enea Bastianini tercero en Cataluña
('2022', 1, 6, 3), -- Enea Bastianini gana en Mugello
('2022', 2, 4, 3), -- Joan Mir segundo en Mugello
('2022', 3, 2, 3), -- Fabio Quartararo tercero en Mugello
('2022', 1, 2, 4), -- Fabio Quartararo gana en Assen
('2022', 2, 1, 4), -- Marc Márquez segundo en Assen
('2022', 3, 5, 4), -- Aleix Espargaró tercero en Assen

-- Temporada 2023
('2023', 1, 3, 1), -- Francesco Bagnaia gana en Jerez
('2023', 2, 2, 1), -- Fabio Quartararo segundo en Jerez
('2023', 3, 1, 1), -- Marc Márquez tercero en Jerez
('2023', 1, 2, 2), -- Fabio Quartararo gana en Cataluña
('2023', 2, 5, 2), -- Aleix Espargaró segundo en Cataluña
('2023', 3, 3, 2), -- Francesco Bagnaia tercero en Cataluña
('2023', 1, 6, 3), -- Enea Bastianini gana en Mugello
('2023', 2, 3, 3), -- Francesco Bagnaia segundo en Mugello
('2023', 3, 4, 3), -- Joan Mir tercero en Mugello
('2023', 1, 1, 4), -- Marc Márquez gana en Assen
('2023', 2, 3, 4), -- Francesco Bagnaia segundo en Assen
('2023', 3, 5, 4), -- Aleix Espargaró tercero en Assen
('2023', 1, 3, 5), -- Francesco Bagnaia gana en Phillip Island
('2023', 2, 2, 5), -- Fabio Quartararo segundo en Phillip Island
('2023', 3, 6, 5), -- Enea Bastianini tercero en Phillip Island
('2023', 1, 5, 6), -- Aleix Espargaró gana en Sepang
('2023', 2, 4, 6), -- Joan Mir segundo en Sepang
('2023', 3, 1, 6); -- Marc Márquez tercero en Sepang
