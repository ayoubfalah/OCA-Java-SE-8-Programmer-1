package java_building_blocks.order_of_initialization;

public class Letters
{
   { System.out.println("a"); }
   public Letters()
   {
      System.out.println("b");
   }

   { System.out.println("c"); }

   public static void main(String... args)
   {
      Letters a = new Letters();
      { System.out.println("d"); }
   }

}
