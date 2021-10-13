package task;

import org.junit.jupiter.api.Test;


import java.math.BigInteger;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {
    @Test
    void shouldDoConversion(){
        //given
        Converter converter = new Converter(new ElementConverterImpl(),new ResultConverterImpl());
        //and
        List<String> source = List.of("1","2","26","27","150","18279");
        //when
        var actual = converter.convert(source);
        //then
        assertThat(actual)
                .containsExactly("1:A","2:B","26:Z","27:AA","150:ET","18279:AAAA");

    }
}
