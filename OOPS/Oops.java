package OOPS;

class Pen {
    String color;
    String type; //ballpoint; gel
    public void writer(){
        System.out.println("writing something");
    }
    public void print(){
        System.out.println(this.color);
         System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Oops{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="ball pen";
        pen1.writer();
        
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="gel";

        pen1.print();
        pen2.print();

        Student s1=new Student();
        s1.name="ashu";
        s1.age=20;

        s1.printInfo();

    }
}
