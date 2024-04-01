public class Main {
    public static void main(String[] args)
    {
//        pattern1();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
//        pattern6();
//        pattern7();
//        pattern8();
        pattern9();
    }
    private static void pattern1(){
        for(int i = 1; i <= 4; i++){
            String star = "";
            for (int j = 1; j <= 5; j++){
                star += "*";
            }
            System.out.println(star);
        }
    }
//    OUTPUT
//     *****
//     *****
//     *****
//     *****

    private static void pattern2(){
        int n = 4;
        int m = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || i == n || j ==1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                System.out.println();
        }
    }
//    OUTPUT
//    *****
//    *   *
//    *   *
//    *****

    private static void pattern3(){
        int n = 4;
        for(int i= 0; i < n ;i ++){
            for(int j= 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // OUTPUT
//      *
//      **
//      ***
//      ****

    private static void pattern4(){
        int n = 4;
        for(int i= 0; i < n ;i ++){
            for(int j= i; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i= n; i >= 1 ;i --){
            for(int j= 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    OUTPUT
//     ****
//     ***
//     **
//     *

    private static void pattern5(){
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

//    OUTPUT
//       *
//       **
//       ***
//       ****

    private static void pattern6(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    // OUTPUT
    //    1
    //    1 2
    //    1 2 3
    //    1 2 3 4
    //    1 2 3 4 5

    private static void pattern7(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i+1; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
//    OUTPUT
//     1 2 3 4 5
//     1 2 3 4
//     1 2 3
//     1 2
//     1

    private static void pattern8(){
        int n = 5;
        int sum = 1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++) {
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }
    }

    // OUTPUT
//    1
//    2 3
//    4 5 6
//    7 8 9 10
//    11 12 13 14 15

    private static void pattern9(){
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++) {
                if((i + j)%2==0)
                    System.out.print( 1 + " ");
                else
                    System.out.print( 0 + " ");
            }
            System.out.println();
        }
    }

    // OUTPUT
//      1
//      0 1
//      1 0 1
//      0 1 0 1
//      1 0 1 0 1
}