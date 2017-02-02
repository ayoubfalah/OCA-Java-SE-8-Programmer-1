package class_design.inheritance.fundamentals;

abstract class Otter
{
   protected abstract void eatFish(int count);
}

public class Subclass extends Otter
{
   protected void eatFish(){}
   public void eatFish(int count){}
}
