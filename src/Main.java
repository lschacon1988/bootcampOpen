public class Main {
  public static void main(String[] args) {
    int resultado = suma(5, 9, 8);
    System.out.println(resultado);
    Coche miCoche = new Coche();
    miCoche.sumarPuerta();
    System.out.println("El numero de puertas es: " + miCoche.puerta);
    ////////////////////////////
    int numeroIf = 5;
    extracted(numeroIf);
    ///////////////////////////
    int contador = 0;
    while (contador < 3){
      System.out.println("contador vale: " + contador);
      contador++;
    }
    do{
      System.out.println("contador do while vale : " + contador);
    }while (contador < 0);
  for (int numeroFor= 0; numeroFor <=3 ; numeroFor++){
    System.out.println("esta es la variable numeroFor: "+ numeroFor);
  }
  ///////////////////////////////
   String estacion= "verano";

  switch (estacion){
    case "primavera":{
     System.out.println("Estamos en: "+ estacion);
     break;
    }
    case "otoño":{
      System.out.println("Estamos en otoño");
      break;
    }
    case "verano":{
      System.out.println("Estamos en verano ");
      break;
    }
    case "invierno":{
      System.out.println("Estamos en invierno ");
      break;
    }
    default:{
      System.out.println("Esto no es una estacion valida ");
      break;
    }

  }

  }
  
  private static void extracted(int numeroIf) {
    if (numeroIf >= 0) {
      System.out.println("Este numero es positivo");
    } else {
      System.out.println("Este numero es negativo");
    }
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