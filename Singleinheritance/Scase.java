

class Parent{
    public void add(){
        System.out.println("Hello world");
    }

}
class Child extends Parent{
    void display(){
    add();
}
}
public class Scase{
    public static void main(String args[]){
    Child obj=new Child();
    obj.display();
}
}
