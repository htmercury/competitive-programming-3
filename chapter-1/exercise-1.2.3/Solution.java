import java.util.Scanner;
import java.util.Locale;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

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


    /**
     * @param n
     * print pi to n digits after the decimal point (rounded).
     */
    public static void EchoPiDigits(int n) {
        String form = "%." + n + "f%n";
        System.out.format(form, Math.PI);
    }

    /**
     * @param date
     * given a date, determine the day of the week
     */
    public static void getDay(String date) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
        try {
            c.setTime(format.parse(date));
            System.out.println(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US));
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }
    }

    public static void sortDistinctInts(int[] arr) {
        
    }

    public static void main(String arg[]){
//        readDouble();
//        EchoPiDigits(4);
//        getDay("9 August 2010");

    }
}