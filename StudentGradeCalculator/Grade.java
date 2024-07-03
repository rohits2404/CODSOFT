import java.util.Scanner;

public class Grade
{

    public static int sumMarks(int arr[])
    {
        int Total = 0;

        for(int i=0;i<5;i++)
        {
            Total+=arr[i];
        }

        return Total;
    }

    public static Double percent( int marks)
    {
        Double Percentage = marks/5.0;
        return Percentage;
    }

    public static String grade(Double Percentage)
    {
        if(Percentage>=95)
        {
            return "A-1";
        }
        else if(Percentage<=95 && Percentage>=85.5)
        {
            return "A-2";
        }
        else if(Percentage<=85.5 && Percentage>=76)
        {
            return "B-1";
        }
        else if(Percentage<=76 && Percentage>=66.5)
        {
            return "B-2";
        }
        else if(Percentage<=66.5 && Percentage>=57)
        {
            return "C-1";
        }
        else if(Percentage<=57 && Percentage>=47.5)
        {
            return "C-2";
        }
        else if(Percentage<=47.5 && Percentage>=38)
        {
            return "D-1";
        }
        else{
            return "E";
        }
    }

    public static void Display(int TotalMarks,Double Percentage,String Grade)
    {
        System.out.println("Total Marks Obtained By Student : "+TotalMarks);

        System.out.println("Average Percentage : "+Percentage);

        System.out.println("Grade Obtained By Student : "+Grade);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String subject[] = {"Physics","Chemistry","Mathematics","English Core","Computer Science"};
        int marks[] = new int[5];


        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Marks (out of 100) in "+subject[i]+" :");
            marks[i] = sc.nextInt();
        }

        int TotalMarks = sumMarks(marks);

        Double Percentage = percent(TotalMarks);

        String Grade = grade(Percentage);

        Display(TotalMarks,Percentage,Grade);

        sc.close();
    }
}