# Guión — Lección 7: Proyecto final, Registro de Estudiantes

**Duración estimada**: 8 minutos

---

## Introducción (0:00 – 0:30)

Tus profesores registran las notas de todo el salón y calculan quién aprobó y cuál fue el promedio. En esta lección vas a programar tu propio Registro de Estudiantes usando todo lo que aprendiste en el curso: variables, decisiones, bucles, métodos, Scanner, clases, encapsulación y arrays. Este es tu proyecto final.

---

## Primero, el plan (0:30 – 1:15)

Antes de escribir código, los programadores piensan qué necesita el programa. Nuestro registro debe:

1. Preguntar cuántos estudiantes hay.
2. Pedir el nombre y la nota de cada uno.
3. Mostrar la ficha de cada estudiante, indicando si aprobó.
4. Calcular el promedio del salón y encontrar la nota más alta.

Y estas son las piezas que usaremos:

- Una clase `Estudiante` con atributos privados, como en las lecciones 5 y 6.
- Scanner para pedir los datos, como en la lección 4.
- Un array para guardar a todos los estudiantes, como en la lección 6.
- Bucles y decisiones, como en la lección 3.
- Variables y operadores para los cálculos, como en la lección 2.

- **Algoritmo**: la lista de pasos ordenados para resolver un problema. El plan que acabamos de hacer es un algoritmo, escrito en español antes de pasarlo a Java.

---

## La clase Estudiante (1:15 – 2:45)

```java
class Estudiante {
    private String nombre;
    private double nota;

    Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        setNota(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 20) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida para " + nombre + ". Se registrará 0.");
            this.nota = 0;
        }
    }

    public boolean estaAprobado() {
        return nota >= 11;
    }

    public void mostrarFicha() {
        String estado = estaAprobado() ? "Aprobado" : "Desaprobado";
        System.out.println("- " + nombre + " | Nota: " + nota + " | " + estado);
    }
}
```

Repasemos lo más importante:

- Los atributos `nombre` y `nota` son privados: están protegidos.
- El constructor no guarda la nota directamente, sino que llama a `setNota`. Así la validación funciona desde el primer momento y nadie puede crear un estudiante con nota 25.
- `estaAprobado()` devuelve `true` si la nota es 11 o más.
- `mostrarFicha()` muestra los datos del estudiante en una sola línea.

En `mostrarFicha` aparece algo nuevo:

- **Operador ternario `? :`**: un `if-else` en miniatura que elige entre dos valores. `condición ? valorSiVerdadero : valorSiFalso`.

Entonces `estaAprobado() ? "Aprobado" : "Desaprobado"` se lee: "¿está aprobado? Si sí, *Aprobado*; si no, *Desaprobado*".

---

## Pedir los datos y guardarlos (2:45 – 4:00)

```java
Scanner teclado = new Scanner(System.in);

System.out.print("¿Cuántos estudiantes vas a registrar? ");
int cantidad = Integer.parseInt(teclado.nextLine());
Estudiante[] registro = new Estudiante[cantidad];

for (int i = 0; i < cantidad; i++) {
    System.out.print("Nombre del estudiante " + (i + 1) + ": ");
    String nombre = teclado.nextLine();
    System.out.print("Nota de " + nombre + " (0 a 20): ");
    double nota = Double.parseDouble(teclado.nextLine());
    registro[i] = new Estudiante(nombre, nota);
}
```

Primero preguntamos cuántos estudiantes hay y creamos un array de ese tamaño. Luego, con un `for`, pedimos el nombre y la nota de cada uno, creamos el objeto con `new` y lo guardamos en su casillero.

¿Por qué usamos `Integer.parseInt(teclado.nextLine())` en lugar de `teclado.nextInt()`? Porque mezclar `nextInt()` con `nextLine()` causa un error muy común: el programa se "salta" una pregunta. Para evitarlo, leemos siempre la línea completa como texto y luego la convertimos en número.

- **Convertir** (o **parsear**): transformar un dato de un tipo a otro. Por ejemplo, el texto `"18"` en el número `18`.
- `Integer.parseInt(texto)` convierte un texto en un número entero (`int`).
- `Double.parseDouble(texto)` convierte un texto en un número con decimales (`double`).

---

## Práctica guiada (4:00 – 6:30)

Abre el enlace del ejercicio en la descripción, en el editor que prefieras. Si usas JDoodle, activa el modo **Interactive**. El archivo ya tiene la clase `Estudiante` empezada y el inicio de `main`. Completa los cinco pasos marcados en los comentarios:

1. **Paso 1**: crea el método `estaAprobado()`.
2. **Paso 2**: crea el método `mostrarFicha()`.
3. **Paso 3**: con un `for`, pide el nombre y la nota de cada estudiante y guárdalo en el array.
4. **Paso 4**: muestra la ficha de todos los estudiantes.
5. **Paso 5**: calcula el promedio del salón y encuentra la nota más alta.

Este es el reto más grande del curso, así que tómate tu tiempo. La solución del paso 5:

```java
double suma = 0;
Estudiante mejor = registro[0];
for (Estudiante e : registro) {
    suma = suma + e.getNota();
    if (e.getNota() > mejor.getNota()) {
        mejor = e;
    }
}
System.out.println("Promedio del salón: " + (suma / cantidad));
System.out.println("Nota más alta: " + mejor.getNombre() + " con " + mejor.getNota());
```

- **Acumulador**: una variable que va sumando valores en cada vuelta de un bucle. Aquí `suma` empieza en 0 y en cada vuelta se le agrega una nota. Al final la dividimos entre la cantidad para obtener el promedio.

Para encontrar la nota más alta suponemos que el primer estudiante es el mejor, y luego lo comparamos con cada uno: si alguien tiene más nota, pasa a ser el nuevo mejor. Es como buscar a la persona más alta de una fila mirando una por una.

---

## Probemos el programa (6:30 – 7:30)

Ejecutemos el registro con tres estudiantes: Ana con 18, Luis con 9 y Sofi con 25, este último a propósito.

```
Nota inválida para Sofi. Se registrará 0.

=== REGISTRO DEL SALÓN ===
- Ana | Nota: 18.0 | Aprobado
- Luis | Nota: 9.0 | Desaprobado
- Sofi | Nota: 0.0 | Desaprobado
Promedio del salón: 9.0
Nota más alta: Ana con 18.0
```

El setter detectó que 25 no es una nota válida y registró 0. Así funcionan los programas de verdad: siempre revisan que los datos tengan sentido. Gracias a la encapsulación, el error se atrapó en un solo lugar.

---

## Cierre (7:30 – 8:00)

¡Felicidades! Acabas de construir una aplicación orientada a objetos completa, usando todo lo aprendido en el curso. Si quieres seguir practicando, intenta agregar un atributo `edad` al estudiante o haz que el programa cuente cuántos aprobaron.

En la última lección te daremos consejos para escribir mejor código y evitar los errores más comunes.

¡Hasta la lección 8!
