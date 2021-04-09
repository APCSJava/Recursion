public class FuelForFuel {

    /**
     * Calculates the fuel needed to launch a rocket of the given mass.
     * @param mass rocket payload >= 0
     * @return amount of fuel to launch mass + fuel
     */
    public static int calculateFuel(int mass) {
        int fuel = mass / 3 - 2;
        if (fuel <= 0) return 0;
        else return fuel + calculateFuel(fuel);

    }


}