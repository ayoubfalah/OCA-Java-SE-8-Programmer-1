package handling_exceptions;

/**
 *
 * @author ayoubfalah
 */
public class RuntimeExcepionTests 
{
    public static char performOperation(String str) { return str.charAt(0); }
    
    public static void main(String[] args) 
    {
        // A NullPointerException is thrown by running the following code
        performOperation(null);
    }

}
