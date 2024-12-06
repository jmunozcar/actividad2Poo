package com.mycompany.ejerciciop24;
import java.util.Scanner;

public class Ejerciciop24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los pesos de las esferas separados por un salto de línea(enter): ");
        double p1 = scanner.nextDouble();
        double p2 = scanner.nextDouble();
        double p3 = scanner.nextDouble();
        
        Esfera esfera1 = new Esfera(p1);
        Esfera esfera2 = new Esfera(p2);
        Esfera esfera3 = new Esfera(p3);
        
        double mayor = mayorPeso(esfera1, esfera2, esfera3);
        
        System.out.println("La esfera de mayor peso es la de: " + mayor + ".");
        
        
        
        
    }
    static double mayorPeso(Esfera e1, Esfera e2, Esfera e3){
            if (e1.peso > e2.peso && e1.peso > e3.peso) {
                return e1.peso;
            } else if (e2.peso > e1.peso && e2.peso > e3.peso) {
                return e2.peso;
            } else {
                return e3.peso;
            }
    }
}
