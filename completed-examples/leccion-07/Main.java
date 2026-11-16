// Lección 7: Proyecto final - Registro de Estudiantes (solución)

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

    // PASO 1
    public boolean estaAprobado() {
        return nota >= 11;
    }

    // PASO 2
    public void mostrarFicha() {
        String estado = estaAprobado() ? "Aprobado" : "Desaprobado";
        System.out.println("- " + nombre + " | Nota: " + nota + " | " + estado);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes vas a registrar? ");
        int cantidad = Integer.parseInt(teclado.nextLine());
        Estudiante[] registro = new Estudiante[cantidad];

        // PASO 3
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.nextLine();
            System.out.print("Nota de " + nombre + " (0 a 20): ");
            double nota = Double.parseDouble(teclado.nextLine());
            registro[i] = new Estudiante(nombre, nota);
        }

        // PASO 4
        System.out.println();
        System.out.println("=== REGISTRO DEL SALÓN ===");
        for (Estudiante e : registro) {
            e.mostrarFicha();
        }

        // PASO 5
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

        teclado.close();
    }
}
