import java.util.Scanner;

public class CityName {

    public static void main(String[] args)

    {

        String alphabet;   // declaration
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("enter any alphabet");
        alphabet =sc.next();
          // outcome
        switch (alphabet)
        {
            case "A":
                System.out.println("Atlanta");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Calcata");
                break;
            case "D":
                System.out.println("Dhaka");
                break;
            case "L":
                System.out.println("London");
                break;
            default:
                System.out.println("Out of the world");


        }

    }
}
