# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de una hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, desde su primer "¡Hola, mundo!" hasta construir un pequeño programa orientado a objetos. Aprenderás paso a paso, con ejemplos de la vida diaria (el perfil de un jugador, una mascota virtual, un juego de adivinanzas y un registro de notas del salón) y con pausas para que practiques tú mismo. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~60 minutos, repartidos en 8 lecciones cortas.

**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación.

**Prerrequisitos**: Ninguno. Si sabes usar un navegador y copiar y pegar texto, ya estás listo.

**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari o Edge).

**Editor en línea**: Puedes usar el editor gratuito que prefieras. En los videos mostramos el código en editores en línea, y todos los ejercicios funcionan igual en cualquiera de estos tres:

- **Replit** (https://replit.com): crea un proyecto de tipo *Java*. Te pide crear una cuenta gratuita, pero tus programas quedan guardados.
- **JDoodle** (https://www.jdoodle.com/online-java-compiler): no necesitas registrarte. Si tu programa pide datos con el teclado, activa el modo *Interactive*.
- **OnlineGDB** (https://www.onlinegdb.com/online_java_compiler): no necesitas registrarte y la consola es interactiva.

> **Consejo para que todo funcione en cualquier editor**: cada ejercicio es un solo archivo llamado `Main.java`. Copia todo el código, pégalo en el editor reemplazando lo que haya, y presiona **Run**. Al final de cada lección encontrarás un enlace directo al ejercicio ya cargado en el editor y otro al mismo código en GitHub, por si quieres usar otro editor.

**📂 Repositorio de código fuente**: []()

**Cómo aprovechar el curso**: mira cada video con el editor abierto en otra pestaña. Cuando aparezca el aviso **⏸ PAUSA Y PRACTICA**, detén el video, resuelve el reto y luego continúa para ver la solución. Equivocarte es parte de aprender: cada error es una pista.

## Secuencia de la Lección

Las lecciones están pensadas para verse en orden, porque cada una usa lo que aprendiste en la anterior. Primero conoces las piezas básicas del lenguaje (lecciones 1 a 4), luego aprendes a organizarlas en clases y objetos (lecciones 5 y 6), las juntas en un proyecto real (lección 7) y cierras con consejos para seguir aprendiendo (lección 8).

### Lección 1: ¿Qué es programar? Java y tu primer programa (6 minutos)

- **Descripción**: Descubre qué es un programa (una receta de instrucciones para la computadora), por qué Java es un gran lenguaje para empezar y escribe tu primer programa en un editor en línea.
- **Enlace**: []()
- **Conclusiones clave**: Java se usa en apps Android, en videojuegos como Minecraft Java Edition y en sistemas de bancos y tiendas en línea. Todo programa en Java empieza en `main`, y `System.out.println("Hola");` muestra un mensaje en pantalla.
- **Empieza a programar**: **¡Escoge el editor de codigo de tu preferencia!** [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Puedes copiar el código desde [LinkGitHub]().

### Lección 2: Variables, tipos de datos y operadores (8 minutos)

- **Descripción**: Aprende a guardar información en variables, como si fueran cajas con etiqueta, creando el perfil de un jugador de videojuegos, y haz cálculos con operadores.
- **Enlace**: []()
- **Conclusiones clave**: `int` guarda números enteros, `double` números con decimales, `String` textos y `boolean` verdadero o falso. Se declara así: `int nivel = 7;`. Los operadores `+ - * / %` hacen cálculos, y `7 / 2` da `3` porque entre enteros no hay decimales.
- **Práctica**: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Código en [GitHub]().

### Lección 3: Decisiones y bucles (9 minutos)

- **Descripción**: Haz que tu programa tome decisiones con `if-else` (¿aprobaste o no?) y repita tareas con `for` y `while` (tablas de multiplicar y una cuenta regresiva).
- **Enlace**: []()
- **Conclusiones clave**: `if (nota >= 11) { ... } else { ... }` elige un camino. `for (int i = 1; i <= 10; i++)` repite un número conocido de veces y `while (condicion)` repite mientras algo sea verdadero. Cuidado: si la condición nunca cambia, el bucle no termina nunca.
- **Práctica**: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Código en [GitHub]().

### Lección 4: Métodos y entrada/salida con Scanner (8 minutos)

- **Descripción**: Crea bloques de código reutilizables (métodos), pide datos al usuario con `Scanner` y construye un juego de adivinanzas.
- **Enlace**: []()
- **Conclusiones clave**: Un método es una mini receta con nombre: `public static void saludar(String nombre) { ... }`. Los parámetros son los ingredientes que recibe y `return` devuelve un resultado. `Scanner teclado = new Scanner(System.in);` lee lo que escribe el usuario.
- **Práctica**: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Código en [GitHub]().

### Lección 5: Clases, objetos y constructores (8 minutos)

- **Descripción**: Entra al mundo de la Programación Orientada a Objetos creando una mascota virtual: una clase con atributos (lo que tiene) y métodos (lo que hace).
- **Enlace**: []()
- **Conclusiones clave**: La clase es el molde y el objeto es lo que fabricas con él: `class Mascota { String nombre; }` y `Mascota toby = new Mascota("Toby", "perro");`. El constructor prepara cada objeto nuevo y `this` significa "este objeto".
- **Práctica**: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Código en [GitHub]().

### Lección 6: Encapsulación, arrays y cadenas (8 minutos)

- **Descripción**: Protege los datos de tus objetos con `private`, getters y setters, guarda varias mascotas en un array y juega con los métodos de los textos.
- **Enlace**: []()
- **Conclusiones clave**: Encapsular es poner los datos bajo llave (`private`) y dar puertas controladas: `getEnergia()` para leer y `setEnergia(80)` para cambiar con validación. Un array guarda varios valores numerados desde 0: `String[] colores = {"rojo", "verde"};`. `texto.length()` y `texto.toUpperCase()` trabajan con cadenas.
- **Práctica**: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Código en [GitHub]().

### Lección 7: Proyecto final, Registro de Estudiantes (8 minutos)

- **Descripción**: Junta todo lo aprendido en una aplicación orientada a objetos: registra a los estudiantes de un salón con sus notas, muestra quién aprobó, calcula el promedio y encuentra la nota más alta.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=ENLACE-LECCION-7)
- **Conclusiones clave**: Una clase `Estudiante` encapsulada, un array de objetos, un bucle para pedir datos con `Scanner` y otro para recorrerlos. Cada pieza del curso tiene su lugar en un programa real.
- **Proyecto final**: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Código en [GitHub]().

### Lección 8: Buenas prácticas, errores comunes y próximos pasos (5 minutos)

- **Descripción**: Aprende a escribir código ordenado, a leer los mensajes de error sin miedo y a resolver los errores típicos de principiantes con el reto "Caza errores". Termina con ideas para seguir aprendiendo.
- **Enlace**: [n]()
- **Consejos clave**: Usa nombres claros (`notaFinal`, no `x`), indenta tu código y no olvides el `;`. Java distingue mayúsculas (`System`, no `system`), los textos se comparan con `.equals()` y no con `==`, y los arrays van de `0` a `length - 1`. Para seguir aprendiendo, visita la documentación oficial en [dev.java](https://dev.java/learn/).
- **Reto Caza errores**: [Replit](https://replit.com), [JDoodle](https://www.jdoodle.com/online-java-compiler) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). Código en [GitHub]().


## Recursos adicionales

- **Código fuente completo**: [Repositorio de GitHub](). En la carpeta `starter-files` están los ejercicios para empezar, en `completed-examples` las soluciones y en `scripts` los guiones de cada video.
- **Todas las actividades prácticas**:
    - **Lección 1 – Hola, mundo**: escribe tu primer programa y dibuja una carita con texto.
    - **Lección 2 – Perfil de jugador**: guarda datos en variables y calcula niveles y promedios. 
    - **Lección 3 – Decisiones y bucles**: revisa si aprobaste, haz la tabla del 5 y una cuenta regresiva. 
    - **Lección 4 – Juego de adivinanzas**: crea métodos y lee datos del teclado con Scanner. 
    - **Lección 5 – Mascota virtual**: crea tu primera clase con atributos, métodos y constructor. 
    - **Lección 6 – Mascotas protegidas**: usa getters, setters y un array de mascotas.
    - **Lección 7 – Registro de Estudiantes**: construye tu proyecto final orientado a objetos.
    - **Lección 8 – ¡Caza errores!**: encuentra y corrige los 5 errores escondidos.
- **Recuerda**: todos los enlaces abren un editor en línea, pero el código es el mismo en Replit, JDoodle u OnlineGDB. Usa el que te resulte más cómodo.

**¡Gracias por completar el curso!**

---

## 👥 Elaboración

Universidad Peruana de Ciencias Aplicadas

Carrera de Ingeniería de Software

Período 202620

1ASI0729 Desarrollo de Aplicaciones Open Source

NRC 7769

**Nombre del equipo**: TechNova

**Líder del equipo**: Pérez Vásquez, Ariana Valeria

**Integrantes del equipo**: 
- Hermoza Quispe, Jude (u202318220)
- Mantilla Maldonado, Enrique Manuel (u20231b842)
- Pérez Vasquez, Ariana Valeria (u20241D338)
- Ramos Fuentes Rivera, Adriana Nicole (u202018427)
- Linares Bernable, Cesar Alejandro (u202019409)

**Fecha de entrega**: Noviembre, 2026
