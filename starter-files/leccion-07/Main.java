// Lección 7: Proyecto final - Registro de Estudiantes

import java.util.Scanner;

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

    // PASO 1: crea el método estaAprobado() que devuelva true si la nota es 11 o más.

    // PASO 2: crea el método mostrarFicha() que imprima nombre, nota y estado.
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes vas a registrar? ");
        int cantidad = Integer.parseInt(teclado.nextLine());
        Estudiante[] registro = new Estudiante[cantidad];

        // PASO 3: con un for, pide el nombre y la nota de cada estudiante
        // y guárdalo en el array "registro".

        // PASO 4: muestra la ficha de todos los estudiantes.

        // PASO 5: calcula el promedio del salón y encuentra la nota más alta.

        teclado.close();
    }
}
