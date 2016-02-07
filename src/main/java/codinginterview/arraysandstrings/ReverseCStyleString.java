package codinginterview.arraysandstrings;

/**
 * Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
 five characters, including the null character.
 */
public class ReverseCStyleString {

    public String reverseString(String input){

        StringBuilder output = new StringBuilder();
        for (int i = input.length()-2; i >=0 ; --i){
            output.append(input.charAt(i));
        }
        output.append('\0');
        return  new String(output);
    }

    public String reverseInPlace(String input){

        char[] inputArray = input.toCharArray();

        for (int i = input.length()-2, j = 0; i>=0 && j<=input.length()-2; --i, ++j){
            Character temp = input.charAt(i);
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
        }

        return new String(inputArray);
    }
    
}

