import math

class Circulo:
    def __init__(self, radio):
        self.radio = radio

    def area(self):
        return math.pi * self.radio ** 2

    def perimetro(self):
        return 2 * math.pi * self.radio


class Rectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return self.base * self.altura

    def perimetro(self):
        return 2 * (self.base + self.altura)


class Cuadrado:
    def __init__(self, lado):
        self.lado = lado

    def area(self):
        return self.lado ** 2

    def perimetro(self):
        return 4 * self.lado


class TrianguloRectangulo:
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def area(self):
        return (self.base * self.altura) / 2
    
    def hipotenusa(self):
        return math.sqrt((self.base ** 2) + (self.altura ** 2))

    def perimetro(self):
        return self.base + self.altura + self.hipotenusa()

    def tipo_triangulo(self):
        hipotenusa = self.hipotenusa()
        if self.base == self.altura == hipotenusa:
            return "Equilátero"
        elif self.base == self.altura or self.base == hipotenusa or self.altura == hipotenusa:
            return "Isósceles"
        else:
            return "Escaleno"


class PruebaFiguras:
    @staticmethod
    def main():
        figura1 = Circulo(2)
        figura2 = Rectangulo(1, 2)
        figura3 = Cuadrado(3)
        figura4 = TrianguloRectangulo(3, 5)

        print("Círculo:")
        print(f"  Área: {figura1.area()}")
        print(f"  Perímetro: {figura1.perimetro()}")

        print("Rectángulo:")
        print(f"  Área: {figura2.area()}")
        print(f"  Perímetro: {figura2.perimetro()}")

        print("Cuadrado:")
        print(f"  Área: {figura3.area()}")
        print(f"  Perímetro: {figura3.perimetro()}")

        print("Triángulo Rectángulo:")
        print(f"  Área: {figura4.area()}")
        print(f"  Perímetro: {figura4.perimetro():}")
        print(f"  Tipo: {figura4.tipo_triangulo()}")


if __name__ == "__main__":
    PruebaFiguras.main()