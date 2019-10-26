package genericscollections;
import java.lang.*;
import java.io.*;
import java.util.*;
public class ReverseString {
    // Java program to Reverse a String  by
// converting string to characters  one
// by one
    // convert String to character array
    // by using toCharArray
        public static void main(String[] args) {
            String input = "Abdullah";
            char[] try1 = input.toCharArray();
            for (int i = try1.length-1; i>=0; i--)
                System.out.print(try1[i]);
        }

}
