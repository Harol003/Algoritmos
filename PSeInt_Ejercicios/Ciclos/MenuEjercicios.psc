Algoritmo MenuEjercicios
	Escribir "Politecnico Internacional";
	Escribir "Programa Menu de Ejercicios";
	Definir opcion Como Entero
    Definir numero, suma, i, j, a, b, c Como Entero
    Definir promedio, sumaNumeros Como Real
    Definir mayorQue5 Como Entero
    mayorQue5 = 0
    Mientras Verdadero Hacer
        Escribir "Men� de Ejercicios - Elija una opci�n:"
        Escribir "1. Imprimir los n�meros del 1 al 5"
        Escribir "2. Sumar los n�meros del 1 al 5"
        Escribir "3. Imprimir la tabla de multiplicar del 2"
        Leer opcion
        
        Segun opcion Hacer
            Caso 1:
                Escribir "Ejercicio 1: N�meros del 1 al 5"
                Para i = 1 Hasta 5 Con Paso 1 Hacer
                    Escribir i
                FinPara
            Caso 2:
                suma = 0
                Escribir "Ejercicio 2: Suma de los n�meros del 1 al 5"
                Para i = 1 Hasta 5 Con Paso 1 Hacer
                    suma = suma + i
                FinPara
                Escribir "La suma es: ", suma
            Caso 3:
                Escribir "Ejercicio 3: Tabla de multiplicar del 2"
                Para j = 1 Hasta 10 Con Paso 1 Hacer
                    Escribir "2 x ", j, " = ", 2 * j
                FinPara
            De Otro Modo:
                Escribir "Opci�n no v�lida, intenta de nuevo."
        FinSegun
    FinMientras
FinAlgoritmo
