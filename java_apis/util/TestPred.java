package java_apis.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author ayoubfalah
 */
public class TestPred 
{
    /**
     * An object of type Even tests an object of type Integer to see wether the
     * integer that it represents is an even number.
     * Precondition: The object to test must be non-null.
     */
    static class Even implements Predicate<Integer>
    {
        @Override
        public boolean test(Integer obj) 
        {
            boolean result = false;
            if (obj % 2 == 0)
                result = true;
            return result;
        }
    }
    /**
     * An object of type Big tests an object of type Integer to see wether the 
     * integer that it represents is a bigger than 100.
     * Precondition: The object to test must be non-null.
     */
    public class Big implements Predicate<Integer>
    {
        @Override
        public boolean test(Integer obj) 
        {
            boolean result = false;
            if (obj > 100) 
                result = true;
            return result;
        }        
    }
    
    static Collection<Integer> makeSet()
    {
        TreeSet<Integer> set = new TreeSet();
        set.add(32);
        set.add(17);
        set.add(142);
        set.add(56);
        set.add(1899);
        set.add(57);
        set.add(999);
        set.add(86);
        set.add(83);
        set.add(100);
        return set;
    }
    
    public static void main(String[] args) 
    {
        Collection<Integer> coll = makeSet();
        System.out.println("Initial collection: " + coll);
        
        Even pred = new Even();
        
        Predicates.remove(coll, pred);
        System.out.println("Remove evens: " + coll);
        
        coll = makeSet();
        Predicates.retain(coll, pred);
        System.out.println("Retain evens: " + coll);
        
        coll = makeSet();
        List<Integer> result = Predicates.collect(coll, pred);
        System.out.println("Collect evens: " + result);
        
        ArrayList<Integer> list = new ArrayList(coll);
        int index = Predicates.find(list, pred);
        System.out.println("Index of first even: " + index);        
    }
}
