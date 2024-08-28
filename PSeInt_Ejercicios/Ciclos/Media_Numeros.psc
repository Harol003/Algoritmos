Algoritmo Media_Numeros
	Escribir "Politecnico Internacional";
	Escribir "Programa: Calcular la media de 5 números ingresados por el usuario";
	Definir i, numero, suma, media Como Real
    suma = 0
    Para i=1 Hasta 5 Con Paso 1 Hacer
        Escribir "Ingresa un número: "
        Leer numero
        suma = suma + numero
    FinPara
    media = suma / 5
    Escribir "La media es: ", media
	Escribir "Gracias, Hasta luego.";
FinAlgoritmo
