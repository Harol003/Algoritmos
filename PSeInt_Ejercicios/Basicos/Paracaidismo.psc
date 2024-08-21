Algoritmo Paracaidismo
    // Definición de variables
    Definir alturaInicial, velocidadInicial, tiempoCaida Como Real   // Variables para la altura inicial, velocidad inicial y tiempo de caída
    Definir velocidadFinal, alturaFinal Como Real   // Variables para la velocidad final y altura final
	
    // Inicialización
    velocidadInicial = 0   // Velocidad inicial al tirarse del avión es 0 (en m/s)
    
    // Entrada de datos
    Escribir "Ingrese la altura inicial desde la que se tira (en metros): "
    Leer alturaInicial   // Lee la altura inicial desde la que el paracaidista se tira
	
    Escribir "Ingrese el tiempo de caída (en segundos): "
    Leer tiempoCaida   // Lee el tiempo de caída desde que se tira hasta que el paracaídas se abre
	
    // Calcular la velocidad final antes de abrir el paracaídas (asumiendo aceleración constante)
    velocidadFinal = velocidadInicial + 9.81 * tiempoCaida   // Usamos la aceleración debida a la gravedad (9.81 m/s²) para calcular la velocidad final
	
    // Calcular la altura final después de la caída libre
    alturaFinal = alturaInicial - (0.5 * 9.81 * tiempoCaida ^ 2)   // Calcula la altura final usando la fórmula de caída libre
	
    // Mostrar los resultados
    Escribir "La velocidad final antes de abrir el paracaídas es: ", velocidadFinal, " m/s"   // Muestra la velocidad final
    Escribir "La altura final antes de abrir el paracaídas es: ", alturaFinal, " metros"   // Muestra la altura final
	
    // Suponiendo que el paracaídas se abre y reduce la velocidad a 5 m/s
    velocidadFinalParacaidas = 5   // Nueva velocidad con el paracaídas abierto
	
    // Calcular el tiempo de descenso con paracaídas abierto (asumido constante)
    Escribir "Ingrese el tiempo de descenso con el paracaídas abierto (en segundos): "
    Leer tiempoCaidaConParacaidas   // Lee el tiempo de descenso con el paracaídas abierto
	
    // Calcular la altura final después del descenso con paracaídas
    alturaFinalConParacaidas = alturaFinal - (velocidadFinalParacaidas * tiempoCaidaConParacaidas)   // Calcula la altura final después del descenso con paracaídas
	
    // Mostrar resultados finales
    Escribir "La altura final después del descenso con paracaídas es: ", alturaFinalConParacaidas, " metros"   // Muestra la altura final después de abrir el paracaídas

FinAlgoritmo
