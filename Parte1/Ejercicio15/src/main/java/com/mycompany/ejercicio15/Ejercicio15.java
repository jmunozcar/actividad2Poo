package com.mycompany.ejercicio15;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de las esfera A:");
        double pesoA = scanner.nextDouble();
        System.out.println("Ingrese el peso de las esfera B:");
        double pesoB = scanner.nextDouble();
        System.out.println("Ingrese el peso de las esfera C:");
        double pesoC = scanner.nextDouble();
        System.out.println("Ingrese el peso de las esfera D:");
        double pesoD = scanner.nextDouble();
                
        Esfera esferaA = new Esfera(pesoA);
        Esfera esferaB = new Esfera(pesoB);
        Esfera esferaC = new Esfera(pesoC);
        Esfera esferaD = new Esfera(pesoD);
        
        String diferente;
        String comparacion = "MENOR";
        if ((esferaA.getPeso() == esferaB.getPeso()) && (esferaA.getPeso() == esferaC.getPeso())){
            diferente = "D";
            if (esferaD.getPeso() > esferaA.getPeso()){
                comparacion = "MAYOR";
            }
        } else if ((esferaB.getPeso() == esferaC.getPeso()) && (esferaB.getPeso() == esferaD.getPeso())) {
            diferente = "A";
            if (esferaA.getPeso() > esferaB.getPeso()){
                comparacion = "MAYOR";
            }
        } else if ((esferaA.getPeso() == esferaC.getPeso()) && (esferaA.getPeso() == esferaD.getPeso())){
            diferente = "B";
            if (esferaB.getPeso() > esferaA.getPeso()){
                comparacion = "MAYOR";
            }
        } else {
            diferente = "C";
            if (esferaC.getPeso() > esferaA.getPeso()){
                comparacion = "MAYOR";
            }
        }
        
        System.out.println("LA ESFERA " + diferente + " ES LA DIFERENTE Y ES DE " + comparacion + " PESO");
        
    }
}
