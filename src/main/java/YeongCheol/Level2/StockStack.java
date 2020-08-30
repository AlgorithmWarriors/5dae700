package YeongCheol.Level2;

import java.util.Stack;

public class StockStack {
    public class Pair
    {
        public int key;
        public int value;

        public Pair(int key, int value)
        {
            this.key = key;
            this.value = value;
        }
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Pair> pairStack = new Stack<>();
        int idx;
        for(idx = 0; idx < prices.length; idx++)
        {
            while(!pairStack.isEmpty() && pairStack.peek().value > prices[idx])
            {
                Pair tmp = pairStack.pop();
                answer[tmp.key] = idx - tmp.key;
            }
            pairStack.push(new Pair(idx, prices[idx]));
        }
        idx = prices.length - 1;
        // 끝날 때 스택에 남아있는 값 처리
        while(!pairStack.isEmpty())
        {
            Pair tmp = pairStack.pop();
            answer[tmp.key] = idx - tmp.key;
        }
        return answer;
    }
}
