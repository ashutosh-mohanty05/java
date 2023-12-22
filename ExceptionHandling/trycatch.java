package ExceptionHandling;

public class trycatch {
    public static void main(String args[]){
        int marks[]={97,98,91};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            //do something after catching
        }
        System.out.println("i am a good boy");
    }
    
}
