import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args)
    {
        int num1, num2, num3, ch;  // declaration
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("enter first number");
        num1 = sc.nextInt();
        System.out.println("enter second number ");
        num2 = sc.nextInt();
        System.out.println("Choices are :");
        System.out.println(" Addition :");
        System.out.println(" Subtraction :");
        System.out.println("Multiplication :");
        System.out.println(" Division :");
        System.out.println("Enter your choice :");
        ch = sc.nextInt();
               // condition
        switch (ch)
        {
            case 1:
                num3 = num1 + num2;
                System.out.println(" Addition = " + num3);
                break;
            case 2:
                num3 = num1 - num2;
                System.out.println(" Subtraction = " + num3);
                break;
            case 3:
            num3 = (num1 * num2);
            System.out.println(" Multiplication = " + num3);
            break;
            case 4:
            num3 = (num1 / num2);
            System.out.println(" Division = " + num3);
            break;

        }


        {


        }





    }
}
