package de.iav;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
       public static int[] creatFibonacciSequence(){
           //Sccannerfunktion
           Scanner indexScanner = new Scanner(System.in);
           int fibonacciIndex = indexScanner.nextInt();
           //Array definition
           int[] fibonacci = new int[fibonacciIndex];
           fibonacci[0] = 0;
           fibonacci[1] = 1;
           //Fibonacci Folge
           for(int i = 2; i < fibonacciIndex; i++){
               fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
           }
           return fibonacci;
       }

    public static int[] creatFibonacciSequence1(int fibonacciIndex){

        //Array definition
        int[] fibonacci = new int[fibonacciIndex];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        //Fibonacci Folge
        for(int i = 2; i < fibonacciIndex; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci;
    }

    public static void main(String[] args) {
        System.out.println("Bitte geben sie die Stelle an zu der die Fibonacci-Folge ausgegebn werden soll: ");
        int[] fibonacciSequence = creatFibonacciSequence1(5);
        System.out.println(Arrays.toString(fibonacciSequence));
        System.out.println(Arrays.toString(creatFibonacciSequence()));
       }
}
