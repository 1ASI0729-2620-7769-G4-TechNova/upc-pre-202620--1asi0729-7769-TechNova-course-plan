# Guión — Lección 1: ¿Qué es programar? Java y tu primer programa

**Duración estimada**: 6 minutos

---

## Introducción (0:00 – 0:30)

¡Hola! Mi nombre es Ariana Valeria Perez Vasquez, soy estudiante de Ingeniería de Software y hoy vamos a comenzar con nuestra primera lección.

¿Qué tienen en común la app de mensajes de tu celular, tu videojuego favorito y el cajero automático de un banco? Que alguien les dio instrucciones, paso a paso, para que sepan exactamente qué hacer. Eso es programar. En esta lección vas a entender qué es un programa, por qué Java es un gran lenguaje para empezar y vas a escribir tu primer programa sin instalar nada.

---

## ¿Qué es programar? (0:30 – 1:45)

Imagina que tienes que explicarle a un robot cómo preparar un pan con palta. No basta con decirle "hazlo", porque el robot no sabe nada. Tienes que decirle cada paso y en orden:

1. Toma un pan.
2. Córtalo por la mitad.
3. Unta la palta.
4. Añade una pizca de sal.

Una computadora funciona igual: es rapidísima, pero solo hace exactamente lo que le indicas, ni más ni menos.

Vamos con nuestras primeras definiciones:

- **Programa**: una lista de instrucciones, escritas en orden, que la computadora sigue para cumplir una tarea. Es como una receta.
- **Instrucción**: cada uno de los pasos de esa receta. Por ejemplo, "muestra un mensaje en la pantalla".
- **Lenguaje de programación**: el idioma especial en el que escribimos esas instrucciones para que la computadora las entienda. Así como existen el español y el inglés, existen lenguajes como Java, Python o JavaScript.
- **Programar**: escribir esas instrucciones. A la persona que lo hace se le llama programador o programadora.

---

## ¿Por qué Java? (1:45 – 2:30)

Java es uno de los lenguajes más usados del mundo desde hace casi 30 años. Lo encuentras en:

- Muchas aplicaciones de celulares Android.
- Videojuegos, como la edición original de Minecraft, que está escrita en Java.
- Los sistemas de bancos, tiendas en línea y empresas grandes.

Además, Java es un lenguaje ordenado y estricto: si escribes algo mal, te avisa con un mensaje antes de ejecutar el programa. Eso puede parecer molesto al principio, pero en realidad es una gran ayuda para aprender, porque te enseña a ser cuidadoso.

---

## ¿Dónde vamos a programar? (2:30 – 3:15)

Para programar no necesitas instalar nada. Vamos a usar un **editor en línea**.

- **Editor en línea**: una página web donde escribes tu código y lo ejecutas con un botón, todo desde el navegador.

Puedes usar el que prefieras, porque los tres son gratuitos y funcionan igual para este curso:

- **Replit** (replit.com): te pide crear una cuenta gratuita, pero guarda tus programas.
- **JDoodle** (jdoodle.com): no necesitas registrarte.
- **OnlineGDB** (onlinegdb.com): no necesitas registrarte.

En cualquiera de ellos vas a encontrar tres partes:

- El área donde escribes el código.
- El botón **Run** (ejecutar), que le dice a la computadora "sigue estas instrucciones".
- La **consola**: la zona donde aparece el resultado de tu programa. Es como la pantalla donde el programa te "habla".

---

## Tu primer programa (3:15 – 4:30)

Este es el programa más famoso del mundo. Casi todos los programadores empezaron con él:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

Hay varias palabras nuevas, pero por ahora solo necesitas entender tres partes:

- `public class Main { ... }` es la caja que guarda todo tu programa. Más adelante, en la lección 5, aprenderás qué es exactamente una clase. Por ahora, piensa que es el envase.
- `public static void main(String[] args) { ... }` es la puerta de entrada. Cuando presionas Run, Java siempre empieza a leer desde aquí, desde `main`.
- `System.out.println("¡Hola, mundo!");` es la instrucción que muestra un mensaje en la consola.

Definamos algunas piezas más:

- **Texto entre comillas**: todo lo que pongas entre comillas dobles `" "` se muestra tal cual. En programación a un texto se le llama **cadena** o **String**.
- **`println`**: viene de *print line*, que significa "imprimir una línea". Muestra el mensaje y salta a la siguiente línea.
- **Punto y coma `;`**: en Java, cada instrucción termina con punto y coma. Es como el punto final de una oración. Si lo olvidas, Java te mostrará un error.
- **Llaves `{ }`**: marcan dónde empieza y dónde termina un bloque de código. Siempre van en pares: si abres una, debes cerrarla.

Al presionar Run, en la consola aparece:

```
¡Hola, mundo!
```

¡Felicidades, acabas de ejecutar tu primer programa!

---

## Práctica guiada (4:30 – 5:15)

Abre el enlace del ejercicio en la descripción del video, en el editor que prefieras. El archivo `Main.java` ya tiene el "Hola, mundo" y dos retos marcados con comentarios:

- **Comentario**: una línea que empieza con `//`. Java la ignora por completo; sirve para dejar notas a las personas que leen el código.

Pausa el video y resuelve:

1. **Reto 1**: agrega una línea que muestre tu nombre o tu apodo.
2. **Reto 2**: dibuja una carita usando tres líneas de `println`.

Una posible solución:

```java
System.out.println("Me llamo Alex y hoy empiezo a programar.");
System.out.println("  O   O  ");
System.out.println("    ^    ");
System.out.println("  \\___/  ");
```

Fíjate en un detalle: para que aparezca una barra invertida `\` tuvimos que escribir dos `\\`. Eso pasa porque, dentro de un texto, la barra invertida tiene un significado especial en Java. Por ahora solo recuerda el truco.

---

## Cierre (5:15 – 6:00)

Hoy aprendiste que un programa es una receta de instrucciones, que Java se usa en apps, juegos y bancos, y que `System.out.println` muestra mensajes en la consola. También conociste el punto y coma, las llaves y los comentarios.

En la siguiente lección le enseñarás a tu programa a recordar información usando variables.

¡Hasta la lección 2