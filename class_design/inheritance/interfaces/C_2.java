package class_design.inheritance.interfaces;

public class C_2 extends C_1 {

    public static void main(String... args) 
    {
        C_1 c1 = new C_2();
        for (int x = 0; x <= 10; x++) {
            System.out.format("%d^2 = %d\n", x, c1.f(x));
        }
    }
}
