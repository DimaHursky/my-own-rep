package kata.impl.DmytroHursrkyi;

import kata.SixthKata;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public String balance(String book) {return "0";}


    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {

        Pattern pattern = Pattern.compile("\\w+");
        String[] array = strng.split("\n");
        for (String element : array) {
            Matcher matcher = pattern.matcher(element);
            while (matcher.find()) {
                if (matcher.group().equals(town)) {
                    Double[] values = parseLine(element);
                    double sum = 0;
                    for (double elem : values) {
                        sum += elem;
                    }
                    return sum / values.length;
                }
            }
        }
        throw new IllegalArgumentException(town + " does not contains in " + strng);
    }

    private static Double[] parseLine(String argument) {
        Pattern pattern = Pattern.compile("\\d+\\.\\d+");
        Matcher matcher = pattern.matcher(argument);
        List<Double> resultList = new ArrayList<>();
        while (matcher.find()) {
            resultList.add(Double.parseDouble(matcher.group()));
        }
        return resultList.toArray(new Double[0]);
    }

    public double variance(String town, String strng) {

        Pattern pattern = Pattern.compile("\\w+");
        String[] array = strng.split("\n");
        for (String element : array) {
            Matcher matcher = pattern.matcher(element);
            while (matcher.find()) {
                if (matcher.group().equals(town)) {
                    double avg = mean(town, strng);
                    Double[] values = parseLine(element);
                    double sum = 0;
                    for (double elem : values) {
                        sum += (elem - avg) * (elem - avg);
                    }
                    return sum / (values.length);
                }
            }
        }
        throw new IllegalArgumentException(town + " does not contains in " + strng);
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
