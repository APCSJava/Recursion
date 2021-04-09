import org.junit.Assert;
import org.junit.Test;

public class RecursiveFibonacciTest {
  @Test
  public void testFibonacciZero() {
    String s = "The Fibonacci of index 0 is defined to be 0.";
    Assert.assertEquals(s, 0, RecursiveFibonacci.fibonacci(0));
  }
  @Test
  public void testFibonacciOne() {
    String s = "The Fibonacci of index 1 is defined to be 1.";
    Assert.assertEquals(s, 1, RecursiveFibonacci.fibonacci(1));
  }
  @Test
  public void testFibonacciTwo() {
    String s = "The Fibonacci at index 2 should be 1.";
    Assert.assertEquals(s, 1, RecursiveFibonacci.fibonacci(2));
  }
  @Test
  public void testFibonacciFive() {
    String s = "The Fibonacci at index 5 should be 5.";
    Assert.assertEquals(s, 5, RecursiveFibonacci.fibonacci(5));
  }
  @Test
  public void testFibonacciTwelve() {
    String s = "The Fibonacci at index 12 should be 144.";
    Assert.assertEquals(s, 144, RecursiveFibonacci.fibonacci(12));
  }
  @Test
  public void testFibonacciFifteen() {
    String s = "The Fibonacci at index 15 should be 610.";
    Assert.assertEquals(s, 610, RecursiveFibonacci.fibonacci(15));
  }
  @Test
  public void testFibonacciTwentyEight() {
    String s = "The Fibonacci at index 28 should be 317,811.";
    Assert.assertEquals(s, 317_811, RecursiveFibonacci.fibonacci(28));
  }
}