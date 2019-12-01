package pl.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Array2DTest {

    private Array2D testee;

    @BeforeEach
    void beforeEach() {
        testee = new Array2D();
    }

    @Test
    void shouldThrowExceptionWhenOutOfBound() {
        //given
        int[][] array = {{1}};

        //when + then
        ArrayIterator<Integer> iterator = testee.getIterator(array);
        IllegalStateException exception = Assertions.assertThrows(IllegalStateException.class, () -> {
            iterator.next();
            iterator.next();
        });

        Assertions.assertEquals("Iterator out of bounds", exception.getMessage());
    }

    @Test
    void shouldIterateThrough2DArray() {
        //given
        int[][] array = {{1}, {2, 3}, {}, {4}};

        //when + then
        ArrayIterator<Integer> iterator = testee.getIterator(array);

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(new Integer(1), iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals(new Integer(2), iterator.next());
        Assertions.assertEquals(new Integer(3), iterator.next());
        Assertions.assertEquals(new Integer(4), iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}