public class Primitive_Data_Types {
    public static void main(String[]args){

        int myMaxIntegerValue = Integer.MAX_VALUE;
        int myMinIntegerValue = Integer.MIN_VALUE;

        System.out.println("The Max Value that can be stored in an Integer is: " + myMaxIntegerValue);
        System.out.println("The Min Value that can be stored in an Integer is: " + myMinIntegerValue);

        // Doing the case of Overflow

        System.out.println("Busted and Overflow: " + (myMaxIntegerValue + 1));

        // Doing the case of Underflow

        System.out.println("Busted and Underflow: " + (myMinIntegerValue - 1));

    }
}
