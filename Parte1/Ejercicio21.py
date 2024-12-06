import math
class Triangulox: 
    def __init__(self, lado1, lado2, lado3):
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
        self.peri = 0
        self.semperi = 0
        self.area1 = 0

    def perimetro(self):
            self.peri = self.lado1 + self.lado2 + self.lado3
            print(f"El perimetro del triangulo es {self.peri}")

    def semi_perimetro(self):
            self.semiperi = self.peri/2
            print(f"El semiperimetro del triangulo es {self.semiperi}")

    def area(self):
            self.area1 = math.sqrt(self.semiperi*(self.semiperi - self.lado1)*(self.semiperi - self.lado2)*(self.semiperi - self.lado3))
            print(f"El area del triangulo utilizando la formula de Heron es {self.area1}")


lado1 = float(input("Ingrese el valor del lado 1: "))
lado2 = float(input("Ingrese el valor del lado 2: "))
lado3 = float(input("Ingrese el valor del lado 3: "))

trian = Triangulox(lado1, lado2, lado3)
trian.perimetro()
trian.semi_perimetro()
trian.area()
