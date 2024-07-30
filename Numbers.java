import java.util.Scanner;

public class Numbers{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter Number one: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Number two: ");
            int num2 = sc.nextInt();
            System.out.print("Enter Number three: ");
            int num3 = sc.nextInt();
            int max = 0,avg=0;

            if(num2>num3 && num2>num1)//10 5 1
            {
                max = num2;
            }
            else if(num3>num1 && num3>num2)
            {
                max = num3;
            }
            else
            {
                max = num1;
            }

            System.out.println("Maximum Number is: "+max);

            avg = (num1+num2+num3)/3;
            System.out.print("Average  of Numbers is: "+avg);
        }

    }
}