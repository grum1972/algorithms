package ru.job4j.algos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RecursionTest {

    @Test
    void factorial() {
        Recursion rec = new Recursion();
        assertThat(rec.factorial(5)).isEqualTo(120);
        assertThat(rec.factorial(0)).isEqualTo(1);
        assertThat(rec.factorial(1)).isEqualTo(1);
    }

    @Test
    void gcd() {
        Recursion rec = new Recursion();
        assertThat(rec.gcd(2, 6)).isEqualTo(2);
        assertThat(rec.gcd(2, 1)).isEqualTo(1);
        assertThat(rec.gcd(3, 5)).isEqualTo(1);
        assertThat(rec.gcd(6, 4)).isEqualTo(2);
        assertThat(rec.gcd(3, 3)).isEqualTo(3);
    }

    @Test
    void pow() {
        Recursion rec = new Recursion();
        assertThat(rec.pow(2, 3)).isEqualTo(8);
        assertThat(rec.pow(2, 10)).isEqualTo(1024);
        assertThat(rec.pow(3, 3)).isEqualTo(27);
        assertThat(rec.pow(1, 4)).isEqualTo(1);

    }
}