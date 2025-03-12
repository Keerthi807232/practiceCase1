public class ReturnString{
    public String getmessage(){
        String message="Hi im your program developer";
        return message;
    }
    public static void main(String args[]){
        ReturnString obj=new ReturnString();
        String result=obj.getmessage();
        System.out.println(result);
    }
}