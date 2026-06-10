public class Array2 {
        public static void main(String[] args) {
        int[] arr=new int[]{55,86,63,4653,887,69547};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){  
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest element is: " + max);
}
}