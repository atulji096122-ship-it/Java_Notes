import java.util.*;
public class unfixed_size_array {
    public static void main(String[] args) {
        // size not fixed
        int arr[][] = {
            { 1 , 3 , 5 , 6 },
            { 5 , 6 , 7 , 8 },
            { 4 , 5 , 6 , 7 }
        };

        System.out.println(arr.length); // number of row.
        System.out.println(arr[0].length); // number of column.

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }System.out.println(" ");
            
        }

    }
}
