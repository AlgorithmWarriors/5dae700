package Chunghee.Level2;

import java.util.Stack;

public class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);
        answer[0]=0;
        for(int i=1; i<prices.length;i++){
            answer[i]=i;
            if(prices[myStack.peek()]<=prices[i]){
                myStack.push(i);
            }
            else {
                while (prices[myStack.peek()]>prices[i]) {
                    answer[myStack.peek()] = i - answer[myStack.peek()];
                    myStack.pop();
                    if(myStack.isEmpty())break;
                }
                myStack.push(i);
            }
        }

        while (!myStack.isEmpty()){
            answer[myStack.peek()]=prices.length-1-answer[myStack.pop()];
        }
        answer[prices.length-1]=0;

        return answer;
    }
}
