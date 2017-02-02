package operators_statements;

public class Switcher
{
   public static void main(String... args)
   {
      String year = "Senior";
      switch(year)
      {
          case "Freshman": default: case "Sophomore":
          case "Junior": System.out.print("See you next year"); break;
          case "X": System.out.print("Congratulations");
      }
   }
}
