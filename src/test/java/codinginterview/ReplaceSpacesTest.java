package codinginterview;

import codinginterview.arraysandstrings.ReplaceSpaces;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit Tests for Replace Spaces
 */
public class ReplaceSpacesTest {

    @Test
    public  void shouldTestReplaceSpaces(){
        char[] output = new char[12];
        output[0] = 'i';
        output[1] = '%';
        output[2] = '2';
        output[3] = '0';
        output[4] = 'i';
        output[5] = 'n';
        output[6] = 'd';
        output[7] = 'i';
        output[8] = 'a';
        output[9] = '%';
        output[10] = '2';
        output[11] = '0';

        assertThat(ReplaceSpaces.replaceSpaces("i india ".toCharArray()),is(output));
    }



}