package class_design.casting_objects;

interface WaterFowl {}
class Bird {}
public class Duck extends Bird implements WaterFowl
{
  public void quack(){ System.out.println("quack!");}
  public static void main(String... args)
  {
     Object object = (Object)new Bird();
     Duck duck = (Duck)object;
     duck.quack();
  }
}
