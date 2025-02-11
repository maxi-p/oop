package design_patterns.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class AdapterTester {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        Enumeration<Object> enumerationAdapter = new EnumeratorAdapter(iterator);

        // Using the Enumeration Interface
        while (enumerationAdapter.hasMoreElements()) {
            System.out.println(enumerationAdapter.nextElement());
        }
    }
}
