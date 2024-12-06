package com.mycompany.ejercicio14;


public class Departamento {
    static int ventasTotales;
    static double salarioBaseTrabajadores;
    double salarioDepartamento;
    int ventasPorDepartamento;
    
    public Departamento(int ventas){
        ventasTotales += ventas;
        ventasPorDepartamento = ventas;
    }
    
    public static void setSalarioBase(double salario) {
        salarioBaseTrabajadores = salario;
    }
    
    public void calcularSalarioDepartamento(){
        double porcentajeIncentivo = 0;
        if (this.ventasPorDepartamento > (ventasTotales * 33 / 100)) {
            porcentajeIncentivo = 20;
        }
        this.salarioDepartamento = salarioBaseTrabajadores + salarioBaseTrabajadores * porcentajeIncentivo / 100;
                    
    }
}
