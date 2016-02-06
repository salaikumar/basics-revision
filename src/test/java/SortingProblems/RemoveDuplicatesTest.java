package SortingProblems;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Unit Tests
 */
public class RemoveDuplicatesTest {

    @Test
    public void shouldTestRemoveDuplicates(){
        RemoveDuplicates rm = new RemoveDuplicates();
        assertThat(rm.removeDuplicateLetters("aaa"),is("a"));
        assertThat(rm.removeDuplicateLetters(""),is(""));
        assertThat(rm.removeDuplicateLetters("salaikumar"),is("aiklmrsu"));
        assertThat(rm.removeDuplicateLetters("x"),is("x"));

    }
}