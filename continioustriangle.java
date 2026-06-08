public class continioustriangle {
    public static void main(String[] args){
        int i,j,n=5;
        int ch=65;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
