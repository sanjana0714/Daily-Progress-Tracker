import java.util.*;
class Booombaa {
  String name;
  float cost;
  String color;
}
class Car{
  String name;
  float cost;
}
public class Main {
    public static void main(String[] args) {
      Booombaa b1=new Booombaa();
      b1.name ="lab";
      b1.cost = 7890f;
      b1.color = "blue";
      System.out.println(b1.name);
      System.out.println(b1.cost);
      System.out.println(b1.color);
      Booombaa b2;
      b2=b1;
      b2.name ="lgghljjkl";
      System.out.println(b1.name);
          Car c2 = new Car();
          c2.name ="sanjana";
          c2.cost= 8967.9f;
           System.out.println(c2.name);
           System.out.println(c2.cost);
      
          
    }
}