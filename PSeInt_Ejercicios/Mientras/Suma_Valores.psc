Algoritmo Suma_Valores
	Escribir "Este programa sumar� todos los n�meros que ingreses hasta que ingreses un 0."
	suma <- 0
	numero <- 1 // Inicializamos numero con un valor distinto de 0
	Mientras numero <> 0 Hacer
		Escribir "Ingresa un n�mero (0 para salir): "
		Leer numero
		suma <- suma + numero
	FinMientras
	Escribir "La suma total es: ", suma
FinAlgoritmo
