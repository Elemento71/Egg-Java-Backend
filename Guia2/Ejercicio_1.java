package Guia2;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        //Escribir un programa que pida dos números enteros por teclado y 
        //calcule la suma de los dos. El programa deberá después mostrar 
        //el resultado de la suma
int num1;
int num2;
int suma;
Scanner scaner = new Scanner(System.in);
System.out.println(" Ingrese el primer numero a sumar ");
num1 = scaner.nextInt();
System.out.println(" Ingrese el segundo numero a sumar ");
num2 = scaner.nextInt();
suma = num1 + num2;
System.out.println(" La suma entre los numeros " + num1 + " y " + num2 + " da como resultado: " + suma );
    }
}