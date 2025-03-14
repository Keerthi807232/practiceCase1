public class Methodoverload{
    public void multiple(int x,int y){
        int z=x*y;
        System.out.println(z);
    }
    public void multiple(int x,int y,int z){
        int a=x*y*z;
        System.out.println(z);
    }
    public static void main(String args[]){
        Methodoverload obj=new Methodoverload();
        obj.multiple(10,20);
        obj.multiple(5,4,10);

    }
}