package kata;

public interface EightKata {

  /** for Volume of a Cuboid task
   * @param length of cuboid
   * @param width of cuboid
   * @param height of cuboid
   * @return volume of cuboid
   */
    double getVolumeOfCuboid(final double length, final double width, final double height);

    /** for Keep Hydrated! task
     * @param time when Nathan drinks water
     * @return the number of litres Nathan will drink
     */
    int liters(double time);

    /** for Miles per gallon to kilometers per liter task
     * @param mpg miles per gallon
     * @return miles per gallon to kilometers
     */
    float mpgToKPM(final float mpg);

    /** for To square(root) or not to square(root) task
     * @param array of integer numbers
     * @return an integer square root if the number has it, otherwise square the number.
     */
    int[] squareOrSquareRoot(int[] array);

    /** for Count of positives / sum of negatives task
     * @param input array of positives and negatives numbers
     * @return count of positives / sum of negatives task
     */
    int[] countPositivesSumNegatives(int[] input);

    /** for Convert a String to a Number! task
     * @param str given string
     * @return converted string to a number
     */
    int stringToNumber(String str);

    /** for Wilson primes task
     * @param n given number
     * @return true if the given number is Wilson prime
     */
    boolean amIWilson(double n);

    /** for Formatting decimal places task
     * @param number given double numbers
     * @return formated numbers that are rounded to to decimal places
     */
    double twoDecimalPlaces(double number);

    /**
     * for Find numbers which are divisible by given number task
     * @param numbers array of integer numbers
     * @param divider the number to be divided
     * @return numbers which are divisible by given divider
     */
    int[] divisibleBy(int[] numbers, int divider);

}
