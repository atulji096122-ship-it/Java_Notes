
class Passing_array_to_method_ {
    
    public static void printArray(double arr[]){
        for(double ele : arr){
            System.out.println(ele);
        }
    }
    public static void main(String[] args) {

        double arr5[] = {1.1, 2, 3, 4, 5};
        printArray(arr5);
    }
    
}