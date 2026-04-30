import java.util.Arrays;

public class copyof_Method {
    public static void main(String[] args) {
        //  copyof - return a new copy array
        int arr3[] = { 1 ,2 ,3 , 4, 5 ,6};
        int arr4[] = Arrays.copyOf(arr3, arr3.length);
        for(int ele : arr4){
            System.out.println(ele);
        }

    }
}
