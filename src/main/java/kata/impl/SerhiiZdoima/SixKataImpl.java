package kata.impl.SerhiiZdoima;

import kata.SixthKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

  public class SixKataImpl implements SixthKata {
    @Override
    public long findNb(long m) {
        long result = 0;
        long sum =0;
        while (sum <m) {
            result++;
            sum += result*result*result;
        }
        return sum ==m?result:-1;
    }

    @Override
    public String balance(String book) {
        List<String> checkbook = new ArrayList<String>(Arrays.asList(book.replaceAll("(\\b\\D\\W)", " ").replace('=', ' ').replace(':', ' ').split("\\n")));
        double balance = Double.parseDouble(checkbook.get(0));
        String originalBalance = "Original Balance: " + checkbook.get(0).toString();
        checkbook.set(0, originalBalance);
        double totalexpense = 0;
        for (int i = 1; i < checkbook.size(); i++) {
            String line = checkbook.get(i);
            String[] priceArray = line.split(" ");
            String price = priceArray[priceArray.length - 1];
            double dprice = Double.parseDouble(price);
            totalexpense += dprice;
            balance = (balance - dprice);
            String bal = String.format("%.2f", balance);
            String resulting = line + " Balance " + bal;
            resulting=resulting.replaceAll("\\s{2,}"," ");
            checkbook.set(i, resulting);
        }
        String total = String.format("%.2f", totalexpense);
        checkbook.add("Total expense  " + total);
        String avg = String.format("%.2f", totalexpense / (checkbook.size() - 2));
        checkbook.add("Average expense  " + avg);
        String result = String.join("\n", checkbook);
        return result;
    }




    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
