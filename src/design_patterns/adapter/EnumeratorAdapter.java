package design_patterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorAdapter implements Enumeration<Object> {
    private Iterator<?> iterator;

    // Dependency Injection
    public EnumeratorAdapter(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
