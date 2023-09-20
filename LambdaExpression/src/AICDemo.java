
interface car {
    void drive();
}
//  class WagonR implements car
//    {
//        public void drive()
//        {
//            System.out.println("driver");
//        }
//
//    }



public class AICDemo {
    public static void main(String[] args) {
   car obj=new car()//Yha pe object Anonymous inner class ka bna hai
   {
       public void drive()
       {
           System.out.println("driver");//Anonymous inner a class
       }
   };
       car obj1=()-> System.out.println("driver");
//         obj.drive();//lambda expression

    }
}
