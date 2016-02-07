package codinginterview.arraysandstrings;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.net.SocketTimeoutException;

/**
 * Testing Few concepts in JAVA
 * Swapping Objects in JAVA
 */
public class TestClass {

    public static void swapValues(int a, int b){
        int temp = a;
        a= b;
        b = temp;
    }

    public static void swapStringBuilder(StringBuilder a, StringBuilder b){
        StringBuilder temp = a;
        a = b;
        b = temp;
    }

    public static void modifyStringBuilder(StringBuilder a){
        a.append("Modified");
    }

    public static void swapValuesObject(Integer a, Integer b){
        Integer temp = a;
        a= b;
        b = temp;
    }

    public static void main(String[] args){
        int a = 5;
        int b = 1;
        System.out.println("Before: A= " + a +", B=" + b);
        swapValues(a,b);
        System.out.println("After : A= " + a +", B=" + b);

        Integer aa = 5, bb =1;
        System.out.println("Swapping Integer Objects");
        swapValuesObject(aa,bb);
        System.out.println("After : AA= " + aa +", BB=" + bb);

        StringBuilder a1 = new StringBuilder("Salai");
        StringBuilder b1 = new StringBuilder("Shilpa");
        System.out.println("Before: A1= " + a1 +", B1=" + b1);
        swapStringBuilder(a1,b1);
        System.out.println("After : A1= " + a1 +", B1=" + b1);

        StringBuilder sampleBuilder = new StringBuilder("Salai");
        modifyStringBuilder(sampleBuilder);
        System.out.println("Modified = " + sampleBuilder);
    }
}
