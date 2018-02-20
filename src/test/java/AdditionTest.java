import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
    private Addition addition = new Addition();

    @Test
    public  void canaryTest(){
        Assert.assertTrue(true);
    }
    @Test
    public void testTheMainMethod(){
        String[] str={"12","13"};
    }
    @Test
    public  void testTheSumWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals(addition.sum(10,20),30);
        //Assert.assertEquals(addition.sum(10,20),30);
    }
    @Test
    public void testTheSumWithTwoFloat(){
        Assert.assertEquals(30.5,addition.sumf(10.2f,20.3f),.05f);
    }
    @Test
    public void testTheSumWithTwoInteger(){
        Assert.assertEquals(addition.sum_wrapper(Integer.valueOf(10),Integer.valueOf(25)),Integer.valueOf(35));
    }

}
