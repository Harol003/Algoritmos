Algoritmo EjemploConComentarios
    // Declaración de variables
    Definir num1, num2 Como Real   // Variables para almacenar los números ingresados
    Definir suma, resta, multiplicacion, division Como Real   // Variables para almacenar los resultados
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
    Leer opcion   // Lee la opción seleccionada por el usuario
    
    // Estructura de control para decidir qué operación realizar
    Segun opcion Hacer
        1:
            // Operación de suma
            suma = num1 + num2   // Calcula la suma de los dos números
            Escribir "La suma es: ", suma   // Muestra el resultado de la suma
        2:
            // Operación de resta
            resta = num1 - num2   // Calcula la resta de los dos números
            Escribir "La resta es: ", resta   // Muestra el resultado de la resta
        3:
            // Operación de multiplicación
            multiplicacion = num1 * num2   // Calcula la multiplicación de los dos números
            Escribir "La multiplicación es: ", multiplicacion   // Muestra el resultado de la multiplicación
        4:
            // Operación de división
            Si num2 <> 0 Entonces   // Verifica que el divisor no sea cero para evitar división por cero
                division = num1 / num2   // Calcula la división de los dos números
                Escribir "La división es: ", division   // Muestra el resultado de la división
            Sino
                Escribir "Error: División por cero no permitida."   // Mensaje de error si el divisor es cero
            FinSi
        De Otro Modo:
            // Opción no válida
            Escribir "Opción no válida."   // Muestra un mensaje de error si la opción no es válida
    FinSegun
    
FinAlgoritmo

