Algoritmo EjemploConComentarios
    // Declaraci�n de variables
    Definir num1, num2 Como Real   // Variables para almacenar los n�meros ingresados
    Definir suma, resta, multiplicacion, division Como Real   // Variables para almacenar los resultados
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
    Leer opcion   // Lee la opci�n seleccionada por el usuario
    
    // Estructura de control para decidir qu� operaci�n realizar
    Segun opcion Hacer
        1:
            // Operaci�n de suma
            suma = num1 + num2   // Calcula la suma de los dos n�meros
            Escribir "La suma es: ", suma   // Muestra el resultado de la suma
        2:
            // Operaci�n de resta
            resta = num1 - num2   // Calcula la resta de los dos n�meros
            Escribir "La resta es: ", resta   // Muestra el resultado de la resta
        3:
            // Operaci�n de multiplicaci�n
            multiplicacion = num1 * num2   // Calcula la multiplicaci�n de los dos n�meros
            Escribir "La multiplicaci�n es: ", multiplicacion   // Muestra el resultado de la multiplicaci�n
        4:
            // Operaci�n de divisi�n
            Si num2 <> 0 Entonces   // Verifica que el divisor no sea cero para evitar divisi�n por cero
                division = num1 / num2   // Calcula la divisi�n de los dos n�meros
                Escribir "La divisi�n es: ", division   // Muestra el resultado de la divisi�n
            Sino
                Escribir "Error: Divisi�n por cero no permitida."   // Mensaje de error si el divisor es cero
            FinSi
        De Otro Modo:
            // Opci�n no v�lida
            Escribir "Opci�n no v�lida."   // Muestra un mensaje de error si la opci�n no es v�lida
    FinSegun
    
FinAlgoritmo

