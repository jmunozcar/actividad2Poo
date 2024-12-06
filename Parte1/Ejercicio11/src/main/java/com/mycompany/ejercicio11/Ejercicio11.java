package com.mycompany.ejercicio11;
import java.util.Scanner;

public class Ejercicio11 {
    static double mayorDeTresNumeros(double n1, double n2, double n3){
        if ((n1 > n2) && (n1 > n3)){
        return n1;
        }
         if ((n2 > n1) && (n2 > n3)){
        return n2;
        }
        if ((n3 > n2) && (n3 > n1)){
        return n3;
        }
        return n1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tres números, separados con un salto de línea: ");
        
        Double primerNumero = scanner.nextDouble();
        Double segundoNumero = scanner.nextDouble();
        Double tercerNumero = scanner.nextDouble();
        
        System.out.println("El mayor de los números ingresados es: " + mayorDeTresNumeros(primerNumero, segundoNumero, tercerNumero));        
        
        
        
    }

}
