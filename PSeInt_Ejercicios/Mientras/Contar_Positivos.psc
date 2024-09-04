Algoritmo Contar_Positivos
	Escribir "Este programa contará cuántos números positivos ingresas hasta que ingreses un número negativo."
	contador_positivos <- 0
	numero <- 0
	Mientras numero >= 0 Hacer
		Escribir "Ingresa un número (negativo para terminar): "
		Leer numero
		Si numero > 0 Entonces
			contador_positivos <- contador_positivos + 1
		FinSi
	FinMientras
	Escribir "Ingresaste ", contador_positivos, " números positivos."
FinAlgoritmo
