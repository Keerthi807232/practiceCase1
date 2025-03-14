class Parent{
    void display(){

    }
    }

class Child extends Parent{
    void display(){
    System.out.println("world");
}
}
public class Ocase1{
    public static void main(String args[]){
    Child obj=new Child();
    obj.display();
}
}
