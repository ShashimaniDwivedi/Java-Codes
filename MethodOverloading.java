class MethodOverloading{
    //Same Method with diffrent parameters
    public int Calc(int a,int b){
        return a+b;
    }

    public int Calc(int a,int b,int c){
        return a+b+c;
    }

    public int Calc(int a,int b,int c ,int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.Calc(1,2));
        System.out.println(obj.Calc(1,2,3));
        System.out.println(obj.Calc(1,2,3,4));
    }
}