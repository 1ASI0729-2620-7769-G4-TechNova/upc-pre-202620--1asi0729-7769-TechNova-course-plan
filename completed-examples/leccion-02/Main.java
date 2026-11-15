// Lección 2: Variables, tipos de datos y operadores (solución)

public class Main {
    public static void main(String[] args) {
        String nombre = "Luna";
        int nivel = 7;
        int puntos = 350;
        double horasJugadas = 12.5;
        boolean esPremium = false;

        System.out.println("Jugador: " + nombre);
        System.out.println("Nivel: " + nivel);

        // RETO 1
        System.out.println("Puntos: " + puntos);
        System.out.println("Horas jugadas: " + horasJugadas);
        System.out.println("¿Es premium? " + esPremium);

        // RETO 2
        int nivelesCompletos = puntos / 100;   // 350 / 100 = 3
        int puntosSobrantes = puntos % 100;    // 350 % 100 = 50
        System.out.println("Niveles completos con sus puntos: " + nivelesCompletos);
        System.out.println("Puntos que sobran: " + puntosSobrantes);

        // RETO 3
        int nota1 = 15;
        int nota2 = 18;
        int nota3 = 14;
        double promedio = (nota1 + nota2 + nota3) / 3.0; // 3.0 para obtener decimales
        System.out.println("Promedio: " + promedio);
    }
}
