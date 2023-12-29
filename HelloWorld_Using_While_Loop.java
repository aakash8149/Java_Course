import java.util.Scanner;

public class HelloWorld_Using_While_Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int i = 0;
        while(i<n){
            System.out.println("Hello World using While Loop..."); i++;
        }
    }
}
