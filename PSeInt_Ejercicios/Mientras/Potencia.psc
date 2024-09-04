Algoritmo Potencia
	// Este programa calcula la potencia de un número base elevado a un exponente, ingresados por el usuario.
	Escribir "Este programa calculará la potencia de un número base elevado a un exponente."
	Escribir "Ingresa la base: "
	Leer base
	Escribir "Ingresa el exponente: "
	Leer exponente
	resultado <- 1
	contador <- 0
	Mientras contador < exponente Hacer
		resultado <- resultado * base
		contador <- contador + 1
	FinMientras
	Escribir base, " elevado a ", exponente, " es igual a: ", resultado
FinAlgoritmo
