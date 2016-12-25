package methods_encapsulation.varargs;

/**
 *
 * @author ayoubfalah
 */
public class Calculator 
{
    public Integer performOperation(OperationType type, Object... args){ return null;}
    
    // DOES NOT COMPILE
    //public Integer performOperation(Object... args, OperationType type){ return null;}

    private static class OperationType {

        public OperationType() {
        }
    }

}
