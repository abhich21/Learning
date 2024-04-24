public class MoreQuestions {
    public static void main(String[] args) {
//        isPowerOfTwo(5);
        toggleBit(5,3);
    }

    private static void isPowerOfTwo(int num){
        if (num <= 1 ){
            System.out.println("Number should be greater than 1!");
        }
        else {
            // A number is a power of 2 if it has only one bit set to 1.
            // Using bitwise AND operation, we can check if there is only one set bit.
            int bitMask = num - 1;
            if ((num & bitMask) == 0) {
                System.out.println(num + " is a power of 2.");
            }else{
                System.out.println(num + " is not a power of 2.");
            }
        }

    }

   //Write a program to toggle a bit a position = “pos” in a number “n”
    private static void toggleBit(int num, int pos){
        int bitMask = 1<<pos;
        if((bitMask & num) == 0){

            int newNumer = bitMask | num;
            System.out.println("New number after toggling the bit to 1 is = "
            + newNumer);
        }else{
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & num;
            System.out.println("New number after toggling the bit to 0 is = "
                    + newNumber);
        }
    }

    // Write a program to count the number of 1’s in a binary representation of the number.
    private static void countBit(int num){
        for (int i = 0; i < )
    }
}
