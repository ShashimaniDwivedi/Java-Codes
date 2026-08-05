public class Arr {
    public int Calc(int[] nums){
     int res=0;
     for (int i : nums) {
        res+=i;
     }return res;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        //for each loop
        for (int i : nums) {
           System.out.print(i+" "); 
        }
        System.out.println();
        int[] a1=new int[5];
        for(int i=0;i<a1.length;i++)
            a1[i]=i+1;
        
        for(int i=0;i<a1.length;i++)
        System.out.print(a1[i]+" ");
        System.out.println();

        int[][] num=new int[2][2];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                num[i][j]=i+j;
            }
        }
        // num[0][0]=1;
        // num[0]=new int[]{1,2,3,4};
        System.out.println("***2D Array***");
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                // num[i][j]=i+j;
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("**Jagged Array**");
        //row fixed column not fixed
        int[][] arr={{1,2,3},{4,5},{6,7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] a2=new int[3][];
        a2[0]=new int[4];
        a2[1]=new int[5];
        a2[2]=new int[3];
        a2[0]=new int[]{1,2,3,4};
        a2[1]=new int[]{5,4,6,8,9,3,6,4};
        a2[2]=new int[]{8,9,3,2,5};

        for (int[] is : a2) {
            for(int a:is){
                System.out.print(a+" ");
            }
          System.out.println();  
        }
        String name="Manas";
        System.out.println(name.length());
        System.out.println("**AnonymousArray**");
        //can be used only once
        Arr obj=new Arr();
        int ans=obj.Calc(new int[]{1,2,3,4});
        System.out.println("Result of Anonymous array : "+ans);
    }
}
