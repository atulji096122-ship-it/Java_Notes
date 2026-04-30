import java.util.*;
public class fixes_size_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][]= new int[3][4];
        //taking input
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // printing 2D array.
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println(" ");
        }
    }
}
