# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \<21\>/\<22\>)
Autor/a: \<Antonio Jiménez Ortega\>   uvus:\<antjimor\>

En este proyecto vamos a trabajar con un dataset que contiene 97 canciones en total de Spotify del año 2019, cada cual con sus respectivos atributos.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.\<musica\>**: Paquete que contiene los tipos del proyecto.
  * **fp.\<musica\>.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
    * **\<spotify1.csv\>**: Añade una descripción genérica del dataset.

    
## Estructura del *dataset*
El dataset está compuesto por 12 columnas, con la siguiente descripción:

* **title**: de tipo String, representa el título de cada canción.
* **artist**: de tipo String, representa el artista de cada canción.
* **topGenre**: de tipo String, representa el género de cada canción.
* **year**: de tipo Integer, representa el año de publicación de cada canción.
* **likes**: de tipo Integer, representa la bpm de cada canción.
* **dislikes**: de tipo Integer, representa la energía de cada canción.
* **durationSec**: de tipo Integer, representa en segundos la duración de cada canción.
* **announcedOnTwitter**: de tipo Boolean, representa si cada canción fue anunciada en Twitter tras su publicación.
* **lastConcert**: de tipo LocalDate, representa la fecha del último concierto celebrado de cada canción.


## Tipos implementados

Este proyecto solo tiene (al menos de momento) el tipo 'Cancion'.

### Tipo Base
El tipo 'Cancion' es un tipo creado con los atributos title, artist, topGenre, year, likes, dislikes, durationSec, announcedOnTwitter, lastConcert. Se usará para representar las diferentes canciones del dataset de spotify de diferentes canciones de 2019.

**Propiedades**:

- title, de tipo \<String\>, consultable. 
- artist, de tipo \<String\>, consultable. 
- topGenre, de tipo \<String\>, consultable.
- year, de tipo \<Integer\>, consultable.
- likes, de tipo \<Integer\>, consultable.
- dislikes, de tipo \<Integer\>, consultable.
- durationSec, de tipo \<Integer\>, consultable.
- announcedOnTwitter, de tipo \<Boolean\>, consultable.
- lastConcert, de tipo \<LocalDate\>, consultable.

**Constructores**: 

- C1: Este primer constructor viene generado por el record donde se ha hecho la implementación del tipo 'Cancion', por lo cual contiene todas las propiedades básicas.
- C2: Este segundo constructor es un constructor compacto generado para llevar a cabo la ejecución de los métodos checkeadores (checkTitle y checkDuration), los cuales lanzarán excepciones dependiendo de ciertas condiciones impuestas en cada atributo.

**Restricciones**:
 
- checkTitle(): esta restricción comprueba el título introducido de una canción, si éste es la cadena vacía lanzará una excepción con el mensaje "El titulo de la cancion no puede estar vacio".
- checkDurationSec(): esta restricción comprueba la duración en segundos introducida de una canción, si ésta es es menor que 120 segundos lanzará una excepción con el mensaje "La duracion de la cancion ha de ser mayor o igual a 120 segundos".


**Criterio de igualdad**: El criterio de igualdad de este proyecto hace comprobar dos mismos atributos de dos objetos diferences tipo Cancion y devuelve 'true' si son iguales, y 'false' si no lo son.

**Criterio de ordenación**: El criterio de ordenación está establecido de la siguiente forma: al comparar dos objetos tipo Cancion, primero se comprueba si sus atributos 'title' son iguales, si lo son pasa a analizar sus atributos 'artist', y si estos son iguales pasa a analizar sus atributos 'topGenre'. Al ser estos tres atributos de tipo String, se analiza cada uno de sus caracteres en el orden alfabético, si el de una Cancion c1 está antes que el de una Cancion c2, el criterio de ordenación devolverá un número negativo, si están en la misma posición alfabética, devolverá 0, y si c1 está después de c2, devolverá un número positivo.

**Otras operaciones**:
 ***Propiedades derivadas***
-	getAntiguedad(): obtiene, a partir de un enumerado 'Antiguedad', la antiguedad de un objeto tipo Cacnion a partir de su atributo 'year', devolviendo los prosibles valores 'ANTIGUA', 'RECIENTE' y 'NUEVA'.
- getRatioLikesDislikes(): obtiene, a partir de los atributos 'likes' y 'dislikes', un ratio de tipo Double con el que observaremos cúanto le habrá gustado a los oyentes cierto objeto de tipo Cancion.

#### Tipos auxiliares
Descripción de los tipos auxiliares que sean necesarios añadir al proyecto.

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.

### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
