//Make a program that prints the table of a number that is input by the user.
import java.util.Scanner;

public class Number_Tables {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number for which you want the table: ");
        int number = sc.nextInt();

        for (int i = 1; i<=10; i++)
        {
            int table = number * i;
            System.out.println(number +"*"+ i +" = "+ table);
        }

    }
}
