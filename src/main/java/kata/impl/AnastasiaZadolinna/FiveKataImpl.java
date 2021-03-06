package kata.impl.AnastasiaZadolinna;

import kata.FiveKata;

import java.math.BigInteger;

public class FiveKataImpl implements FiveKata {

    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {

        var num = 0;

        for(var i = 1; i <= n; i++) {

            var j = i;

            while(j % 5 == 0) {

                num = num + 1;

                j = j / 5;

            }

        }

        return num;

    }

    @Override
    public BigInteger perimeter(BigInteger n) {

        BigInteger a = BigInteger.ZERO;

        BigInteger b = BigInteger.ONE;

        BigInteger c = BigInteger.ONE;

        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {

            a = b;

            b = c;

            c = a.add(b);

            sum = sum.add(a);

        }

        return sum.multiply(BigInteger.valueOf(4));

    }

    @Override
    public double solve(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }

}
