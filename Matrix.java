public class Matrix {
    public static void main(String[] args) {

        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        int count = 0;

        // Loop through matrix
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Number of negative numbers: " + count);
    }
}

