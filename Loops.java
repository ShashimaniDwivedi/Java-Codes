public class Loops {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    int x=1;
    while(x<5){
        System.out.println(x);
        x++;
    }
    System.out.println();
    //do while run 1 time irrespective of the condition 
    int y=0;
    do{
        System.out.println(y);
        y++;
    }while(y<5);
    }
    
}
