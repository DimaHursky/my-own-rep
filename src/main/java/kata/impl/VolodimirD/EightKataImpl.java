package kata.impl.VolodimirD;

import java.util.ArrayList;
import java.util.Arrays;

import kata.EightKata;

public class EightKataImpl implements EightKata {

	static double LPH = 0.5; // For KeepHydrated (Liters per Hour)

	static double KmToMile = 1.609344;
	static double LiterToGalon = 4.54609188; // For mpgToKPM (Km -> Mile Liter -> Galon)
	
	static ArrayList<Double> WilsonNumbers = new ArrayList<>(Arrays.asList(3.0, 5.0, 563.0)); // WilsonNumbers

	@Override
	public double getVolumeOfCuboid(double length, double width, double height) {
		return length * width * height;
	}

	@Override
	public int liters(double time) {
		return (int) (time * LPH);

	}

	@Override
	public float mpgToKPM(float mpg) {

		String TempVal = String.format("%.2f", (mpg * KmToMile) / (LiterToGalon));

		float result = Float.parseFloat(TempVal);

		return result;
	}

	@Override
	public int[] squareOrSquareRoot(int[] array) {
		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {

			if (Math.sqrt(array[i]) % 1 == 0) {
				result[i] = (int) Math.sqrt(array[i]);
			} else {
				result[i] = array[i] * array[i];
			}

		}

		return result;
	}

	@Override
	public int[] countPositivesSumNegatives(int[] input) {
		int CounterPoss = 0;
		int SummNeg = 0;

		for (int i = 0; i < input.length; i++) {

			if (input[i] > 0) {
				CounterPoss++;
			} else {
				SummNeg += input[i];
			}

		}

		int[] result = new int[] { CounterPoss, SummNeg };

		return result;
	}

	@Override
	public int stringToNumber(String str) {
		return Integer.parseInt(str);
	}

	@Override
	public boolean amIWilson(double n) {
		return WilsonNumbers.contains(n);
	}

	@Override
	public double twoDecimalPlaces(double number) {
		return (double) Math.round(number * 100) / 100;
	}

	@Override
	public int[] divisibleBy(int[] numbers, int divider) {
		ArrayList<Integer> TempArray = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				TempArray.add(numbers[i]);
			}
		}

		int[] result = new int[TempArray.size()];

		for (int i = 0; i < result.length; i++)
			result[i] = TempArray.get(i);

		return result;
	}

}
