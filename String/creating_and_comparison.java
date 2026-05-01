import java.util.*;
public class creating_and_comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String s1= "hello";
        String s2 = new String("world");

        System.out.println(s1);
        System.out.println(s2);

    //comparison : return boolean value;
        System.out.println(s1.equals(s2));

        String username = "ADMIN";
        String password = "ADMIN123";

        String user = sc.nextLine();  //Input : ADMIN
        String pass = sc.nextLine();  //Input : ADMIN123

        if(username.equals(user) && password.equals(pass)){
            System.out.println("Welcome Admin");
        }else{
            System.out.println("Invalid credentials");
        }

    }
}
