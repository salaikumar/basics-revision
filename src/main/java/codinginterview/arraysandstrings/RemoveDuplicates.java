package codinginterview.arraysandstrings;

/**
 * Remove Duplicates
 * Design an algorithm and write code to remove the duplicate characters in a string
 without using any additional buffer. NOTE: One or two additional variables are fine.
 An extra copy of the array is not.
 FOLLOW UP
 Write the test cases for this method.
 */

/*
* Since no Additional Large memory is used, There is no other way for this
* Compare each element with each other
* n * n
 */
public class RemoveDuplicates {

    public  static char[] removeDuplicates(char[] str){
        if (str == null)
            return str;

        int len = str.length;

        if( len < 2 ) return str;

        int tail = 1;

        for(int i=1; i < len; ++i){
            int j;
            for( j = 0; j < tail; ++j){
                if (str[i] == str[j])
                    break;
            }

            if (j == tail){
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;
        return  str;
    }

    public static char[] myApproach(char[] str){
        int length = str.length;
        if( str == null || length < 2)
            return str;
        for (int i = 0; i < length-1; ++i){
            if(str[i] == '\0')
                break;
            for (int j = i+1; j < length; ++j){
                   if (str[i] == str[j]){
                       // <-----
                       for(int x=j; x < length-1; ++x){
                           str[x] = str[x+1];
                       }
                       str[length-1] = '\0';
                       length--;
                       --j; // in order to perform continous duplicate check
                   }
            }
        }
        return str;
    }
}
