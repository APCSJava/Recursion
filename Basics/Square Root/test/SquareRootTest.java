import org.junit.Assert;
import org.junit.Test;

public class SquareRootTest {
  @Test
  public void testSolution1() {
    double result = SquareRoot.root(9.0, 4.5);
    Assert.assertEquals(Math.sqrt(9.0), result,.00001);
  }
  @Test
  public void testSolution2() {
    double result = SquareRoot.root(4.0, 3);
    Assert.assertEquals(Math.sqrt(4.0), result,.00001);
  }

}