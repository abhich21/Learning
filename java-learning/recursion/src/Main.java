public class Main {
    public static void main(String[] args) {
//        int n = 1;
//        printNum(n);
//        printSum(1, 10, 0);
//        System.out.println(printFactorial(5));

//        int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printFib(a, b, n-2);

//        System.out.println(calcPow(2, 5));
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));

          }

    public static String mergeAlternately(String word1, String word2) {
        String s = "";
        int i =0, j =0;
        while(i<word1.length() && j <word2.length()){
            s+=word1.charAt(i)+""+word2.charAt(j);
            i+=1;
            j+=1;
        }
        if(i<word1.length()) {
            for (int k = i; k < word1.length(); k++)
                s += word1.charAt(k);
        }
        if(j<word2.length()) {
            for (int k = j; k < word2.length(); k++)
                s += word2.charAt(k);
        }
        return s;
    }

    public static void printNum(int n){
        if(n==6)
            return;
        System.out.println(n);
        printNum(n+1);
    }

    public static void printSum(int i, int n, int sum){
        sum += i;
        if (i==n) {
            System.out.println(sum);
            return;
        }
        printSum(i+1, n, sum);
    }

    public static int printFactorial(int n){
        if(n==0 || n==1) {
            return 1;
        }
        int fact_nm1 = printFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;

    }

    public static void printFib(int a, int b, int n){

        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public static int calcPow(int x, int n){
        // Stack Height = n
//        if(x==0)
//            return 0;
//        if(n==0)
//            return 1;
//        int xPow1 = calcPow(x, n-1);
//        int xPow = x * xPow1;
//        return xPow;

        // Stack Height = logn
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        if(n%2 == 0)
            return calcPow(x, n/2) * calcPow(x, n/2);
        else
            return calcPow(x, n/2)*calcPow(x, n/2)*x;
    }
}