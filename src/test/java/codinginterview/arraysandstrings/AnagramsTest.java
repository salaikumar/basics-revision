package codinginterview.arraysandstrings;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Unit Test for Anagrams Check
 */
public class AnagramsTest {

    @Test
    public void shouldVerifyCheckAnagrams(){
        assertThat(Anagrams.checkAnagrams("salaikumar","kumarsalai"),is(true));
        assertThat(Anagrams.checkAnagrams("salaikumar","kumaralai"),is(false));
        assertThat(Anagrams.checkAnagrams("sample","amples"),is(true));
    }

    @Test
    public void shouldVerifyCheckAnagramsWOSorting(){
        assertThat(Anagrams.checkAnagrams("salaikumar","kumarsalai"),is(true));
        assertThat(Anagrams.checkAnagrams("salaikumar","kumaralai"),is(false));
        assertThat(Anagrams.checkAnagrams("sample","amples"),is(true));
        assertThat(Anagrams.checkAnagrams("aaa","aa\0"),is(false));
        assertThat(Anagrams.checkAnagrams("","\0"),is(false));
        assertThat(Anagrams.checkAnagrams("",""),is(true));
    }
}