# Guión — Lección 2: Variables, tipos de datos y operadores

**Duración estimada**: 8 minutos

---

## Introducción (0:00 – 0:30)

Cuando entras a un videojuego, el juego recuerda tu nombre, tu nivel y tus puntos. Si no los recordara, empezarías desde cero cada vez. En esta lección aprenderás cómo un programa guarda información usando variables, y cómo hace cálculos con ella. Para practicar, vamos a crear el perfil de una jugadora llamada Luna.

---

## ¿Qué es una variable? (0:30 – 1:45)

Imagina una caja con una etiqueta pegada. En la etiqueta escribes un nombre, por ejemplo "nivel", y dentro de la caja guardas un valor, por ejemplo el número 7. Cuando necesites saber el nivel, solo buscas la caja con esa etiqueta.

- **Variable**: un espacio en la memoria de la computadora donde guardamos un dato para usarlo después. Tiene un nombre (la etiqueta) y un valor (lo que hay dentro).
- **Valor**: el dato que guarda la variable. Puede cambiar mientras el programa se ejecuta; por eso se llama *variable*.
- **Memoria**: la parte de la computadora donde se guardan los datos mientras el programa funciona.

Así se crea una variable en Java:

```java
int nivel = 7;
```

Esta línea tiene tres partes:

- `int` es el tipo de dato: le dice a Java qué clase de cosa va a guardar la caja.
- `nivel` es el nombre de la variable.
- `= 7` guarda el valor 7 dentro de la caja.

Ojo con algo importante: en programación, el signo `=` **no** significa "es igual a". Significa "guarda este valor en esta variable". A esto se le llama **asignación**.

- **Declarar una variable**: crearla, indicando su tipo y su nombre.
- **Asignar un valor**: guardar un dato dentro de la variable con `=`.

---

## Tipos de datos (1:45 – 3:00)

En Java cada caja tiene una forma, y solo acepta un tipo de dato. No puedes guardar un texto en una caja hecha para números.

- **Tipo de dato**: la categoría de información que puede guardar una variable.

Estos son los cuatro tipos que usaremos en el curso:

- `int`: números enteros, sin decimales. Por ejemplo, un nivel: `7`.
- `double`: números con decimales. Por ejemplo, horas jugadas: `12.5`. En Java los decimales se escriben con punto, no con coma.
- `String`: textos, siempre entre comillas dobles. Por ejemplo, un nombre: `"Luna"`. Se escribe con S mayúscula.
- `boolean`: solo puede valer `true` (verdadero) o `false` (falso). Es como un interruptor de luz: encendido o apagado.

El perfil de Luna queda así:

```java
String nombre = "Luna";
int nivel = 7;
int puntos = 350;
double horasJugadas = 12.5;
boolean esPremium = false;
```

Una regla para los nombres: no pueden tener espacios ni empezar con números. Por eso escribimos `horasJugadas` y no `horas jugadas`. Empezamos en minúscula y cada palabra nueva va con mayúscula.

- **camelCase**: esa forma de escribir nombres juntando palabras con mayúsculas en medio. Se llama así porque las mayúsculas parecen las jorobas de un camello.

---

## Mostrar variables en pantalla (3:00 – 3:45)

Para mostrar el valor de una variable, la unimos a un texto usando el signo `+`:

```java
System.out.println("Jugador: " + nombre);
System.out.println("Nivel: " + nivel);
```

En la consola aparece:

```
Jugador: Luna
Nivel: 7
```

- **Concatenar**: unir textos con el signo `+`. Si unes un texto con un número, Java convierte el número en texto y los pega.

Mucha atención a la diferencia:

- `"nombre"` con comillas es literalmente la palabra *nombre*.
- `nombre` sin comillas es lo que hay dentro de la caja, es decir, *Luna*.

---

## Operadores y expresiones (3:45 – 5:30)

Java también sabe hacer matemáticas.

- **Operador**: un símbolo que realiza una operación con valores.
- **Expresión**: una combinación de valores, variables y operadores que da un resultado. Por ejemplo, `puntos + 50`.

Los operadores aritméticos son:

- `+` suma: `5 + 2` da `7`.
- `-` resta: `5 - 2` da `3`.
- `*` multiplicación: `5 * 2` da `10`.
- `/` división: `7 / 2` da `3`. ¡Cuidado!
- `%` módulo: `7 % 2` da `1`.

¿Por qué siete entre dos da tres? Porque cuando divides dos números enteros (`int`), Java descarta los decimales. Si quieres decimales, al menos uno de los números debe ser `double`, por ejemplo `7 / 2.0`, que sí da `3.5`.

- **Módulo `%`**: te da el **residuo** de una división, es decir, lo que sobra. Siete entre dos da tres y sobra uno; por eso `7 % 2` es `1`.

Apliquémoslo al perfil. Si cada nivel necesita 100 puntos:

```java
int nivelesCompletos = puntos / 100;   // 350 / 100 = 3
int puntosSobrantes = puntos % 100;    // 350 % 100 = 50
```

Con la división sabemos que Luna completó 3 niveles, y con el módulo, que le sobran 50 puntos.

---

## Práctica guiada (5:30 – 7:15)

Abre el enlace del ejercicio en la descripción, en Replit, JDoodle u OnlineGDB, el que prefieras. El archivo ya tiene el perfil de Luna y tres retos.

1. **Reto 1**: muestra en pantalla los puntos, las horas jugadas y si es premium.
2. **Reto 2**: calcula cuántos niveles completos hay en los puntos y cuántos sobran.
3. **Reto 3**: crea tres notas y calcula su promedio.

La solución del reto 3 tiene dos trucos:

```java
int nota1 = 15;
int nota2 = 18;
int nota3 = 14;
double promedio = (nota1 + nota2 + nota3) / 3.0;
System.out.println("Promedio: " + promedio);   // 15.666...
```

- Los **paréntesis** hacen que primero se sume y después se divida, igual que en matemáticas.
- Dividimos entre `3.0` y no entre `3` para que Java nos dé decimales. Con `3` obtendrías solo `15`.

---

## Cierre (7:15 – 8:00)

Hoy aprendiste que las variables son cajas con etiqueta, que cada tipo de dato guarda una clase de información distinta y que los operadores te permiten hacer cálculos. También descubriste dos trampas: la división entre enteros y el módulo.

En la siguiente lección tu programa aprenderá a tomar decisiones y a repetir tareas por sí solo.

¡Hasta la lección 3!
