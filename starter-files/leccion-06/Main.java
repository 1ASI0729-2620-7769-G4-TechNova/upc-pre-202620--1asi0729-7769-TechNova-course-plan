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
}

public class Main {
  public static void main(String args[]) {
    Mascota toby = new Mascota("toby");
    //toby.energia = 500;
    //toby.setEnergia(500);   // muestra: Valor no válido...
    System.out.println(toby.getNombre() + " tiene " + toby.getEnergia() + " de energía.");
    String[] colores = {"rojo", "verde", "azul"};
    System.out.println(colores[0]);        // rojo
    System.out.println(colores[2]);        // azul
    System.out.println(colores.length);    // 3
  }
}