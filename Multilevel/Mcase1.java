
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
class Third extends Child{
    void helper(){
        display();
    }
}
public class Mcase1{
    public static void main(String args[]){
    Child obj=new Child();
    obj.display();
}
}