Algoritmo Password
	// Este programa solicita una contrase�a al usuario hasta que ingrese la correcta.
	Escribir "Este programa te pedir� que ingreses una contrase�a hasta que sea correcta."
	contrase�a_correcta <- "1234"
	contrase�a <- ""
	Mientras contrase�a <> contrase�a_correcta Hacer
		Escribir "Ingresa la contrase�a: "
		Leer contrase�a
		Si contrase�a <> contrase�a_correcta Entonces
			Escribir "Contrase�a incorrecta, intenta nuevamente."
		FinSi
	FinMientras
	
	Escribir "�Contrase�a correcta!"
FinAlgoritmo
