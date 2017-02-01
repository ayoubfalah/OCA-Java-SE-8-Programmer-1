package inheritance.object_type_and_reference_type;

public class SuperString implements StringInterface 
{
   public String toString()
   {
      return "Super String";
   }
   
   public Object toString(String str)
   {
      return "Super " + str;
   }
}
