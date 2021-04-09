import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
  @Test
  public void testZeroFactorial() {
    String s = "Zero factorial should equal 1";
    Assert.assertEquals(s, 1, Factorial.factorial(0));
  }
  @Test
  public void testOneFactorial() {
    String s = "One factorial should equal 1";
    Assert.assertEquals(s, 1, Factorial.factorial(0));
  }
  @Test
  public void testTwoFactorial() {
    String s = "Two factorial should equal 2";
    Assert.assertEquals(s, 2, Factorial.factorial(2));
  }
  @Test
  public void testFiveFactorial() {
    String s = "Five factorial should equal 120";
    Assert.assertEquals(s, 120, Factorial.factorial(5));
  }
  @Test
  public void testTwelveFactorial() {
    String s = "Twelve factorial should equal 479,001,600";
    Assert.assertEquals(s, 479_001_600, Factorial.factorial(12));
  }
}