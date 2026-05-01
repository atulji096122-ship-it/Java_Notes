
public class Builtin_Methods_in_String {
    public static void main(String[] args) {
        String s1 = new String("world");
        String s2 = new String("Hello");

        //  METHODS IN STRING

        //(A) LENGTH
        System.out.println(s1.length());

        //(B) toUppercase - returns a string in uppercase;
        System.out.println(s1.toUpperCase());

        //(C) toLowercase - returns a string in Lowercase;
        System.out.println(s1.toLowerCase());

        //(D) charAt - return a char;
        System.out.println(s1.charAt(2));

        //(E) concat - add 2 string;
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

    //space is also a index point in string.
        String name = "Atul kumar";
        for(int i=0 ;i<s1.length() ; i++){
            System.out.println(s1.charAt(i));
        }

    //using:   .toCharArray
        for(char a : s1.toCharArray()){
            System.out.println(a);
        }

    }
}
