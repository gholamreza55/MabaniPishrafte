package kata.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private stack stack;
    @BeforeEach
    public void init(){
        stack = new stack(5);
    }
    @Test
    void newly_stacks() {
        assertEquals(stack.getsize(), 0);
    }
    @Test
    void after_push_stack_size() {
        stack.push("A");
        assertEquals(stack.getsize(), 1);
    }

    @Test
    void after_push_stack_empty() {
        stack.push("a");
        stack.pop();
        assertEquals(stack.getsize(), 0);
    }

    @Test
    void when_push_limit_throw_stack_exception() {
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");
        stack.push("a");

        stack.push("a");

    }
}
