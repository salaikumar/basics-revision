package codinginterview;

import codinginterview.arraysandstrings.ReverseCStyleString;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Reverse C style String
 */
public class ReverseCStyleStringTest {

    @Test
    public void shouldTestReverseString(){
        String input = "Salai\0";
        ReverseCStyleString rv = new ReverseCStyleString();
        assertThat(rv.reverseString(input),is("ialaS\0"));
    }

    @Test
    public void shouldTestReverseInplace(){
        String input = "Salai\0";
        ReverseCStyleString rv = new ReverseCStyleString();
        assertThat(rv.reverseString(input),is("ialaS\0"));
    }



}