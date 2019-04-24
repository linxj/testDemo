import com.ethan.DemoV1Impl;
import com.ethan.IDemo;
import org.junit.Test;

import java.util.List;

/**
 * @author: linxiaojie
 * @create: 2019-04-24
 **/
public class DemoV1ImplTest {

    @Test
    public void testGetCheatList() {
        IDemo demoV1 = new DemoV1Impl();

        List<String> result = demoV1.getCheatList(100);

        assert result != null;

        assert result.size() == 100;

        assert result.get(11).equals("Fizz");

        assert result.get(14).equals("FizzBuzz");

        assert result.get(24).equals("Buzz");

        assert result.get(97).equals("98");
    }
}