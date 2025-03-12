public class Prac1{
    /*
    1)add method
    2)printouy the value of that method
    */
    public void add(int x,int y){
        int z=x+y;//
        System.out.println(z);
    }
    public static void main(String args[]){
        int x=10;
        int y=20;
        Prac1 obj=new Prac1();
        obj.add(x,y);

    }
}