package kata.impl.SerhiiZdoima;

import kata.SevenKata;

import java.util.stream.DoubleStream;

public class SevenKataImpl implements SevenKata {
    @Override
    public long newAvg(double[] arr, double navg) {
        if (arr[1] < 0)throw new IllegalArgumentException("some message");
        double ans = navg * (arr.length + 1) - DoubleStream.of(arr).sum();
        if (ans < 0) {
            throw new IllegalArgumentException();
        }
        return (long) (Math.ceil(ans));
    }


    @Override
    public String seriesSum(int n) {
        {
            Double sum = 0.00;
            if (n == 0) {
                return String.valueOf(sum);
            } else {
                for (Integer i = 0; i < n; i++) {
                    sum += Double.valueOf(1) / Double.valueOf(1 + i * 3);
                }
                return String.format("%.2f", sum);
            }
        }
    }
}

