import java.util.Scanner;

public class Pattern_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter The Number of columns: ");
        int columns = scanner.nextInt();

        for (int i=1; i<=rows;i++){
            for (int j = 1; j<=columns; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
