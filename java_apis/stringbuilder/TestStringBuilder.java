package java_apis.stringbuilder;

/**
 *
 * @author ayoubfalah
 */
public class TestStringBuilder 
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("DataDataDataDataData");
        sb.delete(0, sb.length());
        System.out.println(sb.capacity() == sb.length());
    }
}