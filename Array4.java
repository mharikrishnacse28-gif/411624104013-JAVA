public class Array4 {
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,10,40,50,60};
        int target=30;
        boolean git=false;
      for (int idx = 0; idx < arr.length; idx++) {
          if(arr[idx] == target){
            git=true;
            break;
          }
         }
         if(git == true){
            System.out.println("Found");
          }
          else{
            System.out.println("Not Found");
          }
    }
}
