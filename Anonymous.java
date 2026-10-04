class A{
    
    public void show(){
        System.out.println("in show");
    }


   
}


public class Anonymous {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("in  inner show");
            }
        };
        obj.show();
        
    }
}
