public class LoopExample {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);

            sum = sum + i;

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }

            System.out.println("----------------");
        }

        System.out.println("Total Sum = " + sum);
    }
}

