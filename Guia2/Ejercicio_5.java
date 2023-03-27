package Guia2;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
    //Escribir un programa que lea un número entero por teclado y muestre por 
    //pantalla el doble, el triple y la raíz cuadrada de ese número. 
    double num, doble, triple, raiz;
    Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese el numero a operar: ");
        num = scaner.nextDouble();
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("El doble de su numero ingresado es: "+doble);
        System.out.println("El triple de su numero ingresado es: "+triple);
        System.out.println("La raiz cuadrada de su numero ingresado es: "+raiz);
    }   
}