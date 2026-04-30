import java.util.Arrays;

public class fill_method {
    public static void main(String[] args) {

// Java me fill() method array ko ek hi value se bharne ke liye use hota hai.

        int arr[] = new int[5];
        Arrays.fill(arr, 10);   //by defult value is zero.
        for(int ele : arr){
            System.out.println(ele);
        }

    }
}
