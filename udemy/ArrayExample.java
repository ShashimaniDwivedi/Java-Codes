public class ArrayExample {
    public static void main(String[] args) {

        // 1D Array
        int[] arr1 = {10, 20, 30, 40, 50};

        System.out.println("1D Array:");
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        System.out.println("\n");

        // 2D Array
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("2D Array:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array
        int[][] jagged = new int[3][];
        jagged[0]=new int[2];//1 row column will have 2 element
        jagged[0] = new int[]{10, 20};
        jagged[1] = new int[]{30, 40, 50};
        jagged[2] = new int[]{60, 70, 80, 90};

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array
        int[][][] arr3 = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        System.out.println("\n3D Array:");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}