//REVERSE A STRING USING STACK DATA STRUCTURE

import java.util.*;
public class delete {
    public static void main(String[] args) {
       Stack<Character> stack = new Stack<>();
        Scanner rd = new Scanner (System.in);
        String input = rd.next();
        String output = "";
        for(int i=0; i<input.length(); i++)
            stack.push(input.charAt(i));
        for(int i=0; i<input.length(); i++)
            output += stack.pop();
        System.out.print(output);
    }
}
