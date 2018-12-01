package Greedy;

import java.util.Stack;

public class Leetcode_921_Minimum_add_to_make_valid_paranthasis {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int counter = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == ')'){
                if(stack.isEmpty())
                    counter++;
                else
                    stack.pop();
            }else{
                stack.push(S.charAt(i));
            }
        }
        return counter + stack.size();
    }
}
