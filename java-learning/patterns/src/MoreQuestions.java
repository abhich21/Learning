public class MoreQuestions {
    public static void main(String[] args) {
//        pattern1();
//        pattern2();
        pattern3();
    }
    private static void pattern1(){
        int n = 5;
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for(int j = 1; j <=5; j++)
                System.out.print("*");
            System.out.println();
        }
    }

//   OUTPUT
//        *****
//       *****
//      *****
//     *****
//    *****

    private static void pattern2(){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j=1; j<=n-i; j++ )
                System.out.print(" ");
            for(int j = 1; j <= i; j++){
                System.out.print( i + "  ");
            }
            System.out.println();
        }
    }

    //  OUTPUT
    //      1
    //     2  2
    //    3  3  3
    //   4  4  4  4
    //  5  5  5  5  5

    private static void pattern3(){
        int n = 5;
        int ind = 1;
        for(int i = 1; i <= n; i++){
            for(int j=1; j<=n-i; j++ ) {
                System.out.print("  ");
            }
            int num = i;
            for(int j = 1; j <= i; j++){
                System.out.print( num +" ");
                if(num == 1)
                    break;
                num--;
            }
            for(int j = 1; j < i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    // OUTPUT
//        1
//      2 1 2
//    3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

}
