import java.util.*;
public class Vcase1{
    public static void main(String args[]){
        String v[]={"a","e","i","o","u"};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word ");
        String n=sc.nextLine();
        int detect=0;
        int i=0;
    while(i<=4){
        if(n.equals(v[i])){
            detect=1;
        }
        i=i+1;
    }
        if(detect==1){
            System.out.println("Vowels");
        }
        else{
            System.out.println("Not a vowel");
        }
      
    }

}

