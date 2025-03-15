import java.util.*;
public class Gcase1{
    public void CalculateGrade(int marks){
        if(marks>=90){
            System.out.println("A");
        }
        else if(marks>=75){
            System.out.println("B");

        }
        else if(marks>=50){
            System.out.println("C");

        }
        else{
            System.out.println("D");

        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();
        Gcase1 obj=new Gcase1();
        obj.CalculateGrade(marks);


    }
    }