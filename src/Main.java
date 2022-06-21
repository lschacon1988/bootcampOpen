public class Main {
  public static void main(String[] args) {
    int resultado = suma(5, 9, 8);
    System.out.println(resultado);
    Coche miCoche = new Coche();
    miCoche.sumarPuerta();
    System.out.println("El numero de puertas es: " + miCoche.puerta);
  }
  public static int suma(int a, int b, int c) {
    return a + b + c;
  }
}

class Coche {
  public int puerta = 4;

  public void sumarPuerta() {
    this.puerta++;
  }

}