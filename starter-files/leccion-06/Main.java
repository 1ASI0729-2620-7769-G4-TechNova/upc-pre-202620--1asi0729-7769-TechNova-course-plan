class Mascota {
    private String nombre;
    private int energia;

    Mascota(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int nuevaEnergia) {
        if (nuevaEnergia >= 0 && nuevaEnergia <= 100) {
            energia = nuevaEnergia;
        } else {
            System.out.println("Valor no válido: la energía debe estar entre 0 y 100.");
        }
    }
}

public class Main {
  public static void main(String args[]) {
    Mascota toby = new Mascota("toby");
    //toby.energia = 500;
    //toby.setEnergia(500);   // muestra: Valor no válido...
    toby.setEnergia(80);    // se acepta
    System.out.println(toby.getNombre() + " tiene " + toby.getEnergia() + " de energía.");
    String[] colores = {"rojo", "verde", "azul"};
    System.out.println(colores[0]);        // rojo
    System.out.println(colores[2]);        // azul
    System.out.println(colores.length);    // 3
    Mascota[] mascotas = new Mascota[3];
    mascotas[0] = new Mascota("Toby");
    mascotas[1] = new Mascota("Michi");
    mascotas[2] = new Mascota("Kiwi");

    for (int i = 0; i < mascotas.length; i++) {
        System.out.println("Mascota " + (i + 1) + ": " + mascotas[i].getNombre());
    }
    
    for (Mascota m : mascotas) {
        String nombre = m.getNombre();
        System.out.println(nombre.toUpperCase() + " tiene " + nombre.length() + " letras.");
    }
  }
}