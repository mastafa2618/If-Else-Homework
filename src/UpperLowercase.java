import java.util.Scanner;

public class UpperLowercase {

    public static void main(String[] args)

    {
        char ch, ch2;  // declaration
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println(" enter any character");
        ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')  // logical condition
        {
            ch2= Character.toLowerCase(ch);
            System.out.println("lowercase " + ch2);
        }
        else
        {
            ch2= Character.toUpperCase(ch);
            System.out.println("Uppercase " + ch2);
        }
    }
}
