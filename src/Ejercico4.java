public class Ejercico4 {
  String estaciones = "otoño";
  int contador = 0;
  int contadorDoWhile = 1;
  int numeroif = 5;
  {
    if (numeroif >= 0) {
      System.out.println("Este numero es positivo");
    } else {
      System.out.println("Este numero es negativo");
    }
    while (contador < 3) {
      contador++;
      System.out.println("El valor de contador es: " + contador);
    }

    do {
      System.out.println("Contador do while vale: " + contadorDoWhile);

    } while (contadorDoWhile <= 0);
    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println("Esta es la variable for"+ numeroFor);
    }

    switch (estaciones) {
      case "otoño":
        System.out.println("Estamos en otoño");

        break;
      case "primavera":
        System.out.println("Estamos en primavera");

        break;
      case "verano":
        System.out.println("Estamos en verano");

        break;
      case "invierno":
        System.out.println("Estamos en invierno");

        break;

      default:
        break;
    }

  }
}
