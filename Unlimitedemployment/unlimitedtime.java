import java.util.*;
public class unlimitedtime{
    public static void main(String args[]){
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter times of process:");
        int n=sc.nextInt();
        while(i<n){
        System.out.println("1.manager\n2.developer");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        System.out.println("Enter the salary:");
        int s=sc.nextInt();



        if(choice==1){
            double a=s*0.1;
            double msalary=a+s;
            System.out.println("Generated salary:"+msalary);       
        }
        if(choice==2){
            double b=s*0.2;
            double dsalary=b+s;
            System.out.println("Generated salary:"+dsalary);
        }
        i=i+1;
        }

    }
}