public class floydtriangle {
    public static void main(String[] args) {
        int i,j,n=5,num=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(j>1){
                    System.out.print(" ");
                }
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
