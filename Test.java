import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        long mobile_number,adhar_number;
        String name;
        float height;
        System.out.print("Enter the name:");
        name = sc.nextLine();
        System.out.print("Enter the mobile number:");
        mobile_number = sc.nextLong();   
        System.out.print("Enter the age:");
        age = sc.nextInt();
        System.out.print("Enter the adhar number:");
        adhar_number = sc.nextLong();   
        System.out.print("Enter the height:");
        height = sc.nextFloat();  
        System.out.println("Name:"+name);
        System.out.println("Mobile number:"+mobile_number);
        System.out.println("Age:"+age);
        System.out.println("Adhar number:"+adhar_number);
        System.out.println("Height:"+height);
    }
}