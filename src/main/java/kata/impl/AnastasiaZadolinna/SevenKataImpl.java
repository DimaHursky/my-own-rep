package kata.impl.AnastasiaZadolinna;

import kata.SevenKata;

public class SevenKataImpl implements SevenKata {

    @Override
    public long newAvg(double[] arr, double navg) {

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        long expectedDonation = (long) Math.ceil((arr.length + 1) * navg - sum);

        if (expectedDonation <= 0) {

            throw new IllegalArgumentException();

        }

        return expectedDonation;

    }

    @Override
    public String seriesSum(int n) {

        double sumOfFollowingSeriesUptoNthTerm = 0.00;

        if (n == 0) {

            return String.valueOf(sumOfFollowingSeriesUptoNthTerm);

        } else {

            for (int i = 0; i < n; i++) {

                sumOfFollowingSeriesUptoNthTerm += Double.valueOf(1) / Double.valueOf(1 + i * 3);

            }

        }

        return String.format("%.2f", sumOfFollowingSeriesUptoNthTerm);

    }


}
