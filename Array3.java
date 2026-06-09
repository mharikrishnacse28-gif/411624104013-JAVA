public class Array3 {
    public static void main(String[] args) {
        int[] arr=new int[]{55,86,63,4653,887,69547};
        int max=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){  
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println("The largest element is: " + max);
        System.out.println("The second largest element is: " + max2);
    }
}