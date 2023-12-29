import java.util.Scanner;
//18 Years or Adult or not....
public class If_Else_18_Adults {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age>18){
            System.out.println("You are an Adult....");
        }
        else
        {
            System.out.println("Sorry, You are not an Adult");
        }
    }
}
