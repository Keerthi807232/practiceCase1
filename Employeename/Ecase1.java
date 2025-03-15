import java.util.*;
class Employee{
    int calculateSalary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary:");
        int baseSalary=sc.nextInt();
        return baseSalary;
    }

}
class Manager extends Employee{
    void msalary(){
    int baseSalary=calculateSalary();
    double a=baseSalary*0.2;
    double b=baseSalary+a;
    System.out.println("Generated Salary:"+b);
}
}
class Developer extends Employee{
    void dsalary(){
    int baseSalary=calculateSalary();
    double c=baseSalary*0.2;
    double d=baseSalary+c;
    System.out.println("Generated Salary:"+d);     
    }
}
public class Ecase1{
    public static void main(String args[]){
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter times of process:");
        int n=sc.nextInt();
        while(i<n){
        System.out.println("1.manager\n2.developer");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();

        if(choice==1){
            Manager obj=new Manager();
            obj.msalary();   
        }
        if(choice==2){
            Developer obj=new Developer();
            obj.dsalary();
        }
        i=i+1;
        }
}
}
