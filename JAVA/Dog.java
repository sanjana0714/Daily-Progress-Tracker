import java.util.*;
class Dog {
  String bread;
  
  float   cost;
  
}

public class Main {
    public static void main(String[] args) {
   Dog d1  = new Dog();
   d1.bread="lab";
   d1.cost=7.5f;
   System.out.println(d1.bread);
   System.out.println(d1.cost);
   Dog d2;
   d2=d1;
   d2.bread = "pu";
   d2.cost = 1000.0f;
   
      System.out.println(d1.bread);
      System.out.println(d1.cost);
    }
}