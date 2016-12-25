package methods_encapsulation.overloading;

/**
 *
 * @author ayoubfalah
 */
public class TestCombiner 
{
    public static void main(String... args)
    {
        Combiner combiner = new Combiner();
        System.out.println(combiner.combine(new int[]{1}));
        System.out.println(combiner.combine(1));
    }
}