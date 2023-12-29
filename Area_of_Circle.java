//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle: ");
        float radius = sc.nextFloat();
        double area = 3.14 * (radius * radius);
        System.out.println("The area of your Circle is: " + area);
    }
}