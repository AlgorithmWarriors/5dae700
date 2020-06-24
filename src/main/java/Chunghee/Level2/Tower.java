package Chunghee.Level2;

import java.util.Stack;

public class Tower {
    public int[] solution(int[] heights) {
        Stack<Integer> myStack = new Stack<>();
        int[] answer = new int[heights.length];
        int maxIndex = 0;
        answer[0] = 0;
        myStack.push(0);
        for(int i =1; i<answer.length;i++){
            if(heights[myStack.peek()]<=heights[i]){
                while (!myStack.isEmpty()){
                    if(heights[myStack.peek()]>heights[i]){
                        answer[i]=myStack.peek()+1;
                        myStack.push(i);
                        break;
                    }
                    maxIndex = myStack.pop();
                    if(myStack.isEmpty()){
                        if(maxIndex>heights[i]){
                            answer[i]=myStack.peek()+1;
                            myStack.push(i);
                            break;
                        }
                    }
                }
                if(myStack.isEmpty()) {
                    myStack.push(i);
                    answer[i] = 0;
                }
            }
            else {
                answer[i]= myStack.peek()+1;
                myStack.push(i);
            }
        }
        return answer;
    }
}
