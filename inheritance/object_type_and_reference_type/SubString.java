package inheritance.object_type_and_reference_type;

public class SubString extends SuperString
{
   public String toString()
   {
      return "Sub String";
   }

   public static void main(String... args)
   {
     Object str1 = new SuperString();
     System.out.println(str1);

     SuperString str2 = new SuperString();
     System.out.println(str2);

     StringInterface str3 = new SuperString();
     System.out.println(str3);
   }
}
