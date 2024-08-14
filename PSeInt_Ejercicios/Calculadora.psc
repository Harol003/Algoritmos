Algoritmo Calculadora
    // Declaraci�n de variables
    Definir num1, num2 Como Real   // Variables para almacenar los n�meros ingresados
    Definir resultado Como Real   // Variable para almacenar el resultado de la operaci�n
    Definir opcion Como Entero   // Variable para almacenar la opci�n seleccionada
    
    // Entrada de datos
    Escribir "Ingrese el primer n�mero: "
    Leer num1   // Lee el primer n�mero ingresado por el usuario
    
    Escribir "Ingrese el segundo n�mero: "
    Leer num2   // Lee el segundo n�mero ingresado por el usuario
    
    // Mostrar opciones al usuario
    Escribir "Seleccione la operaci�n que desea realizar:"
    Escribir "1. Sumar"
    Escribir "2. Restar"
    Escribir "3. Multiplicar"
    Escribir "4. Dividir"
    Escribir "5. Resto"
    Escribir "6. Potencia"
    Leer opcion   // Lee la opci�n seleccionada por el usuario
    
    // Estructura de control para decidir qu� operaci�n realizar
    Segun opcion Hacer
        1:
            // Operaci�n de suma
            resultado = num1 + num2   // Calcula la suma de los dos n�meros
            Escribir "La suma es: ", resultado   // Muestra el resultado de la suma
        2:
            // Operaci�n de resta
            resultado = num1 - num2   // Calcula la resta de los dos n�meros
            Escribir "La resta es: ", resultado   // Muestra el resultado de la resta
        3:
            // Operaci�n de multiplicaci�n
            resultado = num1 * num2   // Calcula la multiplicaci�n de los dos n�meros
            Escribir "La multiplicaci�n es: ", resultado   // Muestra el resultado de la multiplicaci�n
        4:
            // Operaci�n de divisi�n
            Si num2 <> 0 Entonces   // Verifica que el divisor no sea cero para evitar divisi�n por cero
                resultado = num1 / num2   // Calcula la divisi�n de los dos n�meros
                Escribir "La divisi�n es: ", resultado   // Muestra el resultado de la divisi�n
            Sino
                Escribir "Error: Divisi�n por cero no permitida."   // Mensaje de error si el divisor es cero
            FinSi
        5:
            // Operaci�n de resto
            Si num2 <> 0 Entonces   // Verifica que el divisor no sea cero para evitar divisi�n por cero
                resultado = num1 % num2   // Calcula el resto de la divisi�n de los dos n�meros
                Escribir "El resto de la divisi�n es: ", resultado   // Muestra el resultado del resto
            Sino
                Escribir "Error: Divisi�n por cero no permitida."   // Mensaje de error si el divisor es cero
            FinSi
        6:
            // Operaci�n de potencia
            resultado = 1   // Inicializa el resultado para el c�lculo de la potencia
            Para i = 1 Hasta num2 Hacer   // Calcula la potencia de num1 elevado a num2
                resultado = resultado * num1
            FinPara
            Escribir "La potencia es: ", resultado   // Muestra el resultado de la potencia
        De Otro Modo:
            // Opci�n no v�lida
            Escribir "Opci�n no v�lida."   // Muestra un mensaje de error si la opci�n no es v�lida
    FinSegun
    
FinAlgoritmo
