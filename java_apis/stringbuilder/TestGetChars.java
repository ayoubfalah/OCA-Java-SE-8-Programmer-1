package java_apis.stringbuilder;

public class TestGetChars 
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("data");
        char[] dst = new char[sb.length()];
        sb.getChars(0, sb.length(), dst, 0);
        System.out.println(dst);
    }
}
