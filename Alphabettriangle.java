public class Alphabettriangle {
    public static void main(String[] args){
        int i,j,n=6;
        for(i=1;i<n;i++){
            for(j=98 ;j<98+i;j++){
                if(j>1)
                    System.out.print(" ");
                System.out.print((char)j);
            }
            System.out.println();
        }
}
}