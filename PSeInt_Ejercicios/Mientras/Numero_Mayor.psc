Algoritmo Numero_Mayor
	// Este programa encuentra el mayor n�mero ingresado por el usuario hasta que se ingrese un 0.
	Escribir "Este programa te permitir� encontrar el mayor n�mero que ingreses hasta que ingreses un 0."
	mayor <- -99999 // Inicializamos con un valor muy peque�o
	numero <- 1 // Inicializamos numero con un valor distinto de 0
	Mientras numero <> 0 Hacer
		Escribir "Ingresa un n�mero (0 para salir): "
		Leer numero
		Si numero > mayor Entonces
			mayor <- numero
		FinSi
	FinMientras
	Si mayor <> 0 Entonces
		Escribir "El mayor n�mero ingresado es: ", mayor
	SiNo
		Escribir "No se ingresaron n�meros v�lidos."
FinSi
FinAlgoritmo
