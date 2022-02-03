package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SixthKataImpl {

    private static Stream<Arguments> provideImpl() {
        return Stream.of(
                Arguments.of(new kata.impl.AnastasiaZadolinna.SixthKataImpl()),
                Arguments.of(new kata.impl.VolodimirD.SixthKataImpl()),
                Arguments.of(new kata.impl.YuriyShymkov.SixthKataImpl())
        );
    }

    private static Stream<Arguments> dataSourceForFindNb() {
        return Stream.of(
                Arguments.of(2022, 4183059834009L),
                Arguments.of(-1, 24723578342962L),
                Arguments.of(4824, 135440716410000L),
                Arguments.of(3568, 40539911473216L)
        );
    }

    @ParameterizedTest // by Volodimir
    @MethodSource("dataSourceForFindNb")
    public void findNbTestStreamVD(long exp, long argument) {
        long actual1 = new kata.impl.VolodimirD.SixthKataImpl().findNb(argument);
        assertEquals(exp, actual1, "Wrong result for parameter " + argument);

    }

    @ParameterizedTest // by Volodimir
    @MethodSource("provideImpl")
    public void findNbTestSol(SixthKata sixthKata) {
        long exp = 2022;
        long argument = 4183059834009L;

        long actual1 = sixthKata.findNb(argument);
        assertEquals(exp, actual1, "Wrong result for parameter " + argument);

    }

    @ParameterizedTest // by Volodimir
    @MethodSource("provideImpl")
    public void balanceTestImpls(SixthKata sixthKata) {
        String b1 = "1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10";
        String b1sol = "Original Balance: 1000.00\r\n125 Market 125.45 Balance 874.55\r\n126 Hardware 34.95 Balance 839.60\r\n127 Video 7.45 Balance 832.15\r\n128 Book 14.32 Balance 817.83\r\n129 Gasoline 16.10 Balance 801.73\r\nTotal expense  198.27\r\nAverage expense  39.65";

        String b2 = "1233.00\n125 Hardware;! 24.80?\n123 Flowers 93.50;\n127 Meat 120.90\n120 Picture 34.00\n124 Gasoline 11.00\n" +
                "123 Photos;! 71.40?\n122 Picture 93.50\n132 Tyres;! 19.00,?;\n129 Stamps; 13.60\n129 Fruits{} 17.60\n129 Market;! 128.00?\n121 Gasoline;! 13.60?";
        String b2sol = "Original Balance: 1233.00\r\n125 Hardware 24.80 Balance 1208.20\r\n123 Flowers 93.50 Balance 1114.70\r\n127 Meat 120.90 Balance 993.80\r\n120 Picture 34.00 Balance 959.80\r\n124 Gasoline 11.00 Balance 948.80\r\n123 Photos 71.40 Balance 877.40\r\n122 Picture 93.50 Balance 783.90\r\n132 Tyres 19.00 Balance 764.90\r\n129 Stamps 13.60 Balance 751.30\r\n129 Fruits 17.60 Balance 733.70\r\n129 Market 128.00 Balance 605.70\r\n121 Gasoline 13.60 Balance 592.10\r\nTotal expense  640.90\r\nAverage expense  53.41";


        String ans1 = sixthKata.balance(b1);
        assertEquals(b1sol, ans1);

        String ans2 = sixthKata.balance(b2);
        assertEquals(b2sol, ans2);




    }



}
