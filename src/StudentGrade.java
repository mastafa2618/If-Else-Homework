import java.util.Scanner;

public class StudentGrade {


    static int total;
    static float percentage;
    static int marks;

    public static void studentsResult(String name, int roll, int math, int sci, int eng )
    {
        total = math + sci + sci;
        percentage = (float) (total/300.0) * 100;
        
        System.out.println("The name of the student is " + name +" Roll no :"   +  roll +  " & Total marks :" + total
         + " Percentage  :" + percentage );

    }


    public static void main(String[] args)
    {
        studentsResult("Mike",12455,60,62,82);

        Scanner in = new Scanner(System.in);
        System.out.println("enter the marks of math");
        System.out.println("enter the marks of sci");
        System.out.println("enter the marks eng");
        if(percentage>=80)
        {
            System.out.println("His Grade is A+ ");
        }
        else if(percentage>=60)
        {
            System.out.println("His Grade is A");
        }
        else if(percentage>=50)
        {
            System.out.println("His Grade is B");
        }
        else if(percentage>=35)
        {
            System.out.println("His Grade is C");
        }
        else
        {
            System.out.println("Fail");

        }

    }

    }


