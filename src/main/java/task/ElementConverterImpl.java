package task;

import java.math.BigInteger;

public class ElementConverterImpl implements ElementConverter {

    public static final BigInteger BASE = BigInteger.valueOf(26);

    @Override
    public String convert(BigInteger i) {
        StringBuffer stringBuffer = new StringBuffer();
        BigInteger num = i.subtract(BigInteger.ONE);
        int digitNumber = 0;
        do {
            digitNumber++;
            int digit = num.remainder(BASE).intValue();
            if(digitNumber == 1) {
                stringBuffer.append((char) ('A' + digit));
            }else {
                stringBuffer.append((char) ('A' + digit-1));
            }
            num = num.divide(BASE);
        }
        while (!num.equals(BigInteger.ZERO)) ;
        return stringBuffer.reverse().toString();
    }
}
