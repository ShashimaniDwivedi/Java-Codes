public class Launch1 {
    public static void main(String[] args) {
    java.util.Date dt=new java.util.Date();//no parameter
    System.out.println(dt);
    long time=dt.getTime();
    java.sql.Date dt1=new java.sql.Date(time);//parametrised
        System.out.println(dt1);
    }
}
