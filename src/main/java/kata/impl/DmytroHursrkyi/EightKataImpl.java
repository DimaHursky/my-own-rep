package kata.impl.DmytroHursrkyi;

import kata.EightKata;

public class EightKataImpl implements EightKata {

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public int liters(double time) {
        return (int) (time / 2);
    }

    @Override
    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float kpm = (mpg * mile) / gallon;
        return Math.round(kpm * 100) / 100f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sqrt = (int) Math.sqrt(array[i]);
            if (array[i] == sqrt * sqrt) {
                newArray[i] = sqrt;
            } else {
                newArray[i] = array[i] * array[i];
            }
        }
        return newArray;

    }
    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int res[] = {0, 0};

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0)
                res[1] = res[1] + input[i];
            else if (input[i] > 0)
                res[0]++;
        }
        return res;
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        String result = String.format("%.2f", number);
        return Double.parseDouble(result);
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
