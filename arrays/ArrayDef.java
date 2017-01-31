package arrays;

import java.util.Arrays;

public class ArrayDef 
{
   public static void main(String... args)
   {
      String[] grades1 = new String[5];
      grades1[0] = "B";
      grades1[1] = "C";
      grades1[2] = "F";
      grades1[3] = "A";
      grades1[4] = "D";

      System.out.println(Arrays.toString(grades1));
      
      String[] grades2 = new String[]{"B", "C", "F", "A", "D"};
      System.out.println(Arrays.toString(grades2));
   
      String[] grades3;                                // Declaration
      grades3 = new String[]{"B", "C", "F", "A", "D"}; // Initialization
      System.out.println(Arrays.toString(grades3));

      // Anonymous Array: ONLY ALLOWED IN THE DECLARATION
      String[] grades4 = {"B", "C", "F", "A", "D"};
      System.out.println(Arrays.toString(grades4));
   }
}
