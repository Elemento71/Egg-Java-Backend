package Guia2;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        //Escribir un programa que pida una frase y la muestre toda en 
        //mayúsculas y después toda en minúsculas.
        String frase;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase = scaner.next();
        System.out.println("Su frase en mayusculas es: " + frase.toUpperCase() );
        System.out.println("Su frase en minusculas es: " + frase.toLowerCase() );
    //Nota: Para que esto aplique a toda la frase los espacios tienen que ir con un "_"   
    }   
}