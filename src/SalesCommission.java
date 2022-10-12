import java.util.Scanner;

public class SalesCommission {


    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int id; String name;  int sales; int salarybasic;
        System.out.println("enter seller's id");
        id = sc.nextInt();
        System.out.println("enter seller's name");
        name = sc.next();
        System.out.println("enter sales amount");
        sales = sc.nextInt();
        System.out.println("enter seller's basic salary");
        salarybasic = sc.nextInt();
        double commission = 0;
        if (sales>= 50000)
        {
            commission = sales*.35;
        }
        if (sales>=30000)
        {
            commission= sales*.2;
        }
        if(sales>= 20000)
        {
            commission = sales*.1;
        }
        if (sales>=10000)
        {
            commission = sales*.05;
        }
        if(sales<=10000)
        {
            commission = sales*.02;
        }
        System.out.println("Seller commission " + commission);




    }
}
