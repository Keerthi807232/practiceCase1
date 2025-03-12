public class Returninteger{
    public int multiple(int num1,int num2){
        int num3=num1*num2;
        return num3;
    }
    public static void main(String args[]){
        Returninteger obj=new Returninteger();
        int result=obj.multiple(20,3);
        System.out.println(result);
    }
}