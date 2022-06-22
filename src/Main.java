public class Main {
  static Ejercico4 ejercico4 = new Ejercico4();
  static Coche miCoche = new Coche();

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    int resultado = suma(5, 9, 8);
    System.out.println(resultado);
    ////////////////////////////
    miCoche.sumarPuerta();
    System.out.println("El numero de puertas es: " + miCoche.puerta);
    ////////////////////////////

    System.out.println(ejercico4);
  }

}
