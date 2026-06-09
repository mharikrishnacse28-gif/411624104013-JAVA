import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] n=new int[]{1,2,4,4,5,6,7,8,9,10};
        System.out.println(n[0]);
        n[2]=3;
        n[5]++;
        n[6]--;
        n[7]+=2;
        System.out.println(Arrays.toString(n));
    }
}
