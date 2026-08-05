public class getMinMax {
    static class Pair
    {
        int min;
        int max;
    }
    public static Pair getMinMax(int arr[],int i,int j)
    {
        Pair minmax=new Pair();
        Pair minmaxLeft=new Pair();
        Pair minmaxRight=new Pair();
        //Small problem
        if(i==j)
        {
            minmax.min=arr[i];
            minmax.max=arr[i];
            return minmax;
        }
        else if(i==j-1)
        {
            if(arr[i]<arr[j])
            {
                minmax.min=arr[i];
                minmax.max=arr[j];
            }
            else {
                minmax.max=arr[i];
                minmax.min=arr[j];
            }
        }
        else {
            //1.Divide
            int mid=i+(j-i)/2;
            //2.Conquer
            minmaxLeft=getMinMax(arr,i,mid);
            minmaxRight=getMinMax(arr,mid+1,j);
            //3.Combine
            //Compared the minimum value of left and right
            if(minmaxLeft.min< minmaxRight.min)
            {
                minmax.min=minmaxLeft.min;
            }
            else {
                minmax.min=minmaxRight.min;
            }
            //Compared the maximum value of left and right
            if(minmaxLeft.max< minmaxRight.max)
            {
                minmax.max=minmaxRight.max;
            }
            else {
                minmax.max=minmaxLeft.max;
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int []arr={50,20,40,90,88,11,13};
        int n=arr.length;
        Pair minmax=getMinMax(arr,0,n-1);
        System.out.println("The smallest element in an array is : "+minmax.min);
        System.out.println("The largest element in an array is : "+minmax.max);
    }
}
//TC o(n)
//Sc O(log n)