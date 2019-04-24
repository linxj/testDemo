import com.ethan.Utils;
import org.junit.Test;

/**
 * @author: linxiaojie
 * @create: 2019-04-24
 **/
public class UtilTest {

    @Test
    public void testContainsDigit() {

        assert Utils.containsDigit(10, 2) == false;

        assert Utils.containsDigit(14, 4) == true;

        assert Utils.containsDigit(25, 5) == true;
    }
}