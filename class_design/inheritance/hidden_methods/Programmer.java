package class_design.inheritance.hidden_methods;

public class Programmer extends Writer
{
   public static void write(){ System.out.println("Writing code"); }

   public static void main(String... args)
   {
      Writer.write();
      Author.write();
      Programmer.write();
      
      Writer w = new Programmer();
      // Who determines here(reference type or object type) which implementation
      // of the hidden method write() is executed
      w.write();  
   }
}
