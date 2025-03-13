public class Stringadd{
    public String add(String a,String b,String c){
        String z=a+b+c;
        return z;
    }
    public static void main(String args[]){
        String a="Hello";
        String b=" ";
        String c="Programmer";
        Stringadd obj=new Stringadd();
        String result=obj.add(a,b,c);
        System.out.println(result);
    }
}