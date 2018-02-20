import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

@Ignore public class SubtractionTest {

    private Subtraction subtraction = new Subtraction();
    @Test
    public  void canaryTest(){
        Assert.assertTrue(true);
    }
    @Test
    public void testTheMainMethod(){
        String[] str={"12","13"};
    }
   @Ignore @Test
    public  void testTheSubWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals(subtraction.sub(20,10),10);

    }
    @Test
    public void testTheSubWithTwoFloat(){
        Assert.assertEquals(10.1,subtraction.subf(20.2f,10.1f),.05f);
    }

    @Test
    public void testTheSubWithTwoInteger(){
        Assert.assertEquals(subtraction.sub_wrapper(Integer.valueOf(25),Integer.valueOf(15)),Integer.valueOf(10));
    }
}