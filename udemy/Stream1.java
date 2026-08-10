import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream1 {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
    	//1 way
//    	for(int i=0;i<nums.size();i++)
//    	{
//    		System.out.println(nums.get(i));
//    	}
    	
    	//2 way
//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}
    	//3 way without lambda 
        // @FunctionalInterface
        Consumer<Integer>con=new Consumer<>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);

        //4 foreach with lambda
    	nums.forEach(n -> System.out.println(n));
    	
    	
    	int sum=0;
    	for(int n:nums)
    	{
    		if(n%2==0)
    		{
    			n=n*2;
    			sum=sum+n;
    		}
    	}
    	
//    	System.out.println(nums);
    	System.out.println(sum);
  
    }
}