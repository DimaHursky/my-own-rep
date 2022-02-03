package kata.impl.VolodimirD;

import kata.SevenKata;

public class SevenKataImpl implements SevenKata {

	@Override
	public long newAvg(double[] arr, double navg) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		if ((sum / arr.length) >= navg) {
			throw new IllegalArgumentException();
		} else {

			Double temp =  Math.ceil(((arr.length + 1) * navg) - sum);
			long res = temp.longValue();
			
			return res;
		}
	}

	@Override
	public String seriesSum(int n) {		
		double res = 0.0;

		for (double i = 0; i < n; i++) {
			res += 1 / (1 + (i * 3));
		}

		String result = String.format("%.2f", res);

		return result;
	}

	public int whereIsHe(int p, int bef, int aft) {
		// TODO Auto-generated method stub
		return 0;
	}

}
