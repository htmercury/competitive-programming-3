import java.util.Scanner;

public class Solution{

    /**
     * read in a double, echo it, but with minimum field width of 7 and 3 digits after decimal point
     */
    public static void readDouble() {
        double inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number (double):");
        inData = scan.nextDouble();

        System.out.format("%7.3f%n", inData);
    }

    public static void main(String arg[]){
        System.out.println("Hello world");
        readDouble();
    }
}