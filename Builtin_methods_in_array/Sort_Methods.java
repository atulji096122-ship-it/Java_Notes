import java.util.*;
public class Sort_Methods {
    public static void main(String[] args) {
        int arr[] = {10 , 13 , 4 , 4 , 5 , 1 , 6};
        //Ascending Order 
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.println(ele);
        }   
        //Descending Order.
        Integer[] nums = {5, 2, 8, 1};
        Arrays.sort(nums, Collections.reverseOrder());

        String[] names = {"Banana", "Apple", "Mango"};
        Arrays.sort(names, Collections.reverseOrder());
    }
}
