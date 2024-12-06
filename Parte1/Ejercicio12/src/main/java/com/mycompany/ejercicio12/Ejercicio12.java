package com.mycompany.ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese el salario por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        Trabajador trabajador1 = new Trabajador(nombre, horasTrabajadas, salarioPorHora);
        
        System.out.println("EL TRABAJADOR " + trabajador1.nombre + "DEVENGÓ: $" + trabajador1.calcularSalario());
    }
}
