package methods_encapsulation.designing_methods;

public class A
{
   private int i = 6;
   private int j = i;
   public void A(){ i = 5;}

   public static void main(String... args)
   {
       A a = new A();
       System.out.println(a.i + a.j);
   }
}
