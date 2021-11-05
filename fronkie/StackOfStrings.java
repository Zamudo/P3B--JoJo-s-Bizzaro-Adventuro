import java.util.Iterator;

/**
 * StackOfStrings.
 * 
 * @author Chan 
 */
public class StackOfStrings implements Iterable<String>
{
    private Node first;
    
    private class Node {
        private String item;
        private Node next;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void push(String item) {
        Node second = first;
        first = new Node();
        first.item = item;
        first.next = second;
    }
    
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
    
    public String peek() {
        return first.item;
    }
    
    
    // To make this data structure work with for-each loops
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<String> {

        private Node n = first;

        public boolean hasNext() {
            return n != null;
        }

        public String next() {
            String item = n.item;
            n = n.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
   }
}
