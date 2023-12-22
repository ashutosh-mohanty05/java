package JAVAPROJECT;
import java.util.Scanner;
public class miniproject {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
        
        while(usernumber>=0){
            System.out.println("Guess my number(1-100)");
            usernumber=sc.nextInt();
        if(mynumber==usernumber){
        System.out.println("you win.....you correct");
        break;
        }
        else if(mynumber>usernumber)
        System.out.println("your number is small");
        else
        System.out.println("your number is large");
        }

        System.out.println("my number was: ");
        System.out.println(mynumber);
    }
}
