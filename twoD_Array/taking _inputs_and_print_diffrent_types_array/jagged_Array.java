public class jagged_Array {

    public static void main(String[] args) {
        // jagged Array : Jagged array ka matlab hota hai: 2D array jisme har row ka size same hona zaroori nahi hota.
        int arr4[][] = {
            { 1, 2, 3, 4},
            { 5, 7},
            { 5, 7, 8}
        };

        for(int i = 0 ; i<arr4.length ; i++){  
            for(int j = 0 ; j<arr4[i].length ; j++){
                System.out.print(arr4[i][j]+ " ");
            }System.out.println(" ");
        }
    }
}