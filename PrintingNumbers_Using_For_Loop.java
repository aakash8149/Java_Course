import java.util.Scanner;

public class PrintingNumbers_Using_For_Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Upto which number u want to print the numbers: ");
        int a = sc.nextInt();

        for (int i = 1; i<=a ;i++){
            System.out.println(i);
        }
    }
}
