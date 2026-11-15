// Lección 8: ¡Caza errores! (solución)

public class Main {
    public static void main(String[] args) {
        String clave = "java";
        String intento = "Java";                       // Error 1: faltaba el punto y coma
        int[] puntos = {10, 20, 30};

        System.out.println("Revisando la clave...");  // Error 2: "System" va con S mayúscula

        // Error 3: los textos se comparan con equals(), no con ==
        // equalsIgnoreCase() además ignora mayúsculas y minúsculas
        if (intento.equalsIgnoreCase(clave)) {
            System.out.println("Clave correcta");
        }

        // Error 4: era <= y el array llega solo hasta la posición length - 1
        int total = 0;                                 // Error 5: faltaba el punto y coma
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Puntos: " + puntos[i]);
            total = total + puntos[i];
        }

        System.out.println("Total: " + total);
    }
}
