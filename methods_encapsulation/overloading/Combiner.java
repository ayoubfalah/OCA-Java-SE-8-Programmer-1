package methods_encapsulation.overloading;

/**
 *
 * @author ayoubfalah
 */
public class Combiner 
{
    public int combine(int... ints)
    {
        return ints.length;
    }
    
    // DOES NOT COMPILE: the method combine(int...) is already defined
    //private Object combine(int... ints){ return null; }
    
    
    public static double combine(double... ints) { return 0; }
    
    // DOES NOT COMPILE: the method combine(int...) is already defined
    //public static int combine(int... int2s){ return 0; }
    
    // DOES NOT COMPILE: the method combine(int...) is already defined
    //private double combine(int... ints){ return 0; }

}
