//Searching for an element x in a matrix.

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
//        spiralOrder();
        transPose();
    }

    private static void searcingIn2DArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++){
            for( int j = 0; j < cols; j++)
                numbers[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        boolean isFound = false;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if( numbers[i][j]== x){
                    System.out.println("x found at location (" + i + ", " + j + ")");
                    isFound = true;
                    break;
                }
            }
            if(isFound)
                break;
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        int rows = sc.nextInt();
//        System.out.print("Enter number of columns: ");
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//
//        // Input
//        System.out.println("Enter elements:");
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < cols; j++) {
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.print("Enter the value to search (x): ");
//        int x = sc.nextInt();
//
//        boolean found = false;
//        for(int i = 0; i < rows; i++) {
//            for(int j = 0; j < cols; j++) {
//                // Compare with x
//                if(numbers[i][j] == x) {
//                    System.out.println("x found at location (" + i + ", " + j + ")");
//                    found = true;
//                }
//            }
//        }
//
//        if (!found) {
//            System.out.println("x not found in the array.");
//        }

    }

    private static void spiralOrder(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0, rowEnd =rows-1;
        int colStart = 0, colEnd =cols-1;

        while (rowStart <= rowEnd && colStart <= colEnd){
            for(int col=colStart; col <= colEnd; col++){
                System.out.print(numbers[rowStart][col] + " ");
            }
            rowStart++;
            for(int row=rowStart; row <= rowEnd; row++){
                System.out.print(numbers[row][colEnd] + " ");
            }
            colEnd--;
            for( int col = colEnd; col >= colStart; col--){
                System.out.print(numbers[rowEnd][col] + " ");
            }
            rowEnd--;
            for( int row = rowEnd; row >= rowStart; row--){
                System.out.print(numbers[rowEnd][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }
    }

    private static void transPose(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Transpose of the matrix is :");
        for( int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

}
