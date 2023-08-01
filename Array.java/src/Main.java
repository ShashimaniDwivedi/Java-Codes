public class Main {
    public static void main(String[] args) {
      /*  int nums[] = {5, 4, 3, 7};
        nums = new int[4];

        nums[0] = 5;
        nums[1] = 4;
        nums[2] = 3;
        nums[3] = 7;

        int i;
        for (i = 0; i <= 3; i++)
//       // for(int n:nums)//enhanced for loop
        {
            System.out.println(nums[i]);
            // System.out.println(n);
        }*/
       /* int nums1[][] = new int[3][];
        nums1[0] = new int[4];//jagged array
        nums1[1] = new int[2];
        nums1[2] = new int[2];
        nums1[0][0] = 2;
        nums1[0][1] = 5;
        nums1[1][0] = 3;
        nums1[1][1] = 6;
        nums1[2][0] = 7;
        nums1[2][1] = 8;*/
        int[][] nums1 = new int[][]{
                {2, 5, 5, 9},
                {3, 6, 9, 3},
                {7, 8, 7, 5}
        };
        for (int x = 0; x < 3; x++) {
           // for (int a[] : nums1) {
                for (int y = 0; y < nums1[x].length; y++) {
             //       for (int b : a) {
                        System.out.print(nums1[x][y] + " ");
               //         System.out.print(b + " ");
                    }
                    System.out.println();
                }
            }
          /*  int arr[] = new int[5];
            System.out.println(arr);
            int a[] = {2, 3, 4, 5};
            System.out.println(a[a.length - 1]);
            String name = "ShashimaniDwivedi";
            System.out.println(name.length());*/
    }

    

