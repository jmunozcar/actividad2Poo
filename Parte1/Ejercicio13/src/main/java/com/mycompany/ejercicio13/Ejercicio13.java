package com.mycompany.ejercicio13;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el color de la bolita: ");
        String color = scanner.nextLine();
        
        double pdes = 0;
        
        if (color.equals("blanco")){
            pdes = 0;
        } else if (color.equals("verde")) {
            pdes = 10;
        } else if (color.equals("amarillo")) {
            pdes = 25;
        } else if (color.equals("azul")) {
            pdes = 50;
        } else {
            pdes = 100;
        }
        
        double valorAPagar = valorCompra - valorCompra * pdes / 100;
        System.out.println("El cliente debe pagar: $" + valorAPagar);
    }
}
