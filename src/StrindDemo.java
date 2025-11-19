import java.util.Arrays;

public class StrindDemo {
    public static void main(String[] args) {
        float a=423.12434f;
        System.out.printf("Formated number is %.2f",a);
        String name="Trisa Hello";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indent('a'));
        String str="abcba";
        System.out.println(ispalindrome(str));
        String str1="";
        System.out.println(ispalindrome(str1));

    }
    static Boolean ispalindrome(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++) {
            char start = str.charAt(i);
            char end=str.charAt(str.length()-i-1);
            if(start!=end){
                return false;
            }

        }



        return true;

    }
}
