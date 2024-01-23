package potencia;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        
        //Declaracion de variables
        double Cuadrado1,Cuadrado, base, exponente;
        //utilisamos la libreria Scanner
        Scanner entrada = new Scanner(System.in);
        //Le pedimos al usuario que nos de el valor de la base
        System.out.println("Digita el valor de base: ");
        base = entrada.nextDouble();
        //le pedimos al usuario que nos de el valor del exponente
        System.out.println("Digita el valor del exponente: ");
        exponente = entrada.nextDouble();        
        //
        Cuadrado1 = Math.pow(4, 2);  
        //
        //Realizamos la operacion
        Cuadrado = Math.pow(base, exponente);        
        //Imprimos en pantalla
        System.out.println("El cuadrado de 4 es: " + Cuadrado);
        System.out.println("El cuadrado de 4 es: " + Cuadrado1);
    }

}
