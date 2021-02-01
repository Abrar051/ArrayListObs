package generic;
import java.util.*;
public class Container<T> {

    T value;
    public void show() {
        System.out.println(value.getClass().getName());
    }
    public void compare (T obj1 ,T obj2)
    {
        boolean f2;
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        f2=s1.equals(s2);
        if (f2==true)
        {
            System.out.println("Both strings are same");
        }
        else if (f2==false)
        {
            System.out.println("They are not equal");
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}
