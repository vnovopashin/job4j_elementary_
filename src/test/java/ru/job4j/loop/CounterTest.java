package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0ToFinish0Then0() {
        int start = 0;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1ToFinish3Then6() {
        int start = 1;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0ToFinish5Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus1ToFinish0ThenMinus1() {
        int start = -1;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart5ToFinish0Then0() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
