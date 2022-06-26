package kata.stack;
import java.util.LinkedList;
import java.util.List;
public class stack {
    private final List<String> elements;
    private int limit;

    public stack(int limit) {
        this.limit = limit;
        this.elements = new  LinkedList<String>();
    }

    public int getsize() {
        return elements.size();
    }

    public void push(String element) {
        if (elements.size() >= limit){
            throw new StackOverflowException("you pass the limit is ; " + limit);
        }
        elements.add(element);
    }

    public void pop() {
        elements.remove(elements.size() - 1);
    }
}
