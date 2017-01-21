package handling_exceptions;

import java.io.IOException;

public class ExceptionType
{
   public static void main(String... args)
   {
      boolean result = isCheckedException(new IOException());
      writeResult(result);
   }

   private static void writeResult(boolean result)
   {
       String message = result? "a checked exception" : "an unchecked exception";
       StringBuilder sb = new StringBuilder();
       sb.append("The class ");
       sb.append(IOException.class.getName());
       sb.append(" is ");
       sb.append(message);
      System.out.println(sb);
   }

   private static boolean isCheckedException(Throwable e)
   {
         return (e instanceof Exception) && 
         !(e instanceof RuntimeException);
   }
}
