package kata.impl.AnastasiaZadolinna;

import kata.EightKata;

public class EightKataImpl implements EightKata {

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {

        return length * width * height;
    }

    @Override
    public int liters(double time) {

        int result = (int) Math.floor(time * 0.5);

        return result;

    }

    @Override
    public float mpgToKPM(float mpg) {

        float oneImperialGallonInLitres = 4.54609188f; // litres
        float oneMileInKilometres = 1.609344f; // kilometers

        float result = (mpg * oneMileInKilometres) / oneImperialGallonInLitres;

        return (float) Math.round(result * 100) / 100;

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

        if (input.length == 0 || input == null) {

            int[] EmptyArray = {};

            return EmptyArray;
        }

        int countPositives = 0;
        int sumNegatives = 0;

        for (int i = 0; i < input.length; i++) {

            if (input[i] > 0) {

                countPositives++;

            } else if (input[i] < 0) {

                sumNegatives += input[i];

            }

        }

        int[] returnValues = new int[]{countPositives, sumNegatives};
        return returnValues;

    }

    @Override
    public int stringToNumber(String str) {

        int numberFromString = Integer.parseInt(str);

        return numberFromString;

    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {

        return (double) Math.round(number * 100) / 100;

    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        int count = 0;

        for (int number : numbers) {

            if (number % divider == 0) {

                count++;

            }
        }

        int[] arr = new int[count];
        int i = 0;

        for (int number : numbers) {

            if (number % divider == 0) {

                arr[i] = number;
                i++;

            }
        }

        return arr;

    }
}



