import java.util.Scanner;

public class Input_Cases {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //For Printing the First Word of a Sentence or Just a token....
//        System.out.println("Enter Your Line: ");
//        String token = sc.next();
        //System.out.println("Your Token: "+token);

        //For Printing the Complete Sentence...
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        //System.out.println("Name : "+name);

        //For Taking Integer type inputs...
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        //For taking float inputs.....
        System.out.print("Enter your CGPA: ");
        float cgpa = sc.nextFloat();

        //For taking double inputs....
        System.out.print("Enter the Price of the pen: ");
        double pen = sc.nextDouble();

        //For taking long inputs such as phone numbers....
        System.out.print("Enter your Mobile Number: ");
        long number = sc.nextLong();

        System.out.println("Your Details:  ");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Pen's Price: " + pen);
        System.out.println("Phone Number: " + number);
    }
}
