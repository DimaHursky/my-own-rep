package kata.impl.SerhiiZdoima;

import kata.FiveKata;

import java.math.BigInteger;

public class FiveKataImpl implements FiveKata {

    @Override
    public int artificialRain(final int[] v){return 0;}

    @Override
    public long[] gap(int g, long m, long n){return null;}

    public int zeros(int n){
        {
            int count = 0;
            for (int a = 5; n / a >= 1; a *= 5)
                count += n / a;
            return count;
        }
    }


   @Override
    public BigInteger perimeter(BigInteger n){
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger fourth = BigInteger.ONE;
        BigInteger sum = BigInteger.ONE;
        for(BigInteger i=new BigInteger("0");i.compareTo(n)<0;i=i.add(BigInteger.ONE)){
            sum =sum.add(second);
            fourth=new BigInteger(first.toString());
            first=new BigInteger(second.toString());
            second=first.add(fourth);
        }
        return sum.multiply( new BigInteger("4"));
    }

    public double solve(double m){return 0;}

    public long[] smallest(long n){return null;}
}

