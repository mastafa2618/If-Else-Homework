import java.util.Scanner;

public class NamAlphSym {



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println(" Enter a character : ");
        ch = sc. next().charAt(0);
        System.out.println(ch>='a' && ch <= 'z' ? "small case alphabet" : ch >= 'A' && ch<= 'z' ? "Capital case alphabet"
                : ch>= '0' && ch<='9' ? "Digit"
                :"Symbol");



    }


    }

