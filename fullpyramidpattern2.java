public class fullpyramidpattern2 {
            public static void main(String[] args) {
        int i,j,k,n =6;
        for ( i = 1; i < n; i++) {
            for ( j = i; j < n; j++) {
                System.out.print(" ");
            }
            for ( k = 0; k < 2*i; k++) {
               System.out.print("*" );
            }
            System.out.println();
        }
    }
}
