import java.util.Arrays;
import java.util.LinkedList;

//time complexity : O(n logn) + O(n) = O(n logn)
// space complexity: O(n)
class Solution {
    public int[][] merge(int[][] intervals) {
        //1. Sort the intervals on the basis of start values in the intervals - O(n logn)
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //2. Iterating over all the intervals
        // Looking for the overlapping and non-overlapping pairs
        LinkedList<int[]> merged = new LinkedList<>();
        // O(n)
        for(int[] interval: intervals){
            // No overlapping
            // lastEnd < currentStart
            // [0] - start
            // [1] - end
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }
            // Overlapping condition
            // current start < last end
            else{
                // max(lastEnd, currEnd)
                merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);
            }
        }
        // conversion of the linked list to an array
        return merged.toArray(new int[0][0]);
    }
}

public class mergeInterval {
    public static void main(String[] args) {
        Solution s=new Solution();
        int result[][];
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        //function calling
        result=s.merge(arr);
        for(int[] interval : result)
        System.out.print(Arrays.toString(interval)+" ");
    }
}
