package java_building_blocks.garbage_collection;

import java.util.Date;

public class ShowDate
{
    public static void main(String... args)
    {
        Date a = new Date();
        Date b = new Date();
        Date c = a;
        System.out.println(c.toString());
        a = null;
        System.out.println(c.toString());
        c = null;
    }
}
