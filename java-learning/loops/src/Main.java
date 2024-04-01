import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        forLoop();
//        whileLoop();
//        doWhileLoop();
//        marks();
        primeOrNot();

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
        int inp = sc.nextInt();
        int sum = 1;
        do{
            sum++;
            inp = sc.nextInt();
        }
        while(inp == 1);
        if(sum>=90)
            System.out.print("This Is Good");
        else if (sum<=89&&sum>=60)
            System.out.println("This Is also Good");
        else
            System.out.println("This Is Good as well");
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