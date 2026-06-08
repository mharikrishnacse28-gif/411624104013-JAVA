public class Differentpattern2 {
        public static void main(String[] args){
        int l=5,i,j;
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(j%2==0)
                    System.out.print("* ");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }
    }
}
