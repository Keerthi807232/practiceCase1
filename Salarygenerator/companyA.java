import java.util.*;
public class companyA{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employment:");
        String employee=sc.nextLine();
        System.out.println("Enter the salary:");
        int s=sc.nextInt();
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        System.out.println("1.manager/n2.developer");
        if(choice==1){
            float a=s*0.1f;
            float msalary=a+s;
            System.out.println(msalary);
 
        
        }
        
        if(choice==2){
            float b=s*0.2f;
            float dsalary=b+s;
            System.out.println(dsalary);
    
        
        }

    }
}