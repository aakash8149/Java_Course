import java.util.Scanner;

public class Equality_of_Numbers {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b)
        {
            System.out.println("Both are Equal");
        } else if (a>b) {
            System.out.println(a + " is Greater...");
        } else if (b>a) {
            System.out.println(b + " is Greater...");
        }
    }
}
