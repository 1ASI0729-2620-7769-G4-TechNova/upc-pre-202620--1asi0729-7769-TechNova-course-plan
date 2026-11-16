# Guión — Lección 5: Clases, objetos y constructores

**Duración estimada**: 8 minutos

---

## Introducción (0:00 – 0:30)

¿Alguna vez tuviste una mascota virtual que come, juega y se cansa? En esta lección vas a programar una. Para hacerlo aprenderás la idea más importante de Java: la Programación Orientada a Objetos, que nos permite crear nuestros propios "tipos de cosas" con sus datos y sus acciones.

---

## ¿Qué es la Programación Orientada a Objetos? (0:30 – 1:30)

Mira a tu alrededor: todo son objetos. Tu celular, tu mochila, tu mascota. Cada objeto **tiene** características (un color, un tamaño, un nombre) y **hace** cosas (sonar, abrirse, ladrar).

- **Programación Orientada a Objetos (POO)**: una forma de programar en la que organizamos el código imitando los objetos del mundo real, cada uno con sus características y sus acciones.

En lugar de tener muchas variables sueltas como `nombreMascota1`, `energiaMascota1`, `nombreMascota2`... agrupamos todo lo que pertenece a una mascota dentro de un solo objeto. Así el código queda más ordenado y es más fácil de entender.

---

## Clase y objeto (1:30 – 2:30)

Piensa en un molde de galletas con forma de estrella. El molde no es una galleta: es el diseño que dice qué forma tendrán. Con un solo molde puedes hacer muchas galletas, y cada una puede decorarse distinto.

- **Clase**: el molde. Describe qué características y qué acciones tendrán todos los objetos de ese tipo. Por ejemplo, la clase `Mascota`.
- **Objeto**: cada cosa concreta que fabricas con el molde. Por ejemplo, Toby el perro y Michi el gato son dos objetos de la clase `Mascota`.
- **Instancia**: otra forma de decir "objeto". Crear un objeto también se llama **instanciar**.

Con una sola clase `Mascota` podemos crear todas las mascotas que queramos.

---

## Atributos y métodos (2:30 – 4:00)

Una clase tiene dos partes principales:

- **Atributos**: las características del objeto, lo que el objeto **tiene**. Son variables que viven dentro de cada objeto.
- **Métodos**: las acciones del objeto, lo que el objeto **hace**. Son los mismos métodos de la lección 4, pero ahora pertenecen al objeto.

```java
class Mascota {
    // Atributos: lo que la mascota TIENE
    String nombre;
    String especie;
    int energia;

    // Métodos: lo que la mascota HACE
    void jugar() {
        energia = energia - 10;
        System.out.println(nombre + " jugó con la pelota.");
    }

    void mostrarEstado() {
        System.out.println(nombre + " (" + especie + ") tiene " + energia + " de energía.");
    }
}
```

Cada mascota tendrá su propio nombre, su propia especie y su propia energía. Cuando una mascota juega, gasta 10 de **su** energía, no la de las demás.

Fíjate en dos detalles:

- Los nombres de las clases empiezan con mayúscula: `Mascota`, `Estudiante`. Los de variables y métodos, con minúscula.
- Estos métodos no llevan `static`, porque cada mascota los usa con sus propios datos.

Un consejo para el editor: en nuestros ejercicios todas las clases van en el mismo archivo `Main.java`, y solo la clase `Main` lleva la palabra `public`. Así el código funciona igual en Replit, JDoodle u OnlineGDB.

---

## El constructor y la palabra this (4:00 – 5:15)

Cuando nace una mascota, queremos darle un nombre y una especie desde el principio, y que empiece con algo de energía.

- **Constructor**: un método especial que se ejecuta automáticamente en el momento en que se crea un objeto. Sirve para darle sus valores iniciales. Se llama igual que la clase y no tiene tipo de retorno, ni siquiera `void`.

```java
Mascota(String nombre, String especie) {
    this.nombre = nombre;
    this.especie = especie;
    this.energia = 50;
}
```

Este constructor recibe el nombre y la especie, y le da 50 de energía a toda mascota nueva.

- **`this`**: significa "este objeto". Sirve para diferenciar el atributo del objeto del parámetro que recibimos cuando ambos tienen el mismo nombre.

Entonces `this.nombre = nombre;` se lee: "el nombre de **esta** mascota será el nombre que me dieron".

---

## Crear y usar objetos (5:15 – 5:45)

- **`new`**: la palabra que crea un objeto nuevo usando la clase como molde. Al usarla, se ejecuta el constructor.
- **Operador punto `.`**: sirve para pedirle a un objeto que use uno de sus métodos.

```java
Mascota mascota1 = new Mascota("Toby", "perro");
mascota1.jugar();
mascota1.mostrarEstado();
```

En la consola aparece:

```
Toby jugó con la pelota.
Toby (perro) tiene 40 de energía.
```

`mascota1.jugar()` se lee "Toby, juega". Toby empezó con 50 de energía, jugó y ahora tiene 40.

---

## Práctica guiada (5:45 – 7:15)

Abre el enlace del ejercicio en la descripción, en el editor que prefieras. Ya tiene la clase `Mascota` y a Toby. Completa los dos retos:

1. **Reto 1**: crea el método `comer()` que le sume 20 de energía a la mascota.
2. **Reto 2**: crea una segunda mascota, hazla comer y muestra su estado.

La solución:

```java
void comer() {
    energia = energia + 20;
    System.out.println(nombre + " comió su comida favorita.");
}

// dentro de main
Mascota mascota2 = new Mascota("Michi", "gato");
mascota2.comer();
mascota2.mostrarEstado();   // Michi (gato) tiene 70 de energía.
```

Toby sigue con 40 de energía y Michi tiene 70. Esto demuestra que cada objeto guarda sus propios datos, aunque los dos salieron del mismo molde.

---

## Cierre (7:15 – 8:00)

Hoy aprendiste que una clase es un molde y un objeto es lo que creas con él; que los atributos son lo que el objeto tiene y los métodos lo que hace; y que el constructor prepara a cada objeto al nacer.

Pero hay un problema: ahora cualquiera podría escribir `mascota1.energia = 9999;` y hacer trampa. En la siguiente lección aprenderás a proteger los datos de tus objetos.

¡Hasta la lección 6!
