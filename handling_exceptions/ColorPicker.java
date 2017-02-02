package handling_exceptions;


public class ColorPicker
{
  public void pickColor()
  {
    try
    {
       System.out.println("A");
       fail();
    }catch(NullPointerException e)
    {
       System.out.println("B");
    }finally{
       System.out.print("C");
    }
  }

  public void fail()
  {
     throw new ArithmeticException();
  }

  public static void main(String... args)
  {
     new ColorPicker().pickColor();
     System.out.print("D");
  }
}
