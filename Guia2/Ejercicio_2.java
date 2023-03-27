package Guia2;
import java.util.Scanner;
public class Ejercicio_2 {
public static void main(String[] args) {    
//Escribir un programa que pida tu nombre, lo guarde en una variable
//y lo muestre por pantalla.
    String nombre;
    Scanner scaner = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    nombre = scaner.next();
    System.out.println("Perfecto, su nombre es: " + nombre );   
} 
}