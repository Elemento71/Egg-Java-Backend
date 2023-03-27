package Guia2;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente
        //en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        double F, C;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados Centigrados");
        C = scaner.nextDouble();
        F = 32 + (9 * C / 5);
        System.out.println("Su conversion a grados Fahrenheit es: " + F );   
    }
}