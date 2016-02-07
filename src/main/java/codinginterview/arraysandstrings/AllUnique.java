package codinginterview.arraysandstrings;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.CheckedInputStream;

/**
 *Implement an algorithm to determine if a string has all unique characters. What if you
 can not use additional data structures?
 */
public class AllUnique {

    /*
     * Use a set to keep track of each characters
     */
    public boolean isAllUnique(String input){

        if ( input == null || input.isEmpty())
            return false;

        if (input.length() == 1)
            return true;

        if (input.length() ==2 )
            return input.charAt(0) != input.charAt(1);

        Set<Character> characterSet = new HashSet<Character>();
        for (char c: input.toCharArray()){
            if (characterSet.contains(c))
                return false;
            characterSet.add(c);
        }

        return true;
    }

    /*
     * Hare and Tortoise Logic.
     * It cannot be used. :P
     */
    public boolean isAllUniqueWithoutAdditionDS(String input){
        return false;
    }
}
