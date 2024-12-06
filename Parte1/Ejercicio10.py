class Matricula: 
    def __init__(self, ni, nom, pat, estr):
        self.ni = ni
        self.nom = nom
        self.pat = pat
        self.estr = estr
        self.matricu = 50000

    def matricula(self):
        if self.pat > 2000000 and self.estr > 3:
            self.matricu = self.matricu + (0.03 * self.pat)
        else:
            self.matricu = 50000

    def recibo(self):
        print(f"El estudiante con numero de inscripcion {self.ni} y nombre {self.nom} debe pagar ${self.matricu}")

ni = str(input("Ingrese el numero de su inscripcion: "))
nom = str(input("Ingrese su nombre: "))
pat = int(input("Ingrese su patrimonio: "))
estr = int(input("Ingrese su estrato socioeconomico: "))

pago = Matricula(ni, nom, pat, estr)
pago.matricula()
pago.recibo()
