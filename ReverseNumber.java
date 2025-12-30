public class ReverseNumber {
    public static void main(String[] args) {

        int number = 12345;
        int temp = number;
        int reverse = 0;
        int count = 0;

        while (temp != 0) {
            int digit = temp % 10;     // get last digit
            reverse = reverse * 10 + digit; // build reverse
            temp = temp / 10;          // remove last digit
            count++;                   // count digits
        }

        System.out.println("Original Number: " + number);
        System.out.println("Total Digits: " + count);
        System.out.println("Reversed Number: " + reverse);
    }
}

