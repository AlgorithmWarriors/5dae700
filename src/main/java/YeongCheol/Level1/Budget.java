package YeongCheol.Level1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int elem : d)
            if(budget >= elem)
            {
                budget -= elem;
                answer++;
            }
        return answer;
    }
}
