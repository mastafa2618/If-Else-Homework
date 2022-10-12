import java.util.Scanner;

public class DayWeek {


    public static void main(String[] args)
    {
        int n; // declaration
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("Enter code of Day");
        n = sc.nextInt();
        // condition check through switch case
        switch (n)
        // input code 0 to 6 & find the output
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid code");


        }


    }
}
