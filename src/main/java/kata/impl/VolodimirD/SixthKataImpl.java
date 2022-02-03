package kata.impl.VolodimirD;

import kata.SixthKata;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixthKataImpl implements SixthKata {

    @Override
    public String balance(String book) {
        book = book.replaceAll("[^0-9A-z\\.\n ]", "");
        book = book.replaceAll("  ", " ");
        book = book.replaceAll(" \n", "\n");
        book = book.replaceAll(" ?;\n", "\n");
        book = book.trim();

        String arr[] = book.split("\n");
        double bal = Double.parseDouble(arr[0]);
        double totalExpense = 0;
        for (int i = 1; i < arr.length; i++) {
            totalExpense += Double.parseDouble(arr[i].split(" ")[2]);
            bal -= Double.parseDouble(arr[i].split(" ")[2]);
            arr[i] += " Balance " + String.format("%.2f", bal);
        }
        String newBook = "Original Balance: ";
        for (int i = 0; i < arr.length; i++) {
            newBook = newBook + arr[i] + "\r\n";
        }
        newBook = newBook + "Total expense  " + String.format("%.2f", totalExpense) + "\r\n";
        newBook = newBook + "Average expense  " + String.format("%.2f", totalExpense / (arr.length - 1));
        newBook = newBook.replaceAll(",",".");
        return newBook;
    }

    @Override
    public long findNb(long m) {
        long res = 0;
        long sum = 0;

        while (sum < m) {
            res++;
            sum += res * res * res;
        }

        if (sum == m) {
            return res;
        } else {
            return -1;
        }
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
