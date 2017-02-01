package class_design.casting_objects;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayoubfalah
 */
public class Test 
{
    public static void main(String[] args) 
    {
        List arrayList = new ArrayList();
        AbstractList list = (AbstractList)arrayList;
        System.out.println(list);        
    }
}