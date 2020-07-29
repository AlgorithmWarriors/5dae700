package YeongCheol.Level1;

import java.util.ArrayList;

public class FailureRate {
    class FailureRatePair implements Comparable<FailureRatePair>{
        Integer key;
        Float value;

        public FailureRatePair(Integer key, Float value)
        {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(FailureRatePair o) {
            if(this.value < o.value)
            {
                return 1;
            }
            else if(this.value > o.value)
            {
                return -1;
            }
            else
            {
                if(this.key < o.key) return -1;
                else if(this.key > o.key) return 1;
                return 0;
            }
        }

        public Integer GetKey()
        {
            return key;
        }

        public Integer GetValue()
        {
            return key;
        }
    }

    ArrayList<FailureRatePair> failureRate;
    int[] totalChallengerList;
    int[] currentChallengerList;

    public int[] solution(int N, int[] stages) {
        // 초기화
        int[] answer = {};
        failureRate = new ArrayList<FailureRatePair>();
        totalChallengerList = new int[N];
        currentChallengerList = new int[N];

        // 스테이지 도전자 / 총 도전자 구하기
        for(int challenger : stages)
        {
            if(challenger > N)
            {
                for(int i = 0; i < totalChallengerList.length; i++)
                {
                    totalChallengerList[i]++;
                }
            }
            else
            {
                for(int i = 0; i < challenger; i++)
                {
                    totalChallengerList[i]++;
                }
                currentChallengerList[challenger-1]++;
            }
        }

        // 실패율 구하기
        for(int stage = 0; stage < N; stage++)
        {
            if(totalChallengerList[stage] != 0)
            {
                failureRate.add(new FailureRatePair(stage+1,
                        (float)currentChallengerList[stage] / (float)totalChallengerList[stage]));
            }
            else
            {
                failureRate.add(new FailureRatePair(stage+1,
                        -1f));
            }
        }

        // 실패율에 따라 정렬
        failureRate.sort(FailureRatePair::compareTo);

        answer = new int[N];
        for(int stage = 0; stage < N; stage++)
            answer[stage] = failureRate.get(stage).GetKey();

        return answer;
    }
}
