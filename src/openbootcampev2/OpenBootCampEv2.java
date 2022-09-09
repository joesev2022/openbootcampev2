package openbootcampev2;

import java.util.Scanner;

public class OpenBootCampEv2 {
    public static void main(String[] args) {
        int numeroIf, numeroWhile = 0, numeroFor;
        String estacion;

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.println("Ingrese número");
        numeroIf = sc.nextInt();
        if (numeroIf < 0){
            System.out.println("Es negativo");
        } else if (numeroIf == 0){
            System.out.println("Es cero");
        } else {
            System.out.println("Es positivo");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        // el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.
        while (numeroWhile < 3){
            System.out.println("Mostrando numero while " + numeroWhile);
            numeroWhile++;
        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        do {
            System.out.println("Mostrando número do-while: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        // variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
        // por pantalla.
        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Mostrando número for: " + numeroFor);
        }

        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
        // del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando
        // de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea
        // una estación.
        System.out.println("Ingrese estación:");
        estacion = sc.next().trim().toLowerCase();
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es estación.");
                break;
        }
    }
}
