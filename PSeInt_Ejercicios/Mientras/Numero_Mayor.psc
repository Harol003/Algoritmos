Algoritmo Numero_Mayor
	// Este programa encuentra el mayor número ingresado por el usuario hasta que se ingrese un 0.
	Escribir "Este programa te permitirá encontrar el mayor número que ingreses hasta que ingreses un 0."
	mayor <- -99999 // Inicializamos con un valor muy pequeño
	numero <- 1 // Inicializamos numero con un valor distinto de 0
	Mientras numero <> 0 Hacer
		Escribir "Ingresa un número (0 para salir): "
		Leer numero
		Si numero > mayor Entonces
			mayor <- numero
		FinSi
	FinMientras
	Si mayor <> 0 Entonces
		Escribir "El mayor número ingresado es: ", mayor
	SiNo
		Escribir "No se ingresaron números válidos."
FinSi
FinAlgoritmo
