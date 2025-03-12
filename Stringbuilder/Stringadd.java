public class Stringadd{
    public String add(String a,String b){
        String z=a+b;
        return z;
    }
    public static void main(String args[]){
        String a="Hello";
        String b="Programmer";
        Stringadd obj=new Stringadd();
        String result=obj.add(a,b);
        System.out.println(result);
    }
}