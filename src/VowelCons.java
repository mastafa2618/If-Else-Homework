import java.util.Scanner;

public class VowelCons {

    public static void main(String[] args)
    {

        char ch; // declaration
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("Enter the alphabet");

        ch = sc.next().charAt(0);

        System.out.println("Char    = " + ch);

        // check input through switch case to find the output
        switch (ch)
        {
            case 'a':
                System.out.println(" Vowel");
                break;
            case 'e':
                System.out.println(" Vowel");
                break;
            case 'i':
                System.out.println(" Vowel");
                break;
            case 'o':
                System.out.println(" Vowel");
                break;
            case 'u':
                System.out.println(" Vowel");
                break;
            default:
                System.out.println("Consonant");
        }



    }
}
