package task;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Converter {

    private final ElementConverter elementConverter;
    private final ResultConverter resultConverter;

    public Converter(ElementConverter elementConverter,ResultConverter resultConverter){
        Objects.requireNonNull(elementConverter);
        Objects.requireNonNull(resultConverter);
        this.elementConverter=elementConverter;
        this.resultConverter = resultConverter;
    }

    public List<String> convert(List<String> source){
        Objects.requireNonNull(source);
        var bigIntegerSource = source.stream()
                .map(BigInteger::new)
                .collect(toList());
        return doConvert(bigIntegerSource);
    }

     private List<String> doConvert(List<BigInteger> source){
           return source.stream()
                    .map(s->resultConverter.toResult(s,elementConverter.convert(s)))
                    .collect(toList());
    }
}
