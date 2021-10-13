package task;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

class ElementConverterTest {

    @Test
    void shouldDoRightElementConversion(){
        ElementConverter converter = new ElementConverterImpl();
        assertThat(converter.convert(BigInteger.valueOf(1)))
                .isEqualTo("A");
        assertThat(converter.convert(BigInteger.valueOf(2)))
                .isEqualTo("B");
        assertThat(converter.convert(BigInteger.valueOf(26)))
                .isEqualTo("Z");
        assertThat(converter.convert(BigInteger.valueOf(29)))
                .isEqualTo("AC");
        assertThat(converter.convert(BigInteger.valueOf(5000)))
                .isEqualTo("GJH");
        assertThat(converter.convert(BigInteger.valueOf(18279)))
                .isEqualTo("AAAA");
    }

}
