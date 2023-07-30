import java.util.Arrays;

public class noOfInversion {
    public static int inversionCount(int []arr,int n)
    {
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                //Condition
                //i<j ->1
                //arr[i]>arr[j] ->2
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int inversionCountOpt(int []arr,int l,int h)
    {
        int count=0;
        //Divide and conquer approach
        if(l<h)
        {
            int mid=l+(h-l)/2;
            count+= inversionCountOpt(arr,l,mid);
            count+=inversionCountOpt(arr,mid+1,h);
            count +=Mergeprocedure(arr,l,mid,h);
        }
        return count;
    }
   public static int Mergeprocedure(int arr[],int l,int mid,int h)
   {
       int swap=0;
       //left and right sub array
       int []lsubArray= Arrays.copyOfRange(arr,l,mid+1);//mid+1 because Aakhiri index include nahi hota hai
       int []rsubArray= Arrays.copyOfRange(arr,mid+1,h+1);
       int i=0,j=0,k=l;
       while(i<lsubArray.length&&j<rsubArray.length)
       {
           if(lsubArray[i]<=rsubArray[j])
           {
               arr[k++]=lsubArray[i++];
           }
           else {
               arr[k++]=rsubArray[j++];
               //Calculate yhe number of swaps
               //How below value is valid
               swap+=(mid+1)-(l+i);
           }
       }
       while(i<lsubArray.length)
       {
               arr[k++]=lsubArray[i++];
       }
       while(j<rsubArray.length)
       {
           arr[k++]=rsubArray[j++];
       }
       return swap;
   }
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        int n=arr.length;
        int count=inversionCount(arr,n);
        int count2=inversionCountOpt(arr,0,n-1);
        System.out.println("Total no of inversion using Brute force Approach : "+count);
        System.out.println("Total no of inversion using Divide and Conquer Approach : "+count2);
    }
}
