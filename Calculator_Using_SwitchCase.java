import java.util.Scanner;
//Making a Calculator Using Switch Case...
public class Calculator_Using_SwitchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Operation you want to perform[+,-,*,/]: ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println("The Sum is: " + (num1+num2));
                break;
            case '-':
                if (num2>num1){
                    System.out.println("The Subtraction is: " + (num2-num1));
                    break;
                }
                else{
                    System.out.println("The Subtraction is: " + (num1-num2));
                    break;
                }
            case '*':
                System.out.println("The Multiplication is: " + num1*num2);
                break;
            case '/':
                if (num2>num1){
                    System.out.println("The Division will be: " + (num2/num1));
                    break;
                }
                else {
                    System.out.println("The Division will be: " + (num1/num2));
                    break;
                }
            default:
                System.out.println("Invalid Input... Please give valid inputs....");
        }

    }
}
