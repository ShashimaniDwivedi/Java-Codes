
class Science{
    private int Math;
    private int Chem;
    private int phy;
    public void setMath(int Math)
    {
        this.Math=Math;
    }
    public int getMath() {
        return Math;
    }

    public void setChem(int chem) {
        this.Chem=chem;
    }
    public int getChem() {
        return Chem;
    }
    public void setPhy(int phy) {
        this.phy=phy;
    }
    public int getPhy() {
        return phy;
    }
}

public class College {
    public static void main(String[] args) {
       Science obj=new Science();
       obj.setMath(94);
      int a= obj.getMath();
       obj.setChem(95);
      int b= obj.getChem();
       obj.setPhy(97);
      int c= obj.getPhy();
      System.out.println("The Marks of Science student are :"+a+" "+b+" "+c);
    }
}
