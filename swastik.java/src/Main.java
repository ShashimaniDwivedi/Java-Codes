public class Main {
    public static void main(String[] args) {
        int n = 15;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row==n/2||column==n/2||column==0&&row<=n/2||column==(n-1)&&row>=n/2||row==0&&column>=n/2||row==(n-1)&&column<=n/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}