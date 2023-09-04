import java.util.ArrayList;
import java.util.Collections;
//TC O(n^2)
//SC O(n)
public class jobSchedulingProblem {
    char id;
    int deadline;
    int profit;
    public jobSchedulingProblem(){}
    public jobSchedulingProblem(char id,int deadline,int profit)
    {
      this.id=id;
      this.profit=profit;
      this.deadline=deadline;
    }
    void printJobSequence(ArrayList<jobSchedulingProblem>arr,int maxDeadline) {
        int n = arr.size();
        //1. To sort jobs in decreasing order of profit
        //2.  Custom Expression
        //Tc O(n log n)->Merge sort
        Collections.sort(arr, (a, b) -> b.profit - a.profit);
        //3. Create array which keep the track of the booked slots
        boolean result[] = new boolean[maxDeadline];
        //4. To store job ids
        char jobs[] = new char[maxDeadline];
        //5. To store the jobs ids according to the given deadline
       //TC O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(maxDeadline - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                if (result[j] == false) {
                    result[j] = true;
                    //allocated that sk=lot to the current job id
                    jobs[j] = arr.get(i).id;
                    break;
                }
            }
        }
        for(char id:jobs)
        {
         System.out.print(id+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<jobSchedulingProblem>arr=new ArrayList<>();
        arr.add(new jobSchedulingProblem('1',5,55));
        arr.add(new jobSchedulingProblem('2',2,65));
        arr.add(new jobSchedulingProblem('3',7,75));
        arr.add(new jobSchedulingProblem('4',3,60));
        arr.add(new jobSchedulingProblem('5',2,70));
        arr.add(new jobSchedulingProblem('6',1,50));
        arr.add(new jobSchedulingProblem('7',4,85));
        arr.add(new jobSchedulingProblem('8',5,68));
        arr.add(new jobSchedulingProblem('9',3,45));
       System.out.println("Job Sequences to get the maximum profit");
       jobSchedulingProblem job=new jobSchedulingProblem();
       job.printJobSequence(arr,7);
    }
}
