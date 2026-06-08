public class palidromepattern {
    public static void main(String[] args) {
        int i,j,k, n = 5;
        for (i = 1; i <= n; i++) {
            for ( j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print((char)(65 + j));
            }
            for (k = j - 2; k >= 0; k--) {
                System.out.print((char)(65 + k ));
            }
            System.out.println();
        }
    }
}