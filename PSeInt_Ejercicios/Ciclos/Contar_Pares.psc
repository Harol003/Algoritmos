Algoritmo Contar_Pares
	Escribir "Politecnico Internacional";
	Escribir "Programa: Contar cu�ntos n�meros pares hay entre 1 y 20";
	Definir i, contador Como Entero
    contador = 0
    Para i = 1 Hasta 20 Con Paso 1 Hacer
        Si i % 2 = 0 Entonces
            contador = contador + 1
        FinSi
    FinPara
    Escribir "Hay ", contador, " n�meros pares entre 1 y 20."
	Escribir "Gracias, Hasta luego.";
FinAlgoritmo
