import java.util.*;

public class AppleBoxes {
    public static void main(String[] args) {

        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5, 2};

        int totalApples = 0;
        for (int a : apple) {
            totalApples += a;
        }

        Arrays.sort(capacity);

        int sum = 0;
        int boxes = 0;

        for (int i = capacity.length - 1; i >= 0; i--) {
            sum += capacity[i];
            boxes++;
            if (sum >= totalApples) {
                break;
            }
        }

        System.out.println("Minimum boxes needed: " + boxes);
    }
}
