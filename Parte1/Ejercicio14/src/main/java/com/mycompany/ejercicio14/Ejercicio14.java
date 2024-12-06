package com.mycompany.ejercicio14;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las ventas del departamento 1: ");
        int ventas1 = scanner.nextInt();
        System.out.println("Ingrese las ventas del departamento 2: ");
        int ventas2 = scanner.nextInt();
        System.out.println("Ingrese las ventas del departamento 3: ");
        int ventas3 = scanner.nextInt();
        System.out.println("Ingrese el salario base de los trabajadores: ");
        double salarioBase = scanner.nextDouble();
        
        Departamento.setSalarioBase(salarioBase);
        
        Departamento departamento1 = new Departamento(ventas1);
        Departamento departamento2 = new Departamento(ventas2);
        Departamento departamento3 = new Departamento(ventas3);
        
        departamento1.calcularSalarioDepartamento();
        departamento2.calcularSalarioDepartamento();
        departamento3.calcularSalarioDepartamento();
        
        System.out.println("SALARIO DEPARTAMENTO 1: " + departamento1.salarioDepartamento + "\nSALARIO DEPARTAMENTO 2: " + departamento2.salarioDepartamento + "\nSALARIO DEPARTAMENTO 3: " + departamento3.salarioDepartamento);
        
        
    }
}