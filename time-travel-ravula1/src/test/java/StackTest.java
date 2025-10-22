import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void testPushIncreasesSize() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        assertEquals(2, stack.size());
    }
}
