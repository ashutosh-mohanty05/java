package methods;

import java.util.concurrent.CountDownLatch;

public class method1 {
    public static void printjava(){
        System.out.println("ashu");
    }
    /*public static void main(String[] args){
        printjava();
        printjava();
        printjava();
     } */
    public static void printsum(int x,int y){
    int sum=x+y;
    System.out.println(sum);
    }
    public static void main(String[] args){
        printsum(5,6);
    }
}
