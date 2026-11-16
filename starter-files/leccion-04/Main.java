// Lección 4: Métodos y entrada/salida con Scanner
// Juego: adivina el número secreto del 1 al 10.

import java.util.Scanner;

public class Main {

    // Método sin retorno: solo saluda
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al juego.");
    }

    // Método con retorno: devuelve true si el intento es igual al secreto
    public static boolean esCorrecto(int intento, int secreto) {
        return intento == secreto;
    }

    // RETO 1: crea un método "darPista" que reciba el intento y el secreto
    // y le diga al jugador si el número secreto es MAYOR o MENOR que su intento.
    // Ejemplo: "Pista: el número secreto es MAYOR que 5."

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        int secreto = (int) (Math.random() * 10) + 1; // número al azar del 1 al 10
        int intento = 0;          // empieza en 0 para que el while se ejecute al menos una vez
        int totalIntentos = 0;    // cuenta cuántas veces intentó el jugador

        // RETO 2: con un while, pide números hasta que el jugador adivine.
        // En cada vuelta: pide un número, súmale 1 a totalIntentos
        // y, si falló, llama a darPista(). Al salir del while, felicítalo.

        teclado.close();
    }
}