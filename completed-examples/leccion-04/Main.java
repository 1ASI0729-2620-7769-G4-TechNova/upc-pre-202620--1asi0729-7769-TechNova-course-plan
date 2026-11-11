// Lección 4: Métodos y entrada/salida con Scanner (solución)

import java.util.Scanner;

public class Main {

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al juego.");
    }

    // RETO 1
    public static void darPista(int intento, int secreto) {
        if (intento < secreto) {
            System.out.println("¡Más alto!");
        } else {
            System.out.println("¡Más bajo!");
        }
    }

    // Método con retorno: devuelve un valor
    public static boolean esCorrecto(int intento, int secreto) {
        return intento == secreto;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        int secreto = (int) (Math.random() * 10) + 1;
        int intento = 0;
        int vidas = 0;

        // RETO 2
        while (!esCorrecto(intento, secreto)) {
            System.out.print("Escribe un número del 1 al 10: ");
            intento = teclado.nextInt();
            vidas++;
            if (!esCorrecto(intento, secreto)) {
                darPista(intento, secreto);
            }
        }
        System.out.println("¡Adivinaste, " + nombre + "! Lo lograste en " + vidas + " intentos.");

        teclado.close();
    }
}
