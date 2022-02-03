package kata.impl.VolodimirD;

import kata.FiveKata;

import java.math.BigInteger;
import java.util.Arrays;

public class FiveKataImpl implements FiveKata {

	@Override
	public int artificialRain(int[] v) {
		return 0;
	}

	@Override
	public double solve(double m) {
		return 0;
	}

	@Override
	public long[] smallest(long n) {
		return new long[0];
	}

	@Override
	public long[] gap(int g, long m, long n) {
		long[] primes = generator(m, n);
		for (int i = 0; i < primes.length - 1; i++) {
			if (primes[i] >= m && primes[i] == primes[i + 1] - g) {
				return Arrays.copyOfRange(primes, i, i + 2);
			}
		}
		return null;
	}

	private static long[] generator(long m, long n) {
		long[] primes = new long[(int) (n - m)];
		int numPrimes = 0;
		boolean prime = true;
		for (int i = (int) m; i < (int) n; i++) {
			prime = true;
			for (int j = 2; j < Math.sqrt((double) i) + 1; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime == true) {
				primes[numPrimes] = (long) i;
				numPrimes++;
			}
		}
		return Arrays.copyOfRange(primes, 0, numPrimes);
	}

	@Override
	public int zeros(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BigInteger perimeter(BigInteger n) {
		// TODO Auto-generated method stub
		return null;
	}

}