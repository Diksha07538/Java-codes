//ENTER 3 NUMBERS FROM THE USER AND MAKE A FUNCTION TO PRINT THEIR AVERAGE 
import java.util.*;

public class a {
    public static double calculateaverage(int x, int y, int z) {
        double average = (x + y + z) / 3.0; // 3.0 is important
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        double average = calculateaverage(x, y, z);
        System.out.println("Average = " + average);

        sc.close();
    }
}
