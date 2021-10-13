package task;

import java.math.BigInteger;

public class ResultConverterImpl implements ResultConverter {
    @Override
    public String toResult(BigInteger source, String result){
        return source.toString()+":"+result;
    }
}
