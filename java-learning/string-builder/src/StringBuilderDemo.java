import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
//
//        //set char at any index
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);
//
//        //insert char at any index
//        sb.insert(2, 'n');
//        System.out.println(sb);
//
//        // //delete char at any index or at limit(ending index non-inclusive)
//        sb.delete(2,3);
//        System.out.println(sb);

        System.out.println(revrseString());
    }

    private static StringBuilder revrseString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        for( int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - i -1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            if(i == 0){
                backChar = Character.toUpperCase(backChar);
                frontChar = Character.toLowerCase(frontChar);
            }

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        return sb;
    }

}