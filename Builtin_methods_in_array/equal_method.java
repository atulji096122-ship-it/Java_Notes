import java.util.Arrays;

public class equal_method {
    public static void main(String[] args) {
        
        
        int arr3[] = { 1 ,2 ,3 , 4, 5 ,6};
        int arr4[] = { 1 ,2 ,3 , 4, 5 ,6};
        
        // equals; - check each value of both array.
        if(Arrays.equals(arr3, arr4)){
            System.out.println("same");
        }
    }
    
}
