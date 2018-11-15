import org.junit.Assert;
import org.junit.Test;


public class MainClassTest {

    @Test
    public void testGetClassNumber() {

        MainClass mainClass = new MainClass();

        int testedClassNumber = mainClass.getClassNumber();

        Assert.assertTrue("classNumber is fewer than 45", testedClassNumber > 45);
    }
}
