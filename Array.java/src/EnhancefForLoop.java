public class EnhancefForLoop {
    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 4, 6};
        for (int n : arr) {
            System.out.println(n);
        }
        System.out.println("Length of array :  "+arr.length);
        System.out.println("****************");

        int num[][] = {
                {3, 5, 4, 2},
                {9, 6, 5, 7},
                {5, 4, 8, 6},
                {1, 4, 2, 3}
        };
        boolean flag=false;
        for(int a[]:num)
        {
            for(int x :a) {
                if (flag) {
                    System.out.print(x + " ");
                }
                flag=!flag;
            }
            System.out.println();
        }
    }
}
