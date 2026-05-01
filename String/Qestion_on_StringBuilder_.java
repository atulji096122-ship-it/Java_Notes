import java.util.*;
public class Qestion_on_StringBuilder_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Develop a Java program that reads a string from the user, reverses it using the reverse() method of StringBuilder, and displays the reversed string.

        String s1 = sc.nextLine();  //String is immutable , so here we creating a new String using "StringBuilder".

        StringBuilder s2 = new StringBuilder(s1);

        s2.reverse();

        String ans = s2.toString(); // stringBuilder to String (.toString)
        System.out.println(ans);
    }
}
