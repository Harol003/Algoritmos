Algoritmo Contar_Digitos
	// Este programa cuenta el n�mero de d�gitos de un n�mero ingresado por el usuario.
	Escribir "Este programa contar� el n�mero de d�gitos del n�mero que ingreses."
	Escribir "Ingresa un n�mero: "
	Leer numero
	contador_digitos <- 0
	Mientras numero <> 0 Hacer
		numero <- numero / 10
		contador_digitos <- contador_digitos + 1
	FinMientras
	Escribir "El n�mero tiene ", contador_digitos, " d�gitos."
FinAlgoritmo
