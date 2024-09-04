Algoritmo Password
	// Este programa solicita una contraseña al usuario hasta que ingrese la correcta.
	Escribir "Este programa te pedirá que ingreses una contraseña hasta que sea correcta."
	contraseña_correcta <- "1234"
	contraseña <- ""
	Mientras contraseña <> contraseña_correcta Hacer
		Escribir "Ingresa la contraseña: "
		Leer contraseña
		Si contraseña <> contraseña_correcta Entonces
			Escribir "Contraseña incorrecta, intenta nuevamente."
		FinSi
	FinMientras
	
	Escribir "¡Contraseña correcta!"
FinAlgoritmo
