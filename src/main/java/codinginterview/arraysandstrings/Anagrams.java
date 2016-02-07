package codinginterview.arraysandstrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.CheckedInputStream;

/**
 * Write a method to decide if two strings are anagrams or not.
 */
public class Anagrams {


    /*
     * Use Sorting and compare
     */
    public static boolean checkAnagrams(String one, String two){

        if (one == null && two == null)
            return true;
        if(one.length() != two.length())
            return false;

        char[] oneCharArray = one.toCharArray();
        char[] twoCharArray = two.toCharArray();
        Arrays.sort(oneCharArray);
        Arrays.sort(twoCharArray);
        return Arrays.equals(oneCharArray,twoCharArray);
    }

    /*
     * without sorting
     * Using SET
     */
    public static boolean checkAnagramsWoSorting(String one, String two){
        if (one == null && two == null)
            return true;
        if(one.length() != two.length())
            return false;
        Set<Character> letters = new HashSet<Character>();
        for ( char c: one.toCharArray())
            letters.add(c);
        for (char c: two.toCharArray()){
            if (!letters.contains(c))
                return false;
        }
        return true;
    }

}
