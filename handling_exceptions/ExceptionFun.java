package handling_exceptions;

public class ExceptionFun
{
   public ExceptionFun(Object obj)
   {
     if(obj == null)
        throw new IllegalArgumentException("Provide an object");
      System.out.println(obj + " created!");
    }

    public static void createObject()
    {
        try
        {
           ExceptionFun obj = new ExceptionFun(null);
        } finally
        {
          System.out.println("Was the object created?");
        }
    }

    public static void main(String... args)
    {
       createObject();
    }
}
