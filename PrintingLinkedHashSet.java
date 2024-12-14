import java.util.*;
class PrintingLinkedHashSet
{
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Rajesh");
        a.add("Students");
        for(String s:a)
        {
            System.out.print(s+" ");
        }
    } 
}