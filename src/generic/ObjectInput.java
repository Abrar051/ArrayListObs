package generic;
import java.util.*;
public class ObjectInput {
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        //System.out.println("");
        Object obj1,obj2;
        System.out.println("Input object1 :        ");
        obj1=input.next();
        System.out.println("Input object2 : ");
        obj2=input.next();
        Container obj = new Container();
        obj.compare(obj1,obj2);

    }
}
