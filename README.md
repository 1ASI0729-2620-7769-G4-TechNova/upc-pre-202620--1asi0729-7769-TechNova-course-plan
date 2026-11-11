# Fundamentos de Java para Principiantes – Código del curso

Repositorio con todo el código Java del curso introductorio de programación para estudiantes de secundaria (de 12 a 17 años) sin experiencia previa. Aquí encontrarás los ejercicios de cada lección, sus soluciones y los guiones de los videos.

El curso dura aproximadamente **60 minutos** y está dividido en **8 lecciones cortas**: empieza con tu primer "¡Hola, mundo!" y termina con un proyecto orientado a objetos.

## ¿Cómo uso este repositorio?

**No necesitas instalar nada.** Solo necesitas tu navegador y un editor de Java en línea gratuito. Tienes dos opciones:

1. **Opción manual (usando el editor de tu preferencia):** abre la carpeta de tu lección dentro de `starter-files/`, entra al archivo `Main.java`, presiona el ícono **Copy raw file** (o el botón **Raw**) y pega el código en el editor que prefieras:
    - **Replit:** crea un proyecto nuevo con la plantilla **Java**. Abre el archivo `Main.java`, borra todo lo que tenga, pega el código y presiona **Run**.
    - **JDoodle:** entra al compilador de Java, borra el código de ejemplo, pega el tuyo y presiona **Execute**. Si el ejercicio pide datos por teclado (lecciones 4 y 7), activa antes el modo **Interactive**.
    - **OnlineGDB:** en la esquina superior derecha elige el lenguaje **Java**, borra el código de ejemplo, pega el tuyo y presiona **Run**. La consola es interactiva, así que puedes escribir directamente en ella.
    - ¡Listo! El resultado aparecerá en la consola, en la parte inferior del editor.


## ¿Cómo practicar cada lección?

1. Mira el video de la lección con el editor abierto en otra pestaña.
2. Cuando aparezca el aviso **⏸ PAUSA Y PRACTICA**, detén el video.
3. Abre el ejercicio de `starter-files/` y resuelve los retos. Están marcados en los comentarios con las palabras `RETO` o `PASO`.
4. Presiona **Run** seguido para comprobar que todo funciona. Si aparece un error, lee el mensaje: te dice qué pasó y en qué línea.
5. Continúa el video para ver la solución, o compara tu código con el archivo de la misma lección en `completed-examples/`.

## Carpetas

| Carpeta | Qué contiene                                                                                                         |
|---------|----------------------------------------------------------------------------------------------------------------------|
| `/starter-files` | Código inicial para practicar en cada lección (incompleto a propósito, con instrucciones en comentarios).            |
| `/completed-examples` | La solución terminada de cada lección, con comentarios que explican cada parte. ¡Úsala solo si no puedes resolverlo! |
| `/scripts` | Guiones de los videos de cada lección, con las explicaciones, los ejemplos y las prácticas guiadas.                  |

## Estructura del repositorio

```text
java-fundamentals-course-TechNova/
│
├── README.md                   ← Documentación principal del repositorio
├── course-plan.md              ← Plan completo del curso (artefacto principal)
│
├── starter-files/              ← Código inicial para que los alumnos practiquen
│   ├── leccion-01/Main.java
│   ├── leccion-02/Main.java
│   ├── leccion-03/Main.java
│   ├── leccion-04/Main.java
│   ├── leccion-05/Main.java
│   ├── leccion-06/Main.java
│   ├── leccion-07/Main.java
│   └── leccion-08/Main.java
│
├── completed-examples/         ← Código final y completo de cada lección
│   ├── leccion-01/Main.java
│   ├── leccion-02/Main.java
│   ├── leccion-03/Main.java
│   ├── leccion-04/Main.java
│   ├── leccion-05/Main.java
│   ├── leccion-06/Main.java
│   ├── leccion-07/Main.java
│   └── leccion-08/Main.java
│
└── scripts/                    ← Guiones narrativos de cada video
    ├── leccion-01.md
    ├── leccion-02.md
    ├── leccion-03.md
    ├── leccion-04.md
    ├── leccion-05.md
    ├── leccion-06.md
    ├── leccion-07.md
    └── leccion-08.md
```

## Contenido de las lecciones

1. **Lección 1 – ¿Qué es programar? Java y tu primer programa (6 min):** qué es un programa, para qué se usa Java, tu primer `System.out.println` y una carita dibujada con texto.
2. **Lección 2 – Variables, tipos de datos y operadores (8 min):** `int`, `double`, `String` y `boolean`, operadores `+ - * / %` y el perfil de una jugadora de videojuegos.
3. **Lección 3 – Decisiones y bucles (9 min):** `if`, `else if` y `else` para saber si aprobaste, la tabla del 5 con `for` y una cuenta regresiva con `while`.
4. **Lección 4 – Métodos y entrada/salida con Scanner (8 min):** métodos con parámetros y `return`, lectura del teclado con `Scanner` y un juego de adivinanzas.
5. **Lección 5 – Clases, objetos y constructores (8 min):** tu primera clase, `Mascota`, con atributos, métodos, constructor y la palabra `this`.
6. **Lección 6 – Encapsulación, arrays y cadenas (8 min):** `private`, getters y setters con validación, un array de mascotas, el for-each y métodos de `String`.
7. **Lección 7 – Proyecto final: Registro de Estudiantes (8 min):** una aplicación orientada a objetos que registra notas, muestra quién aprobó, calcula el promedio y encuentra la nota más alta.
8. **Lección 8 – Buenas prácticas, errores comunes y próximos pasos (5 min):** cómo leer los mensajes de error y el reto **¡Caza errores!**, un programa con 5 errores escondidos para corregir.

> IMPORTANTE: El archivo `starter-files/leccion-08/Main.java` tiene errores **a propósito**. No funcionará hasta que los corrijas: ¡ese es el reto!

## Problemas frecuentes

- **"class X is public, should be declared in a file named X.java":** solo la clase `Main` puede llevar `public`. Revisa que la clase pública se llame exactamente `Main` y que las demás clases no lleven `public`.
- **El programa no me deja escribir (lecciones 4 y 7):** en JDoodle, activa el modo **Interactive** antes de ejecutar. En Replit y OnlineGDB, haz clic dentro de la consola y escribe tu respuesta.
- **El programa nunca termina:** probablemente hay un bucle infinito. Presiona **Stop** y revisa que la variable de la condición cambie dentro del bucle.
- **"';' expected":** falta un punto y coma al final de una instrucción, normalmente en la línea indicada o en la anterior.
- **"cannot find symbol":** escribiste mal un nombre. Recuerda que Java distingue mayúsculas de minúsculas: `System` no es lo mismo que `system`.

## Requisitos

- Un navegador web: Chrome, Firefox, Safari o Edge.
- Un editor de Java en línea gratuito, el que prefieras: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler).
- No necesitas experiencia previa ni instalar ningún programa.

## Plan del curso

Consulta el plan completo, con los enlaces a los videos de YouTube y a las prácticas de cada lección, en [course-plan.md]().

## Seguir aprendiendo

- Guía oficial de Java para principiantes: [dev.java/learn](https://dev.java/learn/)