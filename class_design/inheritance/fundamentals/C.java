package class_design.inheritance.fundamentals;

public class C extends S 
{
   public String toString(){ return "Sub class"; }
   
   public static void main(String... args)
   {
       // The object type determines the implementation is executed
       // for overriden methods
       S obj = new C();
       System.out.println(obj);
   }
}
