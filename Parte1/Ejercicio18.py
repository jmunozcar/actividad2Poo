class Empleado: 
    def __init__(self,codigo,nombre,numhoras,valhoras,retencion):
        self.codigo = codigo
        self.nombre = nombre
        self.numhoras = numhoras
        self.valhoras = valhoras
        self.retencion = retencion

    def verdatos(self, sal_bruto, sal_neto):
        print(f"El codigo es: {self.codigo}")
        print(f"El nombre es: {self.nombre}")
        print(f"El salario bruto es: ${sal_bruto}")
        print(f"El salario neto es: ${sal_neto}")
        
    def salario_bruto(self):
        return self.numhoras * self.valhoras
    
    def salario_neto(self, sal_bruto):
        sal_neto = sal_bruto - (sal_bruto * self.retencion / 100)
        return sal_neto

codigo = int(input("Ingrese el codigo del empleado: "))
nombre = str(input("Ingrese el nombre del empleado: "))
numhoras = float(input("Ingrese el numero de horas trbajadas al mes: "))
valhoras = float(input("Ingrese el valor por hora trabajada: "))
retencion = float(input("Ingrese el porcentaje de retencion fuente: "))

emple = Empleado(codigo, nombre, numhoras, valhoras, retencion)
sal_bruto = emple.salario_bruto()
sal_neto = emple.salario_neto(sal_bruto)

emple.verdatos(sal_bruto, sal_neto)