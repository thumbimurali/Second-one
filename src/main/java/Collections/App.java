package Collections;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        List<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        Object[] objects = list.toArray();
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}

