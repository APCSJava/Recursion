import org.junit.Assert;
import org.junit.Test;

public class FuelForFuelTest {
    @Test
    public void fuelForTwenty() {
        String s = "A rocket of mass 20 requires 4 units of fuel.";
        Assert.assertEquals(s, 4, FuelForFuel.calculateFuel(20));
    }

    @Test
    public void fuelForOneHundred() {
        String s = "A rocket of mass 100 requires 39 units of fuel.";
        Assert.assertEquals(s, 39, FuelForFuel.calculateFuel(100));
    }

    @Test
    public void fuelForOneThousand() {
        String s = "A rocket of mass 1000 requires 483 units of fuel.";
        Assert.assertEquals(s, 483, FuelForFuel.calculateFuel(1000));
    }
}