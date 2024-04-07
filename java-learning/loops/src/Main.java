package loops.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        forLoop();
//        whileLoop();
//        doWhileLoop();
        marks();
//        primeOrNot();

    }

    private static void forLoop(){
        System.out.println("----------------For Loop----------------");
        for (int i=0;i<11;i++){
            System.out.println(i);
        }
    }

    private static void whileLoop(){
        int i = 0;
        System.out.println("----------------While Loop----------------");
        while( i < 11){
            System.out.println(i);
            i=i+1;
        }
    }

    private static void doWhileLoop(){
        int i = 0;
        System.out.println("----------------Do-While Loop----------------");
        do{
            System.out.println(i);
            i=i+1;
        }
        while( i < 11);
    }
    private static void marks(){
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if(marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if(marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }


            System.out.println("Want to continue ? (yes(1) or no(0))");
            input = sc.nextInt();

        }
        while(input == 1);
    }

    private static void primeOrNot(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for(int i = 1; i <=n/2; i++){
            if(counter > 1)
                break;
            if(n%i == 0) {
                counter++;
            }
        }
        if(counter > 1)
            System.out.println(n + " is not prime");
        else
            System.out.println(n + " is prime");
    }
}