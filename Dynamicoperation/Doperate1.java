import java.util.*;
public class Doperate1{
    public void add(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    public void sub(int x,int y){
        int z=x-y;
        System.out.println(z);
    }
        public void multiple(int x,int y){
        int z=x-y;
        System.out.println(z);
    }    public void division(int x,int y){
        int z=x-y;
        System.out.println(z);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("Enter the value of y:");
        int y=sc.nextInt();
        System.out.println("enter your choice:");
        int choice=sc.nextInt();
        if(choice==1){
           Doperate1 obj=new Doperate1();
            obj.add(x,y);
        }
        if(choice==2){
             Doperate1 obj=new Doperate1();
            obj.sub(x,y);
        }
         if(choice==3){
            Doperate1 obj=new Doperate1();
            obj.multiple(x,y);
        }
         if(choice==4){
            Doperate1 obj=new Doperate1();
            obj.division(x,y);
        }
        
           
    }
}