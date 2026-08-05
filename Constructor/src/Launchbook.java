class Books
{
     private int pgNo;
     Books(int pgNo)
     {
      this.pgNo=pgNo;
     }
//    void setPgNo(int pgNo)//method making//setter
//    {
//       this.pgNo=pgNo;
//    }
     int getPgNo()//getter
    {
        return pgNo;
    }

}

public class Launchbook {
    public static void main(String[] args)
    {
    Books b=new Books(100);
     //b.pgNo=-100;
     //System.out.println(b.pgNo());
       // b.setPgNo(100);
        System.out.println(b.getPgNo());
    }

}
