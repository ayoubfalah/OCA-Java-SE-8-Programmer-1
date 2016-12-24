package java_apis.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ayoubfalah
 */
public class Predicates 
{
    /**
     * Remove every object, obj, from coll for which pred.test(obj) is true
     * @param pred An interface that provides a boolean-valued function with 
     *             one parameter
     */
    public static <T> void remove(Collection<T> coll, Predicate<T> pred)
    {   Iterator<T> iter = coll.iterator();
        while (iter.hasNext()) 
        {   T elem = iter.next();
            if (pred.test(elem))
                iter.remove();            
        }        
    }
    
    /**
     * Remove every object, obj, from coll for which pred.test(obj) is false. 
     * That is, retain objects for which the predicate is true
     * @param pred An interface that provides a boolean-valued function with 
     *             one parameter 
     */
    public static <T> void retain(Collection<T> coll, Predicate<T> pred)
    {   Iterator<T> iter = coll.iterator();
        while (iter.hasNext())
        {   T elem = iter.next();
            if (!pred.test(elem))
                iter.remove();            
        }
    }
    
    /**
     * Return a List that contains all objects, obj, from the collection, coll,
     * such that pred.test(obj) is true
     * @param pred An interface that provides a boolean-valued function with 
     *             one parameter
     * @return  
     */
    public static <T> List<T> collect(Collection<T> coll, Predicate<T> pred)
    {
        ArrayList<T> result = new ArrayList();
        for (T elem : coll)
        {   if (pred.test(elem))
                result.add(elem);            
        }        
        return result;
    }
    
    /**
     * @param pred An interface that provides a boolean-valued function with 
     *             one parameter
     * @return Returns the index of the first element in list for which the 
     *         predicate is true, if any.
     *         If there is no such element, return -1.
     */
    public static <T> int find(ArrayList<T> list, Predicate<T> pred)
    {   int index = -1;
        for (int i = 0; i < list.size(); i++) 
        {   T elem = list.get(i);
            if (pred.test(elem))
            {   index = i;
                break;
            }         
        }
        return index;
    }
}