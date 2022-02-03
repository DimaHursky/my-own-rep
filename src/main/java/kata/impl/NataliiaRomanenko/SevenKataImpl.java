package kata.impl.NataliiaRomanenko;

import kata.SevenKata;

public class SevenKataImpl implements SevenKata {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;

        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }

        double lastDonat = navg * (arr.length + 1) - sum;
        if (lastDonat < 0) {
            throw new IllegalArgumentException();
        }

        return (long) Math.ceil(lastDonat);
    }

    @Override
    public String seriesSum(int n) {
        double res = 0.0;

        for (double i = 0; i < n; i++) {
            res += 1 / (1 + (i * 3));
        }
        return String.format("%.2f", res);
    }
}
