public class StrMain {
    public static void main(String[] args) {

        String fullName = "tony stark";
        for(int i = 0; i < fullName.length(); i++)
            System.out.println(fullName.charAt(i));

        // Comparing strings
        String name1 = "Tony";
        String name2 = "Tony";


        //1 s1>s2: +ve value
        //2 s1==s2: 0
        //3 s1<s2: -ve value
        if(name1.compareTo(name2) == 0)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }

    private static void concatenation(){

    }
}