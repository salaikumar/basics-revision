package leetcode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit Test Cases
 */
public class ValidParanthesisTest {

    @org.junit.Test
    public void shouldTestIsValid(){
        ValidParanthesis vp = new ValidParanthesis();
        assertThat(vp.isValid(""),is(false));
        assertThat(vp.isValid("}}"),is(false));
        assertThat(vp.isValid("}{"),is(false));
        assertThat(vp.isValid("}"),is(false));
        assertThat(vp.isValid("{{}}"),is(true));
        assertThat(vp.isValid("{{}"),is(false));
        assertThat(vp.isValid("([)]"),is(false));
        assertThat(vp.isValid("([])]"),is(false));
        assertThat(vp.isValid("([])"),is(true));
    }
}