package java_apis.arraylist;

import java.util.List;
import java.util.ArrayList;

public class PredicateInArrayList
{
  public static void main(String... args)
  {
    List<String> bunnies = new ArrayList<String>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies);
    bunnies.removeIf(s -> s.charAt(0) != 'h');
    System.out.println(bunnies);    
  }
}
