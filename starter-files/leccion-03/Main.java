// Lección 3: Decisiones (if-else) y bucles (for, while)

public class Main {
    public static void main(String[] args) {
        int nota = 13;

        // DECISIÓN: ¿aprobó o desaprobó? (en escala de 0 a 20 se aprueba con 11)
        if (nota >= 11) {
            System.out.println("¡Aprobaste!");
        } else {
            System.out.println("Sigue practicando, ¡tú puedes!");
        }

        // BUCLE FOR: tabla de multiplicar del 5
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // RETO 1: agrega un "else if" que diga "¡Excelente!" cuando la nota sea 18 o más.

        // RETO 2: con un while, haz una cuenta regresiva de 5 a 1 y al final muestra "¡Despegue!".
    }
}
