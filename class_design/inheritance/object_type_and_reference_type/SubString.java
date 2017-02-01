package inheritance.object_type_and_reference_type;

public class SubString extends SuperString
{
   public String toString()
   {
      return "Sub String";
   }

   public String toString(String str)
   {
      return "Sub " + str;
   }

   public static void main(String... args)
   {
     Object str1 = new SuperString();
     System.out.println(str1);
     
     System.out.println(((Object) new SuperString()).toString());

     SuperString str2 = new SuperString();
     System.out.println(str2);

     StringInterface str3 = new SuperString();
     System.out.println(str3);
   }
}
