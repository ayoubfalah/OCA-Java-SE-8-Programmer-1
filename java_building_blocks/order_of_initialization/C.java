package java_building_blocks.order_of_initialization;

public class C
{
  String seq = "c";
  {seq += "g"; }
  public C()
  {
    this("abc");
    seq+= "y";
  }
  public C(String c){ seq += "e";}
  {seq += "z"; }
  public static void main(String... args)
  {
    C c = new C();
    System.out.println(c.seq);
  }
}
