public class InterchangeValue {


    public static void main(String[] args)
    {

        int a = 3; // declare local int value
        int b = 7;  // declare local int value
        int temp = a;  // temp = 5
        a = b; // a = 7
        b = temp; // b = 5

        System.out.println("The value of a = :" + a);
        System.out.println("The value of b = :" + b);

    }

}
