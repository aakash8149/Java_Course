import java.util.Scanner;

public class Loop_HelloWorld {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many times you want to print the number: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Hello World using Loops....");
        }
    }
}
