# Guión — Lección 3: Decisiones y bucles

**Duración estimada**: 9 minutos

---

## Introducción (0:00 – 0:30)

Todos los días tomas decisiones: si el semáforo está en verde, cruzas; si no, esperas. Y también repites cosas: en educación física das vueltas a la cancha hasta completar diez. Hasta ahora nuestros programas ejecutaban todas las líneas, una tras otra. En esta lección aprenderás a hacer que el programa elija un camino y que repita instrucciones sin que tengas que escribirlas muchas veces.

---

## Comparaciones: preguntas de sí o no (0:30 – 1:45)

Antes de decidir, hay que preguntar. En programación las preguntas se hacen comparando valores.

- **Condición**: una pregunta cuya respuesta solo puede ser `true` (verdadero) o `false` (falso). Por ejemplo, "¿la nota es mayor o igual a 11?".
- **Operador de comparación**: un símbolo que compara dos valores y responde verdadero o falso.

Los operadores de comparación son:

- `>` mayor que: `15 > 11` es `true`.
- `<` menor que: `8 < 11` es `true`.
- `>=` mayor o igual que: `11 >= 11` es `true`.
- `<=` menor o igual que: `12 <= 10` es `false`.
- `==` igual a: `5 == 5` es `true`.
- `!=` diferente de: `5 != 3` es `true`.

Una trampa muy común:

- `=` (un signo) **guarda** un valor: `nota = 13;`
- `==` (dos signos) **pregunta** si dos valores son iguales: `nota == 13`

---

## Tomar decisiones con if, else if y else (1:45 – 3:45)

- **Estructura de control**: una instrucción que cambia el orden en que se ejecuta el código. Las dos más importantes son las decisiones y los bucles.
- **`if`**: en inglés significa "si". Ejecuta un bloque de código solo si la condición es verdadera.
- **`else`**: significa "si no". Se ejecuta cuando la condición del `if` es falsa.

En Perú las notas van de 0 a 20 y se aprueba con 11. Escribamos un programa que lo revise:

```java
int nota = 13;

if (nota >= 11) {
    System.out.println("¡Aprobaste!");
} else {
    System.out.println("Sigue practicando, ¡tú puedes!");
}
```

Se lee así: "si la nota es mayor o igual a 11, muestra *Aprobaste*; si no, muestra *Sigue practicando*". La condición siempre va entre paréntesis, y lo que pertenece a cada camino va entre llaves.

¿Y si queremos más de dos caminos? Usamos `else if`, que significa "si no, pero si...":

```java
if (nota >= 18) {
    System.out.println("¡Excelente!");
} else if (nota >= 11) {
    System.out.println("¡Aprobaste!");
} else {
    System.out.println("Sigue practicando, ¡tú puedes!");
}
```

Java revisa las condiciones de arriba hacia abajo y entra **solo al primer camino** que sea verdadero; los demás los salta. Por eso el caso más exigente va primero. Si pusiéramos primero `nota >= 11`, una nota de 19 entraría ahí y nunca llegaría a "Excelente".

Prueba cambiar el valor de `nota` a 19, a 13 y a 8, y presiona Run cada vez para ver cómo cambia el camino.

---

## Repetir con el bucle for (3:45 – 5:15)

Si quisieras mostrar la tabla del 5, podrías escribir diez líneas casi iguales. Pero hay una forma mucho mejor.

- **Bucle**: una estructura que repite un bloque de código varias veces. También se le llama **ciclo** o **loop**.
- **Iteración**: cada una de las repeticiones del bucle. Si el bucle se repite diez veces, tiene diez iteraciones.
- **`for`**: un bucle que usamos cuando sabemos cuántas veces queremos repetir.

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("5 x " + i + " = " + (5 * i));
}
```

Dentro de los paréntesis del `for` hay tres partes, separadas por punto y coma:

- `int i = 1` es el **inicio**: creamos un contador llamado `i` que empieza en 1.
- `i <= 10` es la **condición**: el bucle sigue mientras `i` sea menor o igual a 10.
- `i++` es el **paso**: al final de cada vuelta, le suma 1 a `i`.

- **Contador**: una variable que lleva la cuenta de las vueltas, como el contador de vueltas en una pista de atletismo.
- **`i++`**: es una forma corta de escribir `i = i + 1`. A esto se le llama **incrementar**.

En la consola aparece la tabla completa, del `5 x 1 = 5` hasta el `5 x 10 = 50`, con solo tres líneas de código.

---

## Repetir con el bucle while (5:15 – 6:30)

- **`while`**: significa "mientras". Repite un bloque de código **mientras** la condición sea verdadera. Lo usamos cuando no sabemos exactamente cuántas veces se repetirá, o cuando depende de algo que cambia.

Hagamos la cuenta regresiva de un cohete:

```java
int cuenta = 5;
while (cuenta >= 1) {
    System.out.println(cuenta + "...");
    cuenta--;
}
System.out.println("¡Despegue!");
```

Mientras la cuenta sea 1 o más, la mostramos y le restamos 1.

- **`cuenta--`**: es la forma corta de `cuenta = cuenta - 1`. A esto se le llama **decrementar**.

Cuando `cuenta` llega a 0, la condición se vuelve falsa, el bucle termina y el cohete despega.

¿Qué pasa si borramos la línea `cuenta--`? La cuenta se queda en 5 para siempre y el programa nunca termina.

- **Bucle infinito**: un bucle cuya condición nunca se vuelve falsa, así que se repite sin parar. Si te pasa, presiona el botón **Stop** del editor y revisa que la variable de la condición cambie dentro del bucle.

---

## Práctica guiada (6:30 – 8:15)

Abre el enlace del ejercicio en la descripción, en el editor que prefieras. Ya tiene la decisión de aprobado y la tabla del 5. Completa los tres retos:

1. **Reto 1**: agrega un `else if` que muestre "¡Excelente!" cuando la nota sea 18 o más.
2. **Reto 2**: con un `while`, haz la cuenta regresiva de 5 a 1 y al final muestra "¡Despegue!".

---

## Cierre (8:15 – 9:00)

Hoy tu programa aprendió a tomar decisiones con `if`, `else if` y `else`, y a repetir tareas con `for`, cuando sabes cuántas veces, y con `while`, mientras algo sea verdadero. También conociste el bucle infinito y cómo evitarlo.

En la siguiente lección crearás tus propios comandos con métodos y tu programa podrá conversar contigo.

¡Hasta la lección 4!
