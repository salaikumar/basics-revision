package codinginterview;

import codinginterview.arraysandstrings.RemoveDuplicates;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Unit Test for Removing Duplicates
 */
public class RemoveDuplicatesTest {

    @Test
    public void shouldTestRemoveduplicates(){
        RemoveDuplicates rm = new RemoveDuplicates();
        char[] input = new char[6];
        input[0] ='x';
        input[1] ='x';
        input[2] ='e';
        input[3] ='a';
        input[4] ='f';
        input[5] ='f';

        char[] output = new char[6];
        output[0] ='x';
        output[1] ='e';
        output[2] ='a';
        output[3] ='f';
        output[4] ='\0';
        output[5] ='\0';

        assertThat(RemoveDuplicates.myApproach(input),is(output));
    }
}