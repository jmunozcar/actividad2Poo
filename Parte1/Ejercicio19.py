import math
class Triangulo:

    def __init__(self, lado):
        self.lado = lado
        self.altura1 = 0.0
        self.area1 = 0.0

    def perimetro(self):
        a = self.lado * 3
        print(f"El perimetro del triangulo con lado {self.lado} es {a}")

    def altura(self):
        self.altura1 = math.sqrt((self.lado**2) - ((self.lado/2)**2))
        print(f"La altura del triangulo con lado {self.lado} es {self.altura1}")

    def area(self):
        self.area1 = (self.lado * self.altura1)/2
        print(f"El area del triangulo con lado {self.lado} es {self.area1}")

lado = float(input("Escriba el lado del triangulo equilatero: "))

trian = Triangulo(lado)
trian.perimetro()
trian.altura()
trian.area()
