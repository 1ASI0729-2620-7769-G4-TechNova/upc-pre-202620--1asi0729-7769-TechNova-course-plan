// Lección 3: Decisiones (if-else) y bucles (for, while) (solución)

public class Main {
    public static void main(String[] args) {
        int nota = 13;

        // RETO 1
        if (nota >= 18) {
            System.out.println("¡Excelente!");
        } else if (nota >= 11) {
            System.out.println("¡Aprobaste!");
        } else {
            System.out.println("Sigue practicando, ¡tú puedes!");
        }

        // Tabla de multiplicar del 5
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // RETO 2
        int cuenta = 5;
        while (cuenta >= 1) {
            System.out.println(cuenta + "...");
            cuenta--;
        }
        System.out.println("¡Despegue!");
    }
}
