package kata.impl.NataliiaRomanenko;

import kata.EightKata;

public class EightKataImpl implements EightKata {

    @Override
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * height * width;
    }

    @Override
    public int liters(double time) {
        double result = time / 2;
        return (int) Math.floor(result);
    }

    @Override
    public float mpgToKPM(final float mpg) {
        final float KM_TO_MILE = 1.609344F;
        final float LITER_TO_GALON = 4.54609188F;
        float rez = mpg * KM_TO_MILE / LITER_TO_GALON;
        return Float.parseFloat(String.format("%.2f", rez).replace(',', '.'));
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
        int possitiveCount = 0;
        int negativeSum = 0;
        for (int element : input) {
            if (element < 0) {
                negativeSum += element;

            } else if (element > 0) {
                possitiveCount++;
            }
        }
        return new int[]{possitiveCount, negativeSum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public double twoDecimalPlaces(double number) {;
        return  Math.round(number * 100)/100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int c = 0;
        for (int number : numbers) {
            if (number % divider != 0) {
                continue;
            }
            c++;
        }
        int[] array = new int[c];
        int t = 0;
        for (int number : numbers) {
            if (number % divider == 0) {
                array[t] = number;
                t++;
            }
        }
        return array;
    }

    @Override
    //TODO implement this method
    public boolean amIWilson(double n) {
        return false;
    }

}