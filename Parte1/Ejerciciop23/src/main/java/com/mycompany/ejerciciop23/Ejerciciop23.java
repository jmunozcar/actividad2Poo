package com.mycompany.ejerciciop23;
import java.util.Scanner;

public class Ejerciciop23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los parámetros A, B y C respectivamente, separados con un salto de linea(enter): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        double sol1 = (-b + Math.sqrt((Math.pow(b, 2)- 4 * a * c)))/(2 * a);
        double sol2 = (-b - Math.sqrt((Math.pow(b, 2)- 4 * a * c)))/(2 * a);
        
        System.out.println("Las raíces de su ecuación son: \nx = " + sol1 + "\nx= " + sol2);
        
    }
}
