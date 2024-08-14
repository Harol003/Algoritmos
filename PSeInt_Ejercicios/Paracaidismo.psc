Algoritmo Paracaidismo
    // Definici�n de variables
    Definir alturaInicial, velocidadInicial, tiempoCaida Como Real   // Variables para la altura inicial, velocidad inicial y tiempo de ca�da
    Definir velocidadFinal, alturaFinal Como Real   // Variables para la velocidad final y altura final
	
    // Inicializaci�n
    velocidadInicial = 0   // Velocidad inicial al tirarse del avi�n es 0 (en m/s)
    
    // Entrada de datos
    Escribir "Ingrese la altura inicial desde la que se tira (en metros): "
    Leer alturaInicial   // Lee la altura inicial desde la que el paracaidista se tira
	
    Escribir "Ingrese el tiempo de ca�da (en segundos): "
    Leer tiempoCaida   // Lee el tiempo de ca�da desde que se tira hasta que el paraca�das se abre
	
    // Calcular la velocidad final antes de abrir el paraca�das (asumiendo aceleraci�n constante)
    velocidadFinal = velocidadInicial + 9.81 * tiempoCaida   // Usamos la aceleraci�n debida a la gravedad (9.81 m/s�) para calcular la velocidad final
	
    // Calcular la altura final despu�s de la ca�da libre
    alturaFinal = alturaInicial - (0.5 * 9.81 * tiempoCaida ^ 2)   // Calcula la altura final usando la f�rmula de ca�da libre
	
    // Mostrar los resultados
    Escribir "La velocidad final antes de abrir el paraca�das es: ", velocidadFinal, " m/s"   // Muestra la velocidad final
    Escribir "La altura final antes de abrir el paraca�das es: ", alturaFinal, " metros"   // Muestra la altura final
	
    // Suponiendo que el paraca�das se abre y reduce la velocidad a 5 m/s
    velocidadFinalParacaidas = 5   // Nueva velocidad con el paraca�das abierto
	
    // Calcular el tiempo de descenso con paraca�das abierto (asumido constante)
    Escribir "Ingrese el tiempo de descenso con el paraca�das abierto (en segundos): "
    Leer tiempoCaidaConParacaidas   // Lee el tiempo de descenso con el paraca�das abierto
	
    // Calcular la altura final despu�s del descenso con paraca�das
    alturaFinalConParacaidas = alturaFinal - (velocidadFinalParacaidas * tiempoCaidaConParacaidas)   // Calcula la altura final despu�s del descenso con paraca�das
	
    // Mostrar resultados finales
    Escribir "La altura final despu�s del descenso con paraca�das es: ", alturaFinalConParacaidas, " metros"   // Muestra la altura final despu�s de abrir el paraca�das

FinAlgoritmo
