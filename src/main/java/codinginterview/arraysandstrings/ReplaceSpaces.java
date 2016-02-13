package codinginterview.arraysandstrings;

/**
 * Write a method to replace all spaces in a string with ‘%20’.
 */

public class ReplaceSpaces {
    public static char[] replaceSpaces(char[] str){
        if (str == null)
            return str;
        StringBuilder output = new StringBuilder();
        for ( char c : str){
            if ( c == ' '){
                output.append("%20");
            }
            else {
                output.append(c);
            }
        }
        return output.toString().toCharArray();
    }
}
