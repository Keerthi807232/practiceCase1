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
        int result=obj.add(120,359);
        System.out.println(result);
        int output=obj.sub(200,45);
        System.out.println(output);
        int answer=obj.multiple(20,3);
        System.out.println(answer);
        int resul=obj.division(21,3);
        System.out.println(resul);
    }
}