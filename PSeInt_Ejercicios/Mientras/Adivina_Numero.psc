Algoritmo Adivina_Numero
	// Este programa permite al usuario adivinar un n�mero secreto.
	Escribir "Este programa te permitir� adivinar un n�mero secreto entre 1 y 10."
	numero_secreto <- 7
	intento <- 0
	Mientras intento <> numero_secreto Hacer
		Escribir "Adivina el n�mero secreto (entre 1 y 10): "
		Leer intento
		Si intento <> numero_secreto Entonces
			Escribir "Incorrecto, intenta nuevamente."
		FinSi
	FinMientras
	Escribir "�Correcto! El n�mero secreto es ", numero_secreto
FinAlgoritmo
