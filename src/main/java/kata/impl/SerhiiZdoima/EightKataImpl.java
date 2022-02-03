package kata.impl.SerhiiZdoima;

public class EightKataImpl implements kata.EightKata {

    @Override
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * height * width;
    }

    @Override
    public int liters(double time) {

        double result = time / 2;
        int convertedtoint = (int) Math.floor(result);
        return convertedtoint;
    }

    @Override
    public float mpgToKPM(final float mpg) {

        final float l = 4.54609188f;
        final float k = 1.609344f;
        float rez = mpg * k / l;
        String rezult = String.format("%.2f", rez);
        rezult = rezult.replace(',', '.');
        return Float.parseFloat(rezult);
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
        int possitivecount = 0;
        int negativesum = 0;
        for (int a : input) {
            if (a < 0) {
                negativesum += a;

            } else if (a > 0) {
                possitivecount++;
            }
        }
        int nums[] = new int[2];
        nums[0] = possitivecount;
        nums[1] = negativesum;
        return nums;
    }

    @Override
    public int  stringToNumber(String str) {
        int i = Integer.parseInt(str);
        return i;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        number = Math.round(number * 100);
        number = number / 100;
        return number;
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
     public boolean amIWilson(double n) {
        return false;
    }
}