import java.util.Scanner;

public class Nnumber {

    public static void main(String[] args)
    {
        int number; // declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");  // input
        number = sc.nextInt();
        if (number > 0)     // output
        {
            System.out.println("the number is a Positive number :" +number);

        }
        else if(number<0)
        {
            System.out.println("the number is a negative number :" + number);
        }
        else
    {
        System.out.println(" the number is a Zero :" + number);
    }


    }
}
