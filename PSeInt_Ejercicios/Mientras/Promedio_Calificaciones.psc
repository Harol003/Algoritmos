Algoritmo Promedio_Calificaciones
	// Este programa calcula el promedio de calificaciones ingresadas por el usuario hasta que se ingrese un valor negativo.
	Escribir "Este programa calcular� el promedio de las calificaciones que ingreses, hasta que ingreses una negativa."
	suma_calificaciones <- 0
	contador_calificaciones <- 0
	calificacion <- 0
	Mientras calificacion >= 0 Hacer
		Escribir "Ingresa una calificaci�n (negativa para terminar): "
		Leer calificacion
		Si calificacion >= 0 Entonces
			suma_calificaciones <- suma_calificaciones + calificacion
			contador_calificaciones <- contador_calificaciones + 1
		FinSi
	FinMientras
	Si contador_calificaciones > 0 Entonces
		promedio <- suma_calificaciones / contador_calificaciones
		Escribir "El promedio es: ", promedio
	SiNo
		Escribir "No se ingresaron calificaciones v�lidas."
	FinSi
FinAlgoritmo
