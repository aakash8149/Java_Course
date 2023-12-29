import java.util.Scanner;

public class Switch_Case_Method {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        int number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Nomoskar");
                break;
            default:
                System.out.println("Wrong Input....");
        }
    }
}