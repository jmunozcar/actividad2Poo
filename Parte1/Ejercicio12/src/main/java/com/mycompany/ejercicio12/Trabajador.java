package com.mycompany.ejercicio12;

public class Trabajador {
    String nombre;
    int horasTrabajadas;
    double salarioPorHora;
    
    public Trabajador(String nombre, int horasTrabajadas, double salarioPorHora){
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }
    
    double calcularSalario(){
        if (horasTrabajadas <= 40){
        return horasTrabajadas * salarioPorHora;
        }
        if ((40 < horasTrabajadas) && (horasTrabajadas <= 48)){
            return 40 * salarioPorHora + ((horasTrabajadas - 40) * 2 * salarioPorHora);
        }
        if (48 < horasTrabajadas) {
            return 40 * salarioPorHora + 8 * 2 * salarioPorHora + ((horasTrabajadas - 48) * 3 * salarioPorHora);
        }
        return 0;
    }
    
    
}
