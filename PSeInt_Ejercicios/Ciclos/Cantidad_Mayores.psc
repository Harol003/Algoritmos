Algoritmo Cantidad_Mayores
	Escribir "Politecnico Internacional";
	Escribir "Programa: Contar cuántos números son mayores a 10 en una lista de 10 elementos";
	Definir i, numero, contador Como Entero
    contador = 0
    Para i=1 Hasta 10 Con Paso 1 Hacer
        Escribir "Ingresa un número: "
        Leer numero
        Si numero > 10 Entonces
            contador = contador + 1
        FinSi
    FinPara
    Escribir "Cantidad de números mayores a 10: ", contador
	Escribir "Gracias, Hasta luego.";
FinAlgoritmo
