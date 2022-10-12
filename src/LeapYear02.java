public class LeapYear02 {


    static String s1 = "Leap Year";
    static String s2 = "Not Leap Year";

    public static void main(String[] args) {

        int x =1942;

        if(x % 4 == 0)  // (As we know years divisible by 4 = 0 are the leap years & years divided by 4 != 0
            // are not leap years

        {
            System.out.println("The year of " + x +" is : " + s1);

        }
        else
        {
            System.out.println( "The year of " + x +" is " + s2);
        }
    }

}
