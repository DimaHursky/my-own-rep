package kata.impl.YuriyShymkov;

import kata.EightKata;

import java.util.ArrayList;

public class EightKataImpl implements EightKata {

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return (length * width * height);
    }

    @Override
    public int liters(double time) {

        double LTRS_PR_HR = 0.5;
        return (int) (time * LTRS_PR_HR);
    }

    @Override
    public float mpgToKPM(float mpg) {

        float Gallon = 4.54609188f;
        float Mile = 1.609344f;
        float result = (mpg * Mile) / Gallon;
        return (float) Math.round(result * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (sqrt % 1 == 0) {
                result[i] = (int) sqrt;
            } else {
                result[i] = array[i] * array[i];
            }
        }
        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0)
            return new int[]{};
        int negatives = 0;
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                count += 1;
            } else {
                negatives += input[i];
            }
        }
        int[] result = new int[]{count, negatives};
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        String formatted = String.format("%.2f", number);
        double result = Double.parseDouble(formatted);
        return result;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> Array = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0)
            {
                Array.add(numbers[i]);
            }
        }

        int[] result = new int[Array.size()];

        for (int i = 0; i < result.length; i++)

            result[i] = Array.get(i);

        return result;
    }
}
