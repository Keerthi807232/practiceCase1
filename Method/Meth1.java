public class Meth1{
    public void add(int x,int y){
        int z=x+y;//
        System.out.println(z);
    }
    public static void main(String args[]){
        int x=10;
        int y=20;
        Meth1 obj=new Meth1();
        obj.add(x,y);

    }
}