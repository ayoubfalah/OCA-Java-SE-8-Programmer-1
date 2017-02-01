package methods_encapsulation.overloading;

public class BytePrinter
{
    public void print(byte b)
    {
        System.out.println("byte");
    }

    public void print(Byte b)
    {
        System.out.print("Byte");
    }
    
    public void print(int i)
    {
        System.out.print("int");
    }
   
    public static void main(String... args)
    {
        BytePrinter printer = new BytePrinter();
        short x = 10;
        byte y = 12;
        printer.print(x);
        printer.print(y);
    }
}