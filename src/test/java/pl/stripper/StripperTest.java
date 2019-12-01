package pl.stripper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StripperTest {

    private Stripper testee;

    @BeforeEach
    void beforeEach(){
        testee = new Stripper();
    }

    @Test
    void shouldStripHtmlTextFromTags(){
        //given
        String expected = "\n  Hello World!\n" +
                "  This is test\n";

        String input = "<div>\n" +
                "  <p>Hello</p> <span>World!</span>\n" +
                "  <b>This is test</b>\n" +
                "</div>";

        //when
        String actual = testee.stripHtmlTags(input);

        //then
        Assertions.assertEquals(expected,actual);
    }
}