import java.util.*;
class Car 
{
  String name;
  int noofseats;
  float cost;
  
}
public class Main {
    public static void main(String[] args)
    {
      Car a =new Car();
      a.name = "Maruthi";
      a.noofseats = 5;
      a.cost = 78999.8f;
      System.out.println(a.name);
      System.out.println(a.noofseats);
      System.out.println(a.cost);
    
      Car b;
      b=a;
      b.name = "KIA";
      b.noofseats = 7;
      b.cost = 7689.7f;
      System.out.println(a.name);
      System.out.println(a.noofseats);
      System.out.println(a.cost);
      
  
  
  
  
  
  
  
  
  
    }
}