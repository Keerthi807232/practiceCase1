import java.util.Scanner;
public class Pcase1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value");
        int n=input.nextInt();
        if (n<=1){
            System.out.println("it is not a prime number"+n);
        } 
        else{
            int count=0;
            for (int i=2;i<n;i++){
                if (n%i==0) {
                    count=count+1;
                    break; 
                }
            }
            if(count==0){
                System.out.println("It is a prime number"+n);
            } 
            else{
                System.out.println("It is not a prime number"+n);
            }
        }
    }
}
