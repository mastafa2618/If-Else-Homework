import java.util.Scanner;

public class Salary {




    public static void main(String[] args)
    {
        //declaration

        Scanner sc = new Scanner(System.in);
        String id;  String name;
          // input
        System.out.println("enter the id of employee");
        id = sc.nextLine();

        System.out.println("enter the name of employee");
        name = sc.nextLine();
        double basicsalary;
        System.out.println("enter basicsalary of employee");
        basicsalary = sc.nextInt();
        double HRA = basicsalary * 10/100;
        double DA = basicsalary * 8/100;
        double TA = basicsalary * 9/100;
        double PF = basicsalary * 20/100;
        double Grosssalary = basicsalary+HRA +TA +DA-PF;
         // output
        System.out.println("employee id :" +  id  + " \nName:" + name );
        System.out.println("Employee Gross salary " + Grosssalary);
    }
}
