package SortingProblems;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Solution to Leet code Problem statements
 * Given a string which contains only lowercase letters,
 * remove duplicate letters so that every letter appear once and only once.

    Example:
    Given "bcabc"
    Return "abc"

    Given "cbacdcbc"
    Return "abcd"
 */
public class RemoveDuplicates {

    public String removeDuplicateLetters(String s) {
        if (s == null)
            return s;
        if (s.length() == 1)
            return s;

        SortedSet<Character> set = new TreeSet<Character>();
        for(int i=0; i < s.length();++i)
            set.add(s.charAt(i));

        StringBuilder output = new StringBuilder();
        for ( char c : set){
            output.append(c);
        }

        return new String(output);
    }
}
