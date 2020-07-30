package Chunghee.Level2;

import java.util.Arrays;

public class MoreHot {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        for(int i=0;i<scoville.length-1;i++){
            if(scoville[i]<K) {
                scoville[i + 1] = scoville[i] + scoville[i + 1] * 2;
                scoville[i]=-1;
                answer++;
            }
            Arrays.sort(scoville);
        }
        if(scoville[scoville.length-1]<K)return -1;
        return answer;
    }
}
