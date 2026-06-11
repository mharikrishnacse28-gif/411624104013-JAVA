public class June11AN {
    public static void main(String[] args) {   
        // int mark = 80;
        // System.out.println(Grade(mark));
        // int mon=30000;
        // System.out.println(intrestcalc(mon));
        // int watt=256;
        //  System.out.println(current(watt));
        int run =30;
        int balls=5  ;
        System.out.println(strikerate(run,balls));
        
    }
    public static String Grade(int mark) {
        if (mark >= 90 && mark <= 100) {
            return "Grade A";
        } else if (mark >= 80 && mark <= 89) {
            return "Grade B";
        } else if (mark >= 70 && mark <= 79) {
            return "Grade C";
        }else if (mark >= 60 && mark <= 69) {
            return "Grade D";
        }else if (mark >= 50 && mark <= 59) {
            return "Grade E";
        }
        else {
            return "Fail";
        }
    }
    public static int intrestcalc(int mon) {
        if(mon>=10000){
            int intrest=(mon*10)/100;
            return mon+intrest;
        }
        else if(mon>=80000){
            int intrest =(mon*8)/100;
            return mon+intrest;
        }
        else if(mon>=60000){
            int intrest=(mon*6)/100;
            return mon+intrest;
        }
        else if(mon>=50000){
            int intrest=(mon*5)/100;
            return mon+intrest;
        }else{
            return -1;
        }
    }
    public static int current(int watt){
        int bill;
        if(watt>300){
            bill =100*5+100*6+100*7+(watt-300)*8;
            return bill;
        }
        else if(watt>200){
            bill =100*5+100*6+(watt-200)*7;
            return bill;
        }
        else if(watt>100){
            bill=100*5+(watt-100)*6;
            return bill;
        }
        else{
            bill = watt*5;
            return bill;
        }
    }
    public static String strikerate(int runs,int balls){
        int strikeRate=(runs/balls)*100;
        if(strikeRate>150){
            return "Explosive";
        }
        else if(strikeRate>=100 && strikeRate>=150){
            return "Good";
        }
        else{
            return "bad";
        }        

    }
}
