import java.util.Scanner;

public class Printing_Numbers_Using_While_Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Terminating Number: ");
        int s = sc.nextInt();

        int i = 1;
        while(i<=s){
            System.out.println(i);
            i++;
        }
    }
}
