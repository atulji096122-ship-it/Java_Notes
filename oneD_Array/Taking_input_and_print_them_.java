import java.util.*;

public class Taking_input_and_print_them_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 3 , 4, 5 };
        //printing all elements of array using forEach loop ans for loop.
        for(int n : arr){
            System.out.println(n);
        }

        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }

        //taking input from user using for loop.
        int arr1[] = new int[5];

        for(int j = 0 ; j<5 ; j++){
            arr1[j] = sc.nextInt();
        }

        for( int j : arr1){
            System.out.println(j);
        }
        
    }

}
