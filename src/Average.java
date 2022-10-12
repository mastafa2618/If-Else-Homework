import java.util.Scanner;

public class Average {


    public static void main(String[] args)
    {

        float num1; float num2; float num3; float num4; float num5;   // declaration

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");  // input
        num1 = sc.nextFloat();
        System.out.println("enter the second number");
        num2 = sc.nextFloat();
        System.out.println("enter the third number");
        num3 = sc.nextFloat();
        System.out.println("enter the forth number");
        num4 = sc.nextFloat();
        System.out.println("enter the second number");
        num5 = sc.nextFloat();
        System.out.println();
        float avg;
        avg = (float)(num1 + num2 + num3 + num4 + num5)/5;
        System.out.println(" Average of the five number is :" + avg);


    }
}
