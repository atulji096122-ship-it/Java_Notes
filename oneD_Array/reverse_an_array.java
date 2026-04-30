

public class reverse_an_array {
    public static void main(String[] args) {
        int[] var1 = new int[]{1, 2, 3, 4, 5};
        int var2 = 0;

        for(int var3 = var1.length - 1; var2 <= var3; --var3) {
            int var4 = var1[var2];
            var1[var2] = var1[var3];
            var1[var3] = var4;
            ++var2;
        }

        for(int var7 : var1) {
            System.out.print(var7 + " ");
        }
    }
}
