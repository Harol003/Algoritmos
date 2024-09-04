Algoritmo Sumar_Multiplicar_Pares
	// Este programa suma los números pares y multiplica los números impares ingresados por el usuario hasta que se ingrese un 0.
	Escribir "Este programa sumará los números pares y multiplicará los números impares que ingreses, hasta que ingreses un 0."
	suma_pares <- 0
	producto_impares <- 1
	numero <- 1 // Inicializamos numero con un valor distinto de 0
	Mientras numero <> 0 Hacer
		Escribir "Ingresa un número (0 para salir): "
		Leer numero
		Si numero <> 0 Entonces
			Si numero % 2 = 0 Entonces
				suma_pares <- suma_pares + numero
			SiNo
				producto_impares <- producto_impares * numero
			FinSi
		FinSi
	FinMientras
	Escribir "La suma de los números pares es: ", suma_pares
	Escribir "El producto de los números impares es: ", producto_impares
FinAlgoritmo
