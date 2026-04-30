import java.util.Arrays;

public class toString_method {
    public static void main(String[] args) {

        // Java me toString() array ko readable format me print karne ke liye use hota hai via:
        // toString - return a String
        int arr3[] = { 1 ,2 ,3 , 4, 5 ,6};

        String str = Arrays.toString(arr3);
        
        System.out.println(str);
    }
}
