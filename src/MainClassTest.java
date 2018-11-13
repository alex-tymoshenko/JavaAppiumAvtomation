import org.junit.Assert;
import org.junit.Test;


public class MainClassTest {

    @Test
    public void testGetLocalNumber() {

        int numberBeingChecked = MainClass.getLocalNumber();

        Assert.assertTrue("getLocalNumber method does not return 14", numberBeingChecked == 14);
    }
}
