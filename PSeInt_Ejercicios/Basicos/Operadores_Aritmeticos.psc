Algoritmo Operadores
    Definir num1, num2 Como Real
    Definir opcion Como Entero
    
    Escribir "Ingrese el primer n�mero: "
    Leer num1
    
    Escribir "Ingrese el segundo n�mero: "
    Leer num2
    
    Escribir "1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Resto 6. Potencia"
    Leer opcion
    
    Segun opcion Hacer
        1: Escribir "Resultado: ", num1 + num2
        2: Escribir "Resultado: ", num1 - num2
        3: Escribir "Resultado: ", num1 * num2
        4: 
            Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 / num2
            Sino
                Escribir "Error: Divisi�n por cero."
            FinSi
        5:
            Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 % num2
            Sino
                Escribir "Error: Divisi�n por cero."
            FinSi
        6:
            Definir resultado Como Real
            resultado = 1
            Para i = 1 Hasta num2 Hacer
                resultado = resultado * num1
            FinPara
            Escribir "Resultado: ", resultado
        De Otro Modo: Escribir "Opci�n no v�lida."
    FinSegun
FinAlgoritmo
