package OOPS;

class Pen{
        String color;
        String type;  //ballpoint; gel

          Pen() {
           System.out.println("constructor called");
        }
        
         public void print(){
        System.out.println(this.color);
         System.out.println(this.type);
    }
       
      
    }


public class Constructor {
  
    
        public static void main(String[] args) {
            Pen pen1=new Pen();
            pen1.color="blue";
            pen1.type="ball pen";
            pen1.print();
           
        }
    
}

   

