public class Main {
  static Ejercico4 ejercico4 = new Ejercico4();
  static Coche miCoche = new Coche();
  static Personas persona1 = new Personas();

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    int resultado = suma(5, 9, 8);
    System.out.println(resultado);
    ////////////////////////////
    miCoche.sumarPuerta();
    System.out.println("El numero de puertas es: " + miCoche.puerta);
    /////////////ejercico tema 4///////////////
    // System.out.println(ejercico4);
    /////////////ejercico tema 8///////////////

    persona1.setEdad(34);
    persona1.setTelefono(310261882);
    persona1.setName("luis");
    System.out.println("Edad: "+ persona1.getEdad());
    System.out.println("Telefono: "+ persona1.getTelefono());
    System.out.println("Name: "+ persona1.getName());
  }

}
