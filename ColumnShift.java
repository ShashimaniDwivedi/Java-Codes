
class ColumnShift {
  public static void Cshift(int matrix[][]) {
    // Shift each row by one position to the right
    for (int i = 0; i < matrix.length; i++) {
      int temp = matrix[i][matrix[i].length - 1];

      for (int j = matrix[i].length - 1; j > 0; j--) {
        matrix[i][j] = matrix[i][j - 1];
      }

      matrix[i][0] = temp;
    }
  }

  public static void Rshift(int matrix[][]) {
    for (int j = matrix[0].length - 1; j >= 0; j--) { // Column loop
      int temp = matrix[matrix.length - 1][j]; // store the last element of the current column in a temporary variable
      for (int i = matrix.length - 1; i > 0; i--) { // Row loop
        matrix[i][j] = matrix[i - 1][j];
      }
      matrix[0][j] = temp;
    }
  }

  public static void disp(int matrix[][]) {
    // Print the resulting matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int matrix[][] = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    System.out.println("Original Matrix:");
    disp(matrix);
    // Cshift(matrix);
    Rshift(matrix);
    System.out.println("\nColumn-wise shifted Matrix:");
    disp(matrix);

  }
}

/*
 * class HelloWorld {
 * public static void main(String[] args) {
 * int arr[] = { 1, 2, 3 };
 * int temp = arr[arr.length - 1];
 * for (int i = arr.length - 1; i > 0; i--) {
 * arr[i] = arr[i - 1];
 * }
 * arr[0] = temp;
 * for (int j = 0; j < arr.length; j++) {
 * System.out.print(arr[j] + " ");
 * }
 * }
 * }
 */