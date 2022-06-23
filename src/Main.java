public class Main {
  static Ejercico4 ejercico4 = new Ejercico4();
  static Coche miCoche = new Coche();
  static Personas persona1 = new Personas();
  static Cliente cliente = new Cliente();
  static Trabajador trabajador = new Trabajador();

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    int resultado = suma(5, 9, 8);
    System.out.println(resultado);
    ////////////////////////////
    miCoche.sumarPuerta();
    System.out.println("El numero de puertas es: " + miCoche.puerta);
    ///////////// ejercico tema 4///////////////
    // System.out.println(ejercico4);
    ///////////// ejercico tema 8///////////////

    persona1.setEdad(34);
    System.out.println("Edad: " + persona1.getEdad());
    persona1.setTelefono(310261882);
    System.out.println("Telefono: " + persona1.getTelefono());
    persona1.setName("luis");
    System.out.println("Name: " + persona1.getName());
    ///////////// ejercico tema 9///////////////
    cliente.nombre = "Luis";
    cliente.edad = 34;
    cliente.telefono = 310261882;
    cliente.credito = 17000.8;    
    System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito);
   ///////////// ejercico tema 9///////////////
   trabajador.nombre = "Luis";
   trabajador.edad = 34;
   trabajador.telefono = 310261882;
   trabajador.salario= 1200.5;
   System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
   + " y mi salario es " + trabajador.salario);

  }

}
