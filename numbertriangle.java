public class numbertriangle {
    public static void main(String[] args) {
        int i,j,n=4;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                 if(j>1){
                    System.out. print(" ");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
