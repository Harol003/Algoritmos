Algoritmo Contar_Positivos
	Escribir "Este programa contar� cu�ntos n�meros positivos ingresas hasta que ingreses un n�mero negativo."
	contador_positivos <- 0
	numero <- 0
	Mientras numero >= 0 Hacer
		Escribir "Ingresa un n�mero (negativo para terminar): "
		Leer numero
		Si numero > 0 Entonces
			contador_positivos <- contador_positivos + 1
		FinSi
	FinMientras
	Escribir "Ingresaste ", contador_positivos, " n�meros positivos."
FinAlgoritmo
