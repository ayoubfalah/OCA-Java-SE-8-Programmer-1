package class_design.inheritance.interfaces;

/**
 *
 * @author ayoubfalah
 */
public interface Interface 
{
    static final int CONSTANT = 2;
    public void abstractMethod();
    public default String methodWithDefaultImplementation(){ return "Hello!"; }
    public static String staticMethod(){ return "Static method!"; }
}
