import java.util.*;

public class sortNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    ArrayList<Integer> al =new ArrayList<Integer>();
    System.out.print("Enter number : ");
    int n= sc.nextInt();
    int digit=0;
    while(n>0){
      digit=n%10;
      al.add(digit);
      n/=10;
    }
    Collections.sort(al);
    int num=0;
    for(int i=0;i<al.size();i++){
     num=num*10+al.get(i);
    }
    System.out.println(num);
  }
  
}
