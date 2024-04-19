import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Left Shift and Right Shift Operators
//        int a = 3;
//        int b = a<<1;
//        System.out.println("One Left Shift(<<) of " + a +" is = " + b );
//
//        int c = a>>1;
//        System.out.println("One Right Shift(>>) of " + a +" is = " + c );

//        getBit();
//        setBit();
//        clearBit();
        updateBit();
    }

    private static void getBit(){
        // Get the position(pos) of any bit in a number n
        // bitMask = 1 << pos, operation = AND
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;


        if((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }

    }

    private static void setBit(){
        // We have a postion of a bit in a number we have to make that bit 1
        // bitMask = 1 << pos, operation = OR
        int n = 6;
        int pos = 3;
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;

        System.out.println("New number after setBit performed = " + newNumber);
    }

    private static void clearBit(){
        // We have a postion of a bit in a number we have to make that bit 0
        // bitMask = 1 << pos, operation = AND with NOT
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;

        System.out.println("New number after clearBit performed = " + newNumber);
    }

    private static void updateBit(){
        // We have to update a bit of any position of a given number either 0 or 1.
        // For update bit is 0(bitMask = 1<<pos, operarion = AND with NOT(ClearBit))
        // For update bit is 1(bitMask = 1<<pos, operarion = OR(SetBit))
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        if(operation == 0){
            // clear bit
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println("New number after updated the bit to 0 is = "
                    + newNumber);
        }else{
            // set bit
            int newNumber = bitMask | n;
            System.out.println("New number after updated the bit to 1 is = "
                    + newNumber);
        }
    }
}