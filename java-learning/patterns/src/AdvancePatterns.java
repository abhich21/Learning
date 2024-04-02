public class AdvancePatterns {
    public static void main(String[] args) {
//        pattern1();
//        pattern2();
//        pattern3();
        pattern4();
    }
    private static void pattern1(){
        int n = 5;
        // upper half
        for (int i = 1; i <= n; i++){
            // 1st half
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n-i);
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            // second half
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--){
            // 1st half
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n-i);
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            // second half
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // OUTPUT
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
    private static void pattern2(){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");
            for(int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // OUTPUT
//        *****
//       *****
//      *****
//     *****
//    *****
    private static void pattern3(){
        int n = 5;
        for(int i = 1; i <= n; i++){
            // spaces
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");
            // 1st half
            for(int j = i; j >= 1; j--)
                System.out.print(j);
            for (int j =2; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }
    }
    private static void pattern4(){
        int n = 4;
        for (int i =1; i <= n; i++){
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // 1st half
            for (int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
//            // 2nd half
//            for(int j = 2; j <= i; j++)
//                System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--){
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            // 1st half
            for (int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
//            // 2nd half
//            for(int j = 2; j <= i; j++)
//                System.out.print("*");
            System.out.println();
        }
    }

    // OUTPUT
//       *
//      ***
//     *****
//    *******
//    *******
//     *****
//      ***
//       *

}
