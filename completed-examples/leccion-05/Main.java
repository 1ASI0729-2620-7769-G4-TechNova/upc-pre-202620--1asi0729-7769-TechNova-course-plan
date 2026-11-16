class Mascota {
    // Atributos: lo que la mascota TIENE
    String nombre;
    String especie;
    int energia;
    
    Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.energia = 50;
    }

    // Métodos: lo que la mascota HACE
    void jugar() {
        energia = energia - 10;
        System.out.println(nombre + " jugó con la pelota.");
    }

    void mostrarEstado() {
        System.out.println(nombre + " (" + especie + ") tiene " + energia + " de energía.");
    }
    
    void comer() {
        energia = energia + 20;
        System.out.println(nombre + " comió su comida favorita.");
    }
}

public class Main {
  public static void main(String args[]) {
    Mascota mascota1 = new Mascota("Toby", "perro");
    mascota1.jugar();
    mascota1.mostrarEstado();
    
    Mascota mascota2 = new Mascota("Michi", "gato");
    mascota2.comer();
    mascota2.mostrarEstado();   // Michi (gato) tiene 70 de energía.
  }
}