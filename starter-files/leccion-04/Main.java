// Lección 4: Métodos y entrada/salida con Scanner
// Juego: adivina el número secreto del 1 al 10.

import java.util.Scanner;

public class Main {

    // Método sin retorno: solo saluda
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al juego.");
    }

    // RETO 1: crea un método "darPista" que reciba el intento y el secreto
    // y muestre "Más alto" o "Más bajo".

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = teclado.nextLine();
        saludar(nombre);

        int secreto = (int) (Math.random() * 10) + 1; // número al azar del 1 al 10
        int intento = 0;

        // RETO 2: con un while, pide números hasta que el jugador adivine.
        // Usa darPista() cuando falle y felicítalo cuando acierte.

        teclado.close();
    }
}
