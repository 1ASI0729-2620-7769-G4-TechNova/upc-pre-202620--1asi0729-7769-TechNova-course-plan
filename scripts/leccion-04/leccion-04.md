# Guión — Lección 4: Métodos y entrada/salida con Scanner

**Duración estimada**: 8 minutos

---

## Introducción (0:00 – 0:30)

Hasta ahora nuestros programas hablaban solos: mostraban mensajes, pero no escuchaban. En esta lección tu programa va a conversar contigo: te preguntará tu nombre y te retará a adivinar un número secreto. Para lograrlo aprenderás dos cosas nuevas: los métodos, para organizar tu código, y Scanner, para leer lo que escribe el usuario.

---

## ¿Qué es un método? (0:30 – 2:15)

Imagina que cada vez que quieres saludar a alguien tuvieras que escribir el mismo mensaje completo. Sería repetitivo. Sería mejor tener un "botón" llamado *saludar* que haga todo con solo presionarlo.

- **Método**: un bloque de código con nombre que realiza una tarea específica. Lo escribes una sola vez y lo usas todas las veces que quieras. En otros lenguajes se le llama **función**.
- **Llamar a un método**: usarlo, escribiendo su nombre seguido de paréntesis. Es como presionar el botón.

```java
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "! Bienvenido al juego.");
}
```

Veamos cada parte:

- `public static` son palabras que, por ahora, siempre pondremos en los métodos que llamamos desde `main`. En la lección 5 verás métodos sin `static`.
- `void` significa que el método **no devuelve** ningún resultado; solo hace algo, en este caso mostrar un mensaje.
- `saludar` es el nombre del método. Por costumbre, los nombres de métodos son verbos: saludar, calcular, mostrar.
- `(String nombre)` es el **parámetro**.

- **Parámetro**: un dato que el método recibe para hacer su trabajo. Es como el ingrediente que le das a una licuadora.
- **Argumento**: el valor concreto que le pasas al método cuando lo llamas.

Para usarlo, lo llamamos desde `main`:

```java
saludar("Ana");   // muestra: ¡Hola, Ana! Bienvenido al juego.
saludar("Leo");   // muestra: ¡Hola, Leo! Bienvenido al juego.
```

Misma receta, distinto ingrediente.

---

## Métodos que devuelven un resultado (2:15 – 3:00)

Algunos métodos no solo hacen algo, sino que te **devuelven** una respuesta, como una licuadora que te devuelve un jugo.

- **`return`**: la instrucción que entrega el resultado del método a quien lo llamó.
- **Tipo de retorno**: el tipo de dato que devuelve el método. Se escribe antes del nombre, en lugar de `void`.

```java
public static boolean esCorrecto(int intento, int secreto) {
    return intento == secreto;
}
```

Este método recibe dos números y devuelve `true` si son iguales o `false` si no lo son. Por eso su tipo de retorno es `boolean`. Fíjate que puede recibir varios parámetros, separados por comas.

---

## Leer datos con Scanner (3:00 – 4:15)

Para que el programa escuche al usuario necesitamos una herramienta de Java llamada Scanner.

- **Entrada**: los datos que el usuario le da al programa, por ejemplo escribiendo en el teclado.
- **Salida**: lo que el programa muestra, como los mensajes de `println`.
- **Scanner**: una herramienta de Java que lee lo que el usuario escribe en la consola.
- **`import`**: la instrucción que trae una herramienta de Java a tu programa. Es como sacar una herramienta de la caja antes de usarla. Siempre va en la primera línea del archivo.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);
    }
}
```

- `Scanner teclado = new Scanner(System.in);` crea nuestro lector y lo llama `teclado`. `System.in` significa "lo que entra por el teclado".
- `teclado.nextLine()` espera a que el usuario escriba una línea de texto y presione Enter, y la devuelve como `String`.
- `teclado.nextInt()` hace lo mismo, pero lee un número entero (`int`).

Un detalle según tu editor: en Replit y en OnlineGDB puedes escribir directamente en la consola. En JDoodle, activa la opción **Interactive** antes de presionar Run.

---

## Un número al azar (4:15 – 4:45)

Para el juego necesitamos un número secreto que cambie en cada partida.

- **Número aleatorio**: un número elegido al azar por la computadora, como cuando lanzas un dado.

```java
int secreto = (int) (Math.random() * 10) + 1;
```

- `Math.random()` da un número al azar entre 0 y casi 1, por ejemplo `0.73`.
- Lo multiplicamos por 10: `7.3`.
- `(int)` le quita los decimales: `7`.
- Le sumamos 1 para que el resultado vaya del 1 al 10, y no del 0 al 9.

No necesitas memorizarlo: puedes copiar esta línea cada vez que la necesites.

---

## Práctica guiada (4:45 – 7:15)

Abre el enlace del ejercicio en la descripción, en el editor que prefieras. Ya tiene el método `saludar`, el Scanner y el número secreto. Completa los dos retos:

1. **Reto 1**: crea un método `darPista` que reciba el intento y el secreto, y muestre "¡Más alto!" o "¡Más bajo!".
2. **Reto 2**: con un `while`, pide números hasta que el jugador adivine.

La solución:

```java
public static void darPista(int intento, int secreto) {
    if (intento < secreto) {
        System.out.println("¡Más alto!");
    } else {
        System.out.println("¡Más bajo!");
    }
}

// dentro de main
while (!esCorrecto(intento, secreto)) {
    System.out.print("Escribe un número del 1 al 10: ");
    intento = teclado.nextInt();
    vidas++;
    if (!esCorrecto(intento, secreto)) {
        darPista(intento, secreto);
    }
}
System.out.println("¡Adivinaste, " + nombre + "! Lo lograste en " + vidas + " intentos.");
```

- **`!`**: el operador "no". Invierte una condición: `!esCorrecto(...)` se lee "no es correcto".

Entonces el `while` se lee: "mientras **no** sea correcto, sigue pidiendo números". Cada vez sumamos un intento y, si el jugador falla, le damos una pista. Fíjate en lo fácil que se lee `main` gracias a los métodos: casi parece una historia.

---

## Cierre (7:15 – 8:00)

Hoy creaste métodos con parámetros, devolviste resultados con `return` y leíste datos del usuario con Scanner. Con todo eso programaste tu primer juego.

En la siguiente lección darás un gran salto: vas a crear tus propios objetos con la Programación Orientada a Objetos.

¡Hasta la lección 5!
