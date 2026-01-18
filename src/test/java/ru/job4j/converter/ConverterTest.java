package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class ConverterTest {

    @Test
    void rubleToEuro() {
        float input = 140;
        float expected = 2.3333f;
        float output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001f));
    }

    @Test
    void rubleToDollar() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.0001f));
    }
}
