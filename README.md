# Sistema de Gestión de Carreras

Este sistema gestiona la información de pilotos, circuitos y carreras en un formato estructurado con relaciones entre las entidades. Proporciona funcionalidades CRUD y métodos avanzados para consultas específicas.

## Entidades

### Piloto
| Campo        | Tipo             | Descripción                                   |
|--------------|------------------|-----------------------------------------------|
| id           | Integer          | Identificador único del piloto.              |
| nombre       | String           | Nombre del piloto.                           |
| conducción   | Enumerado        | Estilo de conducción (pasiva, agresiva, temeraria). |

### Circuito
| Campo        | Tipo             | Descripción                                   |
|--------------|------------------|-----------------------------------------------|
| id           | Integer          | Identificador único del circuito.            |
| nombre       | String           | Nombre del circuito.                         |
| localidad    | String           | Ubicación del circuito.                      |

### Carrera
| Campo        | Tipo             | Descripción                                   |
|--------------|------------------|-----------------------------------------------|
| id           | Integer          | Identificador único de la carrera.           |
| piloto_id    | Integer (FK)     | Identificador del piloto participante.       |
| circuito_id  | Integer (FK)     | Identificador del circuito donde se realizó. |
| temporada    | String           | Año de la temporada.                         |
| posición     | Enumerado        | Posición final (1...23).                     |

## Relaciones entre tablas
1. **Piloto → Carrera**: Relación uno a muchos. Un piloto puede participar en varias carreras.
2. **Circuito → Carrera**: Relación uno a muchos. Un circuito puede albergar varias carreras.
3. **Carrera → Piloto y Circuito**: Relación muchos a uno. Cada carrera está asociada a un piloto y a un circuito.

## Funcionalidades

### CRUD
1. **Piloto**
   - Crear, leer, actualizar y eliminar pilotos.
   - Al consultar un piloto, se devuelve información sobre las carreras en las que ha participado y los circuitos asociados.
2. **Circuito**
   - Crear, leer, actualizar y eliminar circuitos.
3. **Carrera**
   - Crear, leer, actualizar y eliminar carreras.

### Métodos avanzados
1. **Obtener pilotos en pódium**  
   Devuelve una lista de pilotos que han quedado en las posiciones 1, 2 o 3 en cualquier carrera.

2. **Obtener pilotos en pódium con detalles de la carrera**  
   Devuelve una lista de pilotos que han quedado en las posiciones 1, 2 o 3, incluyendo el circuito y la temporada de la carrera.

3. **Determinar el piloto con más campeonatos**  
   Devuelve el piloto que más veces ha quedado en la primera posición en distintas carreras.

4. **Endpoint para información de circuitos**  
   - URL: `/circuitos/{nombre_circuito}`  
   - Devuelve la información del circuito especificado por su nombre, incluyendo las carreras realizadas allí y los pilotos participantes.

