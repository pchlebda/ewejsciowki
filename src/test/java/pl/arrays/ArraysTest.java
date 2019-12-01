package pl.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraysTest {

    private Arrays testee;

    @BeforeEach
    void beforeEach() {
        testee = new Arrays();
    }

    @Test
    void shouldCalculate() {
        //given
        int[] expected = {24, 72, 12, 18};
        int[] input = {3, 1, 6, 4};

        //when
        int[] actual = testee.product(input);

        //then
        Assertions.assertArrayEquals(expected, actual);
    }
}