class Numero:

    def __init__(self, a, b):
        self.a = a
        self.b = b


    def comparacion(self):
        if self.a > self.b:
            print(f"{self.a} es mayor que {self.b}.")

        elif self.a == self.b:
            print(f"{self.a} es igual que {b}.")

        else:
            print(f"{self.a} es menor que {b}.")

a = int(input("Escriba su numero A: "))
b = int(input("Escriba su numero B: "))

num = Numero(a, b)
num.comparacion()
