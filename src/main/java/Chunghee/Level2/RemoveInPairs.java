package Chunghee.Level2;

import java.util.Stack;

public class RemoveInPairs {
    public int solution(String s)
    {
        char[] myString = s.toCharArray();
        if(s.length()/2*2==s.length())return 0;
        Stack<Character> myStack = new Stack<>();
        myStack.push(myString[0]);
        for(int i=1; i<myString.length;i++){
            if(myStack.isEmpty())myStack.push(myString[i]);
            else if(myStack.peek()==myString[i])myStack.pop();
            else myStack.push(myString[i]);
        }
        if(myStack.isEmpty())return 1;
        else return 0;
    }
}
