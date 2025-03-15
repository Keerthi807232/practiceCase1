import java.util.*;
public class Tcase1{
    public static void main(String args[]){
        int i=0;
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter times of process:");
        //int n=sc.nextInt();
        while(true){
        System.out.println("1.Car\n2.Truck");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        System.out.println("is there RFID:");
        int RFID=sc.nextInt();
        if(choice==1){
            double Car=100;
            if(RFID==1){
                double a=Car*0.1;
                double b=Car-a;
                System.out.println(b);
            }
            else{
                System.out.println(Car);
            }
        }
        if(choice==2){
            double Truck=200;
            if(RFID==1){
                double c=Truck*0.1;
                double d=Truck-c;
                System.out.println(d);
            }
            else{
                System.out.println(Truck);
            }
        }
        i=i+1;
        }
}
}
