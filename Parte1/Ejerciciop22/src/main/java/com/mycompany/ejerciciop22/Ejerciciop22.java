package com.mycompany.ejerciciop22;
import java.util.Scanner;

public class Ejerciciop22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el salario por hora: ");
        double sPH = scanner.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas: ");
        int hT = scanner.nextInt();
        
        Empleado empleado = new Empleado(nombre, sPH, hT);
        
        System.out.println("El salario de " + empleado.nombre + " es de: $ " + empleado.getSalarioMensual());
    }
}
