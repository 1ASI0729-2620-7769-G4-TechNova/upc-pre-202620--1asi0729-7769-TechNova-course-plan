# Guión — Lección 8: Buenas prácticas, errores comunes y próximos pasos

**Duración estimada**: 5 minutos

---

## Introducción (0:00 – 0:20)

Si alguna vez viste la consola llena de mensajes en rojo y te asustaste, tranquilo: incluso los programadores con años de experiencia ven errores todos los días. La diferencia es que saben leerlos. En esta lección aprenderás buenas prácticas para escribir código ordenado, a entender los errores más comunes y a seguir aprendiendo por tu cuenta.

---

## Buenas prácticas (0:20 – 1:30)

- **Buenas prácticas**: hábitos que hacen que tu código sea más fácil de leer, de corregir y de mejorar, tanto para ti como para otras personas.

Compara estas dos versiones del mismo código:

```java
int x=15;if(x>=11){System.out.println("ok");}
```

```java
int notaFinal = 15;

// Revisamos si el estudiante aprobó
if (notaFinal >= 11) {
    System.out.println("Aprobado");
}
```

Las dos funcionan igual, pero la segunda se entiende al instante. Estos son cuatro hábitos para empezar:

- **Usa nombres claros**: `notaFinal` dice mucho más que `x`.
- **Indenta tu código**: lo que está dentro de unas llaves va un poco más a la derecha, así se ve qué pertenece a qué.
- **Deja comentarios cortos** que expliquen el porqué de las partes difíciles.
- **Prueba seguido**: ejecuta tu programa cada pocas líneas, no esperes a escribir cien para probar.

- **Indentar** (o **sangrar**): dejar espacios al inicio de una línea para mostrar que está dentro de un bloque.

---

## Cómo leer un mensaje de error (1:30 – 2:00)

- **Error** (o **bug**): una falla en el código que impide que el programa funcione o que hace que funcione mal.
- **Depurar** (o **debuggear**): buscar y corregir los errores de un programa.

Un mensaje de error parece complicado, pero casi siempre te dice dos cosas muy útiles:

- **Qué pasó**: por ejemplo, `';' expected`, que significa "esperaba un punto y coma".
- **En qué línea**: el número de la línea donde Java encontró el problema.

Así que el primer paso siempre es el mismo: lee el mensaje con calma y ve a la línea que indica.

---

## Los cinco errores más comunes (2:00 – 3:30)

**1. Olvidar el punto y coma.**

```java
int total = 0      // error
int total = 0;     // correcto
```

Java te dirá `';' expected`.

**2. Escribir mal las mayúsculas.** Java distingue mayúsculas de minúsculas, así que `system` y `System` son palabras distintas.

```java
system.out.println("Hola");   // error
System.out.println("Hola");   // correcto
```

**3. Comparar textos con `==`.** Para los números usamos `==`, pero para los textos debemos usar `.equals()`. Si no te importan las mayúsculas, usa `.equalsIgnoreCase()`. Ojo: este error no muestra ningún mensaje en rojo; el programa corre, pero la comparación da un resultado equivocado.

```java
if (intento == clave)                  // incorrecto para textos
if (intento.equals(clave))             // correcto
if (intento.equalsIgnoreCase(clave))   // correcto e ignora mayúsculas
```

**4. Salirse del array.** Si un array tiene 3 casilleros, sus índices van del 0 al 2. Pedir el casillero 3 provoca un error llamado `ArrayIndexOutOfBoundsException`, que significa "índice fuera de los límites del array".

```java
for (int i = 0; i <= puntos.length; i++)   // error: llega hasta 3
for (int i = 0; i < puntos.length; i++)    // correcto: llega hasta 2
```

- **Excepción**: un error que ocurre mientras el programa ya se está ejecutando. A diferencia del error de compilación, Java no puede detectarlo antes.

**5. El bucle infinito.** Sucede cuando olvidas cambiar la variable de la condición dentro de un `while`, como vimos en la lección 3. Este error no está en el ejercicio de hoy porque congelaría tu editor, pero ya sabes cómo evitarlo.

---

## Práctica guiada: ¡Caza errores! (3:30 – 4:15)

Abre el enlace del ejercicio en la descripción, en el editor que prefieras. Este programa tiene cinco errores escondidos. Son de los cuatro primeros tipos que acabamos de ver, y el punto y coma olvidado aparece dos veces. Presiona Run, lee los mensajes de error y corrígelos uno por uno hasta que el programa funcione.

Pistas:

- Algunos errores impiden que el programa arranque, y otros solo aparecen cuando ya se está ejecutando.
- Uno de los errores no muestra ningún mensaje: si no ves "Clave correcta" en la consola, revisa cómo se están comparando los textos. Recuerda que la clave es `java` y el intento es `Java`.

Cuando lo corrijas todo, la consola debe mostrar:

```
Revisando la clave...
Clave correcta
Puntos: 10
Puntos: 20
Puntos: 30
Total: 60
```

La solución completa está en la carpeta `completed-examples/leccion-08` del repositorio de GitHub.

---

## Cierre y próximos pasos (4:15 – 5:00)

¡Lo lograste! En una hora pasaste de no saber qué era programar a crear clases, objetos y un registro de estudiantes completo.

¿Y ahora qué? Algunas ideas para seguir aprendiendo:

- Practica con proyectos pequeños: una calculadora, una lista de tareas o un juego de preguntas y respuestas.
- Visita la guía oficial de Java para principiantes en **dev.java**.
- Revisa el código de todas las lecciones en nuestro repositorio de GitHub.

Recuerda que todo programador empezó con un "¡Hola, mundo!". Equivocarte es parte del camino: cada error que corriges te hace mejor.

¡Gracias por aprender con nosotros!
