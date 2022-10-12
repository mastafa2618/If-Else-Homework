import java.util.Scanner;

public class VoterEligible {


    public static void main(String[] args)
    {

        int age; // declaration
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("enter a person's age");
        age = sc.nextInt();
        if(age>=18)   // condition
        {
            System.out.println("The person is eligible to vote");
        }
          if(age<18) // condition
        {
            System.out.println("The person is not eligible to vote");
        }

    }
}
