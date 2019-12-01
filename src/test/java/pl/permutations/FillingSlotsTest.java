package pl.permutations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class FillingSlotsTest {

    private FillingSlots testee;

    @BeforeEach
    void beforeEach() {
        testee = new FillingSlots();
    }

    @Test
    void shouldFoundAll4Permutations() {
        //given
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 1, 1),
                Arrays.asList(1, 1, 1, 2), Arrays.asList(1, 1, 2, 2),
                Arrays.asList(1, 2, 2, 2), Arrays.asList(2, 2, 2, 2));

        Set<Integer> input = new LinkedHashSet<Integer>(Arrays.asList(1, 2));

        //when
        List<List<Integer>> actual = testee.permutationsOfFilledSlots(input, 4);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFoundAll3Permutations() {
        //given
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 1),
                Arrays.asList(1, 1, 2), Arrays.asList(1, 1, 3),
                Arrays.asList(1, 2, 2), Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 3), Arrays.asList(2, 2, 2),
                Arrays.asList(2, 2, 3), Arrays.asList(2, 3, 3),
                Arrays.asList(3, 3, 3));

        Set<Integer> input = new LinkedHashSet<Integer>(Arrays.asList(1, 2, 3));

        //when
        List<List<Integer>> actual = testee.permutationsOfFilledSlots(input, 3);

        //then
        Assertions.assertEquals(expected, actual);
    }
}