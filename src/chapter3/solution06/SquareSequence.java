package chapter3.solution06;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger i = BigInteger.ZERO;

    @Override
    public BigInteger next() {
        i = i.add(BigInteger.ONE);
        return i.multiply(i);
    }
}
