package kata.impl.AnastasiaZadolinna;

import kata.SixthKata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixthKataImpl implements SixthKata {

    @Override
    public long findNb(long m) {

        long result = 0;

        long sum = 0;

        while (sum < m) {

            result++;

            sum += result * result * result;

        }

        return sum == m ? result : -1;

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

            resulting = resulting.replaceAll("\\s{2,}", " ");

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

        return x / (1 + Math.sqrt(1 - x));

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

    @Override
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

        String returnString = "";

        if (lstOfArt.length != 0 && lstOf1stLetter.length != 0) {

            for (int i = 0; i < lstOf1stLetter.length; i++) {

                String currentLetter = lstOf1stLetter[i];

                int count = 0;

                for (int q = 0; q < lstOfArt.length; q++) {

                    String currentArt = lstOfArt[q];

                    if (currentArt.substring(0, 1).equals(currentLetter)) {

                        String[] artValues = currentArt.split(" ");

                        count += Integer.parseInt(artValues[1]);

                    }

                }

                String stockList = " ( " + currentLetter + " : " + count + " ) ";

                if (i != lstOf1stLetter.length - 1) {

                    returnString += stockList + " - ";

                } else {

                    returnString += stockList;

                }

            }

        }

        return returnString;

    }

}
