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

Ahora vas a terminar el juego de adivinanzas. Abre el enlace del ejercicio en la descripción del video, en el editor que prefieras: Replit, JDoodle u OnlineGDB. Si usas JDoodle, recuerda activar el modo **Interactive** para poder escribir en la consola.

### ¿Qué trae ya el ejercicio?

El archivo no empieza vacío. Ya tiene listas estas piezas, que viste en la lección:

- El método `saludar`, que da la bienvenida al jugador.
- El método `esCorrecto`, que devuelve `true` si el número del jugador es igual al secreto.
- El Scanner llamado `teclado`, que pregunta el nombre del jugador.
- El número secreto, elegido al azar del 1 al 10.
- Dos variables que vas a usar:
  - `intento`: guarda el último número que escribió el jugador. Empieza en `0` a propósito: como el secreto siempre está entre 1 y 10, el `0` nunca es correcto, y así el bucle se ejecuta al menos una vez.
  - `totalIntentos`: cuenta cuántas veces ha intentado el jugador. Empieza en `0` porque todavía no ha jugado.

Tu trabajo es completar dos retos. Pausa el video y hazlos con calma.

### Reto 1: el método darPista

Cuando el jugador falle, el juego debe ayudarlo comparando **su número con el número secreto**. Por ejemplo, si el secreto es 7 y el jugador escribió 5, el juego debe decirle que el secreto es mayor que 5, para que la próxima vez pruebe con un número más grande.

Crea un método llamado `darPista` que:

1. Reciba dos parámetros: el `intento` del jugador y el `secreto`.
2. Si el intento es **menor** que el secreto, muestre "Pista: el número secreto es MAYOR que 5." (con el número que escribió el jugador).
3. Si no, muestre "Pista: el número secreto es MENOR que 5.".

Pista: no necesita devolver nada, solo mostrar un mensaje, así que su tipo es `void`.

### Reto 2: el bucle del juego

El juego debe seguir preguntando hasta que el jugador acierte. Antes de escribir código, piensa en lo que pasa en **cada vuelta** del juego:

1. Le pedimos al jugador que escriba un número.
2. Guardamos ese número en `intento`.
3. Le sumamos 1 a `totalIntentos`.
4. Si falló, le damos una pista con `darPista`.

Y esto se repite **mientras no haya acertado**. Cuando por fin acierte, salimos del bucle y lo felicitamos.

Una pista para escribir la condición del `while`:

- **`!`**: el operador "no". Invierte una condición: si algo era `true` lo vuelve `false`, y al revés. Por ejemplo, `!esCorrecto(intento, secreto)` se lee "el intento **no** es correcto".

### ¿Cómo sé si lo hice bien?

Presiona **Run** y juega una partida. Si completaste los dos retos, la consola debería verse parecida a esto (los números cambian, porque el secreto es al azar):

```
¿Cómo te llamas? Ana
¡Hola, Ana! Bienvenido al juego.
Escribe un número del 1 al 10: 5
Pista: el número secreto es MAYOR que 5.
Escribe un número del 1 al 10: 8
Pista: el número secreto es MENOR que 8.
Escribe un número del 1 al 10: 7
¡Adivinaste, Ana! Lo lograste en 3 intentos.
```

Si te trabas, puedes comparar tu código con la solución en la carpeta `completed-examples/leccion-04` del repositorio de GitHub.

---

## Cierre (7:15 – 8:00)

Hoy creaste métodos con parámetros, devolviste resultados con `return` y leíste datos del usuario con Scanner. Con todo eso programaste tu primer juego.

En la siguiente lección darás un gran salto: vas a crear tus propios objetos con la Programación Orientada a Objetos.

¡Hasta la lección 5!