package kata;

import kata.impl.AnastasiaZadolinna.EightKataImpl;
import kata.impl.AnastasiaZadolinna.SixthKataImpl;
import kata.impl.DmytroHursrkyi.SevenKataImpl;
import kata.impl.DmytroHursrkyi.SixKataImpl;
import kata.impl.SerhiiZdoima.FiveKataImpl;
import kata.utils.ConsoleInput;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final String DATA_FOR_RAINFALL = "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5,Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9"
            + "\n"
            + "London:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0,Nov 59.0,Dec 52.9"
            + "\n"
            + "Paris:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3,Oct 63.3,Nov 83.2,Dec 154.7"
            + "\n"
            + "NY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3,Nov 107.8,Dec 94.2"
            + "\n"
            + "Vancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6,Oct 116.3,Nov 154.6,Dec 171.5"
            + "\n"
            + "Sydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3,Oct 82.6,Nov 81.4,Dec 78.2"
            + "\n"
            + "Bangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9,Oct 230.8,Nov 57.3,Dec 9.4"
            + "\n"
            + "Tokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4,Oct 194.1,Nov 95.6,Dec 54.4"
            + "\n"
            + "Beijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0,Nov 9.3,Dec 2.7"
            + "\n"
            + "Lima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";

    public static final String DATA_FOR_BALANCE = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10";

    public static void main(String[] args) {

        System.out.println("Choice kata:\n " + "1 - EightKata\n " + "2 - SevenKata\n " + "3 - SixthKata\n "
                + "4 - FiveKata\n " + "q - Exit");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                eightKataHandler();
                break;
            case "2":
                sevenKataHandler();
                break;
            case "3":
                sixthKataHandler();
                break;
            case "4":
                fiveKataHandler();
                break;
        }
    }

    private static void fiveKataHandler() {
        FiveKata fiveKata = new FiveKataImpl();
        System.out.println("Choice your method:\n " +
                "1 - to run artificialRain(int[]) method\n " +
                "2 - to run gap(int, long, long) method\n " +
                "3 - to run zeros(int) method\n " +
                "4 - to run perimeter(BigInteger) method\n " +
                "5 - to run solve(double) method\n " +
                "6 - to run smallest(long) method\n " +
                "or other symbol to exit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if ("2".equals(choice)) {
            int g = ConsoleInput.intInput("Input int value G - (integer >= 2) which indicates the gap we are looking for:");
            long m = ConsoleInput.longInput("Input long value M - which gives the start of the search (m inclusive):");
            long n = ConsoleInput.longInput("Input long value N (>= M) - which gives the end of the search (n inclusive) won't go beyond 1100000:");
            System.out.println("Result is : \n");
            long[] res = fiveKata.gap(g, m, n);
            for (long re : res) {
                System.out.println(re);
            }
        } else if ("4".equals(choice)) {
            BigInteger m = ConsoleInput.bigIntegerInput("Enter number");
            System.out.println("The result of execute of  perimeter method is: " + fiveKata.perimeter(m));
        } else if ("6".equals(choice)) {
            Long value = ConsoleInput.longInput("Input long value:");
            System.out.println("The result of execute of smallest method is: " + fiveKata.smallest(value));
        }
    }

    private static void sixthKataHandler() {
        SixthKata sixthKata = new SixthKataImpl();
        System.out.println("Choice your method:\n " +
                "1 - to run findNb(long) method\n " +
                "2 - to run balance(String) method\n " +
                "3 - to run f(double) method\n " +
                "4 - to run mean(String, String) method\n " +
                "5 - to run variance(String, String) method\n " +
                "6 - to run nbaCup(String, String) method\n " +
                "7 - to run stockSummary(String[], String[]) method\n " +
                "or other symbol to exit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if ("1".equals(choice)) {
        } else if ("2".equals(choice)) {
            System.out.println("Input check for balance: \n" + DATA_FOR_BALANCE);
            System.out.println("The result of execute of BALANCE method is: \n" + new SixthKataImpl().balance(DATA_FOR_BALANCE));
        } else if ("3".equals(choice)) {
            Double value = ConsoleInput.doubleInput("Input double value: ");
            System.out.println("The result of execute of f method is: " + sixthKata.f(value));
        } else if ("4".equals(choice)) {
            System.out.println("Enter the town for which you want to receive the average annual rainfall\n \n"
                    + DATA_FOR_RAINFALL);
            System.out.println("Enter the name of town");
            String town = String.valueOf(scanner.nextLine());
            System.out.println("The result of execute of Miles per gallon to kilometers per liter method is: "
                    + new SixKataImpl().variance(town, DATA_FOR_RAINFALL));
        }
    }

    private static void sevenKataHandler() {
        SevenKata sevenKata = new SevenKataImpl();
        System.out.println("Choice your method:\n " +
                "1 - to run newAvg(double[], double) method\n " +
                "2 - to run seriesSum(long) method\n " +
                "or other symbol to exit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if ("1".equals(choice)) {
            System.out.println("Input double values separated by comma:");
            String arr = scanner.nextLine();
            String[] convertedRankArray = arr.split("\\s*,\\s*");
            double[] doubleArr = new double[convertedRankArray.length];
            for (int i = 0; i < doubleArr.length; i++) {
                doubleArr[i] = Double.parseDouble(convertedRankArray[i]);
            }
            System.out.println("Input double value:");
            double value = scanner.nextDouble();
            System.out.println("The result of execute of newAvg method is: " + sevenKata.newAvg(doubleArr, value));
        } else if ("2".equals(choice)) {
            int i = ConsoleInput.intInput("Enter number");
            System.out.println("The result of execute of  method is: " + sevenKata.seriesSum(i));
        }
    }

    private static void eightKataHandler() {
        EightKata eightKata = new EightKataImpl();
        System.out.println("Enter your choice:\n " +
                "1 - to run getVolumeOfCuboid(double,double,double) method\n " +
                "2 - to run liters (double) method\n " +
                "3 - to run mpgToKPM(float) method\n " +
                "4 - to run squareOrSquareRoot(int[]) method\n " +
                "5 - to run countPositivesSumNegatives(int) method\n " +
                "6 - to run stringToNumber(String) method\n " +
                "7 - to run amIWilson(double) method\n " +
                "8 - to run twoDecimalPlaces(double) method\n " +
                "9 - to run divisibleBy(int[], int) method\n or other symbol to exit");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if ("1".equals(choice)) {
            Double length = ConsoleInput.doubleInput("Input double length");
            Double width = ConsoleInput.doubleInput("Input double width");
            Double height = ConsoleInput.doubleInput("Input double height");
            System.out.println("The result of execute of getVolumeOfCuboid method is: "
                    + eightKata.getVolumeOfCuboid(length, width, height));
        } else if ("2".equals(choice)) {
            double value = ConsoleInput.doubleInput("Input double number:");
            System.out.println("The result of execute of Liters method is: " + eightKata.liters(value));
        } else if ("6".equals(choice)) {
            System.out.println("Input number:");
            String number = scanner.nextLine();
            System.out.println("The result of execute of stringToNumber method is: " + eightKata.stringToNumber(number));
        } else if ("4".equals(choice)) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter count of elements");
            int arrayLenght = input.nextInt();
            int array[] = new int[arrayLenght];
            System.out.println("Enter the " + arrayLenght + "s numbers now splitted by new line ");
            for (int i = 0; i < arrayLenght; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("The result of method execution is " + Arrays.toString(eightKata.squareOrSquareRoot(array)));
        } else if ("5".equals(choice)) {
            int arrayLenght = ConsoleInput.intInput("Enter count of elements");
            Scanner input = new Scanner(System.in);
            int array[] = new int[arrayLenght];
            System.out.println("Enter the " + arrayLenght + "s numbers now splitted by new line ");
            for (int i = 0; i < arrayLenght; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("The result of method execution is " + Arrays.toString(eightKata.countPositivesSumNegatives(array)));
        } else if ("3".equals(choice)) {
            float mpg = ConsoleInput.floatInput("Enter the value for Miles per hours: ");
            System.out.println("The result of execute of Miles per gallon to kilometers per liter method is: "
                    + eightKata.mpgToKPM(mpg));
        } else if ("8".equals(choice)) {
            double val = ConsoleInput.doubleInput("Enter the double value ");
            System.out.println("formated numbers that are rounded to to decimal places: " + eightKata.twoDecimalPlaces(val));
        } else if ("9".equals(choice)) {
            int arrayNumbLenth = ConsoleInput.intInput("Enter the values of Numbers and Divisors\n How many Numbers do you want to divide?");
            Scanner input = new Scanner(System.in);
            int arrayNumb[] = new int[arrayNumbLenth];
            System.out.println("Enter the " + arrayNumbLenth + "s press the New Line button, to enter next number");
            for (int i = 0; i < arrayNumbLenth; i++) {
                arrayNumb[i] = input.nextInt();
            }
            System.out.println("Enter the value of the Divider");
            int divisors = scanner.nextInt();
            System.out.println(
                    "The result of method execution is " + Arrays.toString(eightKata.divisibleBy(arrayNumb, divisors)));
        }
    }
}