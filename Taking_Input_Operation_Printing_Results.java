import java.util.Scanner;
//Taking Inputs from the users for the variable a and b then performing sum of them and printing the results...
public class Taking_Input_Operation_Printing_Results {
    public static void main(String args[]){

        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of a: ");
        a = sc.nextInt();
        System.out.print("Enter the Value of b: ");
        b = sc.nextInt();
        System.out.println("The Required SUM is: " + (a+b));
    }
}
