Algoritmo Calculadora
    // Declaración de variables
    Definir num1, num2 Como Real   // Variables para almacenar los números ingresados
    Definir resultado Como Real   // Variable para almacenar el resultado de la operación
    Definir opcion Como Entero   // Variable para almacenar la opción seleccionada
    
    // Entrada de datos
    Escribir "Ingrese el primer número: "
    Leer num1   // Lee el primer número ingresado por el usuario
    
    Escribir "Ingrese el segundo número: "
    Leer num2   // Lee el segundo número ingresado por el usuario
    
    // Mostrar opciones al usuario
    Escribir "Seleccione la operación que desea realizar:"
    Escribir "1. Sumar"
    Escribir "2. Restar"
    Escribir "3. Multiplicar"
    Escribir "4. Dividir"
    Escribir "5. Resto"
    Escribir "6. Potencia"
    Leer opcion   // Lee la opción seleccionada por el usuario
    
    // Estructura de control para decidir qué operación realizar
    Segun opcion Hacer
        1:
            // Operación de suma
            resultado = num1 + num2   // Calcula la suma de los dos números
            Escribir "La suma es: ", resultado   // Muestra el resultado de la suma
        2:
            // Operación de resta
            resultado = num1 - num2   // Calcula la resta de los dos números
            Escribir "La resta es: ", resultado   // Muestra el resultado de la resta
        3:
            // Operación de multiplicación
            resultado = num1 * num2   // Calcula la multiplicación de los dos números
            Escribir "La multiplicación es: ", resultado   // Muestra el resultado de la multiplicación
        4:
            // Operación de división
            Si num2 <> 0 Entonces   // Verifica que el divisor no sea cero para evitar división por cero
                resultado = num1 / num2   // Calcula la división de los dos números
                Escribir "La división es: ", resultado   // Muestra el resultado de la división
            Sino
                Escribir "Error: División por cero no permitida."   // Mensaje de error si el divisor es cero
            FinSi
        5:
            // Operación de resto
            Si num2 <> 0 Entonces   // Verifica que el divisor no sea cero para evitar división por cero
                resultado = num1 % num2   // Calcula el resto de la división de los dos números
                Escribir "El resto de la división es: ", resultado   // Muestra el resultado del resto
            Sino
                Escribir "Error: División por cero no permitida."   // Mensaje de error si el divisor es cero
            FinSi
        6:
            // Operación de potencia
            resultado = 1   // Inicializa el resultado para el cálculo de la potencia
            Para i = 1 Hasta num2 Hacer   // Calcula la potencia de num1 elevado a num2
                resultado = resultado * num1
            FinPara
            Escribir "La potencia es: ", resultado   // Muestra el resultado de la potencia
        De Otro Modo:
            // Opción no válida
            Escribir "Opción no válida."   // Muestra un mensaje de error si la opción no es válida
    FinSegun
    
FinAlgoritmo
