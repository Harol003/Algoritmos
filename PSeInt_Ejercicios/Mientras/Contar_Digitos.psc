Algoritmo Contar_Digitos
	// Este programa cuenta el número de dígitos de un número ingresado por el usuario.
	Escribir "Este programa contará el número de dígitos del número que ingreses."
	Escribir "Ingresa un número: "
	Leer numero
	contador_digitos <- 0
	Mientras numero <> 0 Hacer
		numero <- numero / 10
		contador_digitos <- contador_digitos + 1
	FinMientras
	Escribir "El número tiene ", contador_digitos, " dígitos."
FinAlgoritmo
