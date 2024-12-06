package com.mycompany.ejerciciop22;

public class Empleado {
    String nombre;
    double salarioPorHora;
    int numeroDeHorasTrabajadas;
    double salarioMensual;
    
    public Empleado(String nombre, double salarioPorHora, int numeroDeHorasTrabajadas){
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
        salarioMensual = salarioPorHora * numeroDeHorasTrabajadas;
    }
    
    public double getSalarioMensual(){
        return salarioMensual;
    }
}
