package tests;
import myMethods.ProblemSolving;
import org.junit.Assert;
import org.junit.Test;
public class TestMyMethods {
    ProblemSolving obj = new ProblemSolving();
    int [] arr = {5,2,7,4,1,3,6,8,9,11};
    @Test
    public void testFindMissingNum(){
        int actualResult = obj.findMissingNumber(arr);
        Assert.assertEquals("Test was failed ",10,actualResult);
        Assert.assertTrue(actualResult == 10);
        Assert.assertFalse(actualResult != 10);
    }
    @Test
    public void testFindChar(){
        int actualResult = obj.findNumberOfChars("Hello hello hello","l");
        Assert.assertEquals(6,actualResult);
        Assert.assertTrue(actualResult == 6);
    }
    @Test
    public void testCharUpperCase(){
        String actualResult = obj.convertCharsToUppercase("hello hello","l");
        Assert.assertEquals("heLLo heLLo",actualResult);
        Assert.assertTrue(actualResult.equals("heLLo heLLo"));
    }
    @Test
    public void testFindMax(){
        int actualResult = obj.findMax(arr);
        Assert.assertEquals(11,actualResult);
    }
}
