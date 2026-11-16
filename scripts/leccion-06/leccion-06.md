# Guión — Lección 6: Encapsulación, arrays y cadenas

**Duración estimada**: 8 minutos

---

## Introducción (0:00 – 0:30)

En la lección anterior quedó un problema: cualquiera podía darle a una mascota 9999 de energía, o incluso energía negativa. En un videojuego real eso sería hacer trampa. En esta lección aprenderás a proteger los datos de tus objetos, a guardar muchos objetos juntos y a trabajar con textos.

---

## Encapsulación: datos bajo llave (0:30 – 1:45)

Piensa en el dinero de un banco. No está tirado sobre una mesa para que cualquiera lo tome: está dentro de una caja fuerte, y solo puedes sacarlo o depositarlo pasando por una ventanilla, donde alguien revisa que todo esté en orden.

- **Encapsulación**: proteger los atributos de un objeto para que nadie de afuera pueda cambiarlos directamente. Solo se pueden leer o modificar a través de métodos que controlan el acceso.
- **Modificador de acceso**: una palabra que indica quién puede usar un atributo o un método.
- **`private`**: el atributo solo puede usarse **dentro** de su propia clase. Es la caja fuerte.
- **`public`**: el atributo o método puede usarse desde **cualquier** parte del programa.

```java
class Mascota {
    private String nombre;
    private int energia;

    Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
    }
}
```

Si ahora intentamos cambiar la energía desde `main`:

```java
toby.energia = 500;
```

Java no nos deja y muestra un error como este: `energia has private access in Mascota`, que significa "energia es privada dentro de Mascota". ¡El dato está protegido!

- **Error de compilación**: un error que Java detecta antes de ejecutar el programa, cuando revisa que el código esté bien escrito.

---

## Getters y setters: las ventanillas (1:45 – 3:30)

Si los atributos están bajo llave, ¿cómo los leemos o cambiamos? Con métodos públicos que funcionan como ventanillas.

- **Getter**: un método que permite **leer** el valor de un atributo privado. Por costumbre su nombre empieza con `get`, que significa "obtener".
- **Setter**: un método que permite **cambiar** el valor de un atributo privado, pero revisando antes que el nuevo valor sea válido. Su nombre empieza con `set`, que significa "establecer".
- **Validación**: revisar que un dato tenga sentido antes de aceptarlo.

```java
public int getEnergia() {
    return energia;
}

public void setEnergia(int nuevaEnergia) {
    if (nuevaEnergia >= 0 && nuevaEnergia <= 100) {
        energia = nuevaEnergia;
    } else {
        System.out.println("Valor no válido: la energía debe estar entre 0 y 100.");
    }
}
```

El setter es como un guardia en la ventanilla: solo deja pasar valores entre 0 y 100.

- **`&&`**: el operador "y". La condición completa es verdadera solo si **las dos** partes son verdaderas.
- **`||`**: el operador "o". La condición es verdadera si **al menos una** de las partes es verdadera.

Probémoslo:

```java
toby.setEnergia(500);   // muestra: Valor no válido...
toby.setEnergia(80);    // se acepta
System.out.println(toby.getNombre() + " tiene " + toby.getEnergia() + " de energía.");
```

---

## Arrays: muchos datos en un solo lugar (3:30 – 5:00)

Imagina una fila de casilleros en el colegio, cada uno con un número. Así puedes guardar muchas cosas del mismo tipo en un solo lugar.

- **Array** (o arreglo): una variable que guarda varios valores del mismo tipo, uno detrás de otro, como una fila de casilleros numerados.
- **Índice**: el número de cada casillero. ¡Atención! En Java el primer casillero es el **0**, no el 1.
- **Longitud**: la cantidad de casilleros del array. Se obtiene con `.length`.

```java
String[] colores = {"rojo", "verde", "azul"};
System.out.println(colores[0]);        // rojo
System.out.println(colores[2]);        // azul
System.out.println(colores.length);    // 3
```

- Los corchetes `[]` después del tipo indican que es un array: `String[]` es un array de textos.
- Con `colores[0]` accedemos al casillero 0. Como hay 3 casilleros, los índices van del 0 al 2.

Los casilleros también pueden guardar objetos:

```java
Mascota[] mascotas = new Mascota[3];
mascotas[0] = new Mascota("Toby");
mascotas[1] = new Mascota("Michi");
mascotas[2] = new Mascota("Kiwi");

for (int i = 0; i < mascotas.length; i++) {
    System.out.println("Mascota " + (i + 1) + ": " + mascotas[i].getNombre());
}
```

- `new Mascota[3]` crea una fila de 3 casilleros vacíos, listos para guardar mascotas.
- **Recorrer un array**: visitar cada casillero, uno por uno, normalmente con un `for`.

Fíjate que la condición del `for` es `i < mascotas.length`, con "menor que" estricto, porque el último casillero es el 2, no el 3.

---

## For-each y métodos de los textos (5:00 – 5:45)

- **For-each**: una forma más corta de recorrer un array, sin usar índices. Se lee "para cada elemento dentro del array".

```java
for (Mascota m : mascotas) {
    String nombre = m.getNombre();
    System.out.println(nombre.toUpperCase() + " tiene " + nombre.length() + " letras.");
}
```

`for (Mascota m : mascotas)` se lee "para cada mascota `m` dentro de `mascotas`".

Los textos (`String`) también son objetos y tienen sus propios métodos:

- `.length()` cuenta cuántos caracteres tiene el texto: `"Toby".length()` da `4`.
- `.toUpperCase()` lo convierte a mayúsculas: `"Toby"` se vuelve `"TOBY"`.
- `.toLowerCase()` lo convierte a minúsculas.

Un detalle que confunde a muchos: en los textos `length()` lleva paréntesis, porque es un método; en los arrays `length` va sin paréntesis.

---

## Práctica guiada (5:45 – 7:15)

Abre el enlace del ejercicio en la descripción, en el editor que prefieras. Ya tiene la clase `Mascota` con atributos privados y sus getters. Completa los tres retos:

1. **Reto 1**: crea `setEnergia(int nuevaEnergia)` que solo acepte valores entre 0 y 100.
2. **Reto 2**: crea un array de 3 mascotas y recórrelo con un `for` para mostrar sus nombres.
3. **Reto 3**: muestra el nombre de cada mascota en mayúsculas y cuántas letras tiene.

Un reto extra: en el ejercicio hay una línea comentada que dice `toby.energia = 500;`. Quítale las dos barras y presiona Run para ver con tus propios ojos el error de `private`.

---

## Cierre (7:15 – 8:00)

Hoy aprendiste a proteger los datos con `private`, a leerlos con getters y a cambiarlos de forma segura con setters. También guardaste varios objetos en un array, lo recorriste con `for` y con for-each, y usaste métodos de los textos.

¡Ya tienes todas las piezas! En la siguiente lección las juntarás en tu proyecto final: un registro de estudiantes.

¡Hasta la lección 7!
