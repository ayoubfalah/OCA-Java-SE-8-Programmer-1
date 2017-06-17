package java_apis.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayoubfalah
 */
public class Converter 
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList();
        list.add("hawk");
        list.add("robin");
        
        // list.toArray() returns an array of type Object[]
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        
        // list.toArray(T[size]) returns an array of type T[]. 
        // If list.size() <= size, then the array T[] will be returned. Otherwise
        // a new array will be created and returned.
        String[] stringArray = list.toArray(new String[list.size()]);
        System.out.println(stringArray.length);
        
    }

}
