public class Calculation{
    public int add(int num1,int num2){
        int num3=num1*num2;
        return num3;
    }
    public int sub(int x,int y){
        int z=x-y;
        return z;
    }
    public int multiple(int num1,int num2){
        int num3=num1*num2;
        return num3;
    }
    public int division(int x,int y){
        int z=x/y;
        return z;
    }
    public static void main(String args[]){
        Calculation obj=new Calculation();
        int a=obj.add(120,359);
        System.out.println(a);
        int b=obj.sub(200,45);
        System.out.println(b);
        int c=obj.multiple(20,3);
        System.out.println(c);
        int d=obj.division(21,3);
        System.out.println(d);
    }
}