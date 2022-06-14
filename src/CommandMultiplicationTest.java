import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommandMultiplicationTest {
    @Test
    void nullStringAndMapTest()
    {
        Multiplication multiplicationCommand = new Multiplication();
        ArrayList<Double> stack = new ArrayList<>();
        stack.add(2.0);
        stack.add(3.0);
        multiplicationCommand.execute(null, stack, null);
        Assertions.assertEquals(stack.get(stack.size() - 1), 6);
    }

    @Test
    void threeSizeStackTest()
    {
        Multiplication multiplicationCommand = new Multiplication();
        ArrayList<Double> stack = new ArrayList<>();
        stack.add(2.0);
        stack.add(3.0);
        stack.add(4.0);
        multiplicationCommand.execute(new String[]{"*"}, stack, null);
        Assertions.assertEquals(stack.get(stack.size() - 1), 12);
    }

    @Test
    void notEmptyMapTest()
    {
        Multiplication multiplicationCommand = new Multiplication();
        ArrayList<Double> stack = new ArrayList<>();
        stack.add(2.0);
        stack.add(3.0);
        stack.add(4.0);
        Map<String, Double> map = new HashMap<>();
        map.put("a", 4.0);
        multiplicationCommand.execute(new String[]{"*"}, stack, map);
        Assertions.assertEquals(stack.get(stack.size() - 1), 12);
    }
}
