import java.util.*;

public class Excep {
    
    static void formatexcep(){
         Scanner sc=new Scanner(System.in);
      try{
          String a=sc.nextLine(); 
          int b=Integer.parseInt(a);
          int res=b*b;
          System.out.println(res);
          
      }
      catch(Exception e)
      {
         System.out.println("Entered input is not a valid format for an integer");
      }
     
       }
    
    

    
   public static void main(String args[])
{
Excep.formatexcep();
}
}
