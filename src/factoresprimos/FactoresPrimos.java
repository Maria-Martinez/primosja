package factoresprimos; //Contenedor de clases.

import java.util.Scanner; //Declaracion de la clase Scanner.

public class FactoresPrimos { //Clase FactoresPrimos.

    public static void main(String[] args) { //Metodo estandar para ejecutar un programa.
        long numeroInicial, numero;  //Declaracion de variables.
        Scanner teclado = new Scanner(System.in);  //Clase Scanner que permite ingresar datos.

        System.out.println("Por favor, Introduzca el número que quiera factorizar: ");  //Este objeto nos permite imprimir en la pantalla por consola.
        numeroInicial = teclado.nextLong(); //Entrada de un dato digitado por teclado.

        if (numeroInicial > 1) { //Estructura que evalua las condiciones del programa para obtener un resultado. 
            int factor = 2; //Declaracion de variable.
            numero = numeroInicial; //La variable guarda el dato obtenido por teclado.
            System.out.println("Factores Primos"); //Este objeto nos permite imprimir en la pantalla por consola.
            System.out.print(numero + " = " );    //Este objeto nos permite imprimir en la pantalla por consola.
            while (numero > factor) {    //Estructura que evalua las condiciones y continua hasta que sea falsa.
                if (numero % factor == 0) {     //Estructura que evalua las condiciones del programa.
                    numero /= factor; //Operador para division.
                    System.out.print(factor + " * ");   //Este objeto nos permite imprimir en la pantalla por consola.
                } else {   //Indica instrucciones a realizar en caso de no cumplirse la condición
                    factor++; //El operador de incremento de prefijo
                }
            }
            System.out.println(factor);   //Este objeto imprime el resultado en pantalla por consola.
        }
    }
}
