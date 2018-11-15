import org.junit.Assert;
import org.junit.Test;


public class MainClassTest {

    @Test
    public void  testGetClassString() {

        MainClass mainClass = new MainClass();

        String testedClassString = mainClass.getClassString();

        Assert.assertTrue("field classString does not contain words: Hello or hello", testedClassString.contains("Hello") | testedClassString.contains("hello"));
    }
}
