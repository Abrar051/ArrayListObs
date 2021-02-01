package generic;
import java.util.*;
public class Container<T> {


    public void compare (T obj1 ,T obj2)
    {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        if (s1.length()>s2.length())
        {
            System.out.println("Object 1 is greater than object 2");
        }
        else if (s1.length()<s2.length())
        {
            System.out.println("Object 1 is less than object 2 ");
        }
        else if (s1.length()==s2.length())
        {
            System.out.println("Both objects are equal");
        }
    }
}
