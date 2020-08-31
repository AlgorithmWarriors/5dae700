package YeongCheol.Level2;

import java.util.ArrayList;

public class ServiceDevelopement {
    public int[] solution(int[] progresses, int[] speeds) {
        int currentIndex = 0;
        int currentProgressDate = 0;
        ArrayList<Integer> answerList = new ArrayList<>();

        while(currentIndex != progresses.length)
        {
            int finishedNumber = 0;
            while(currentIndex != progresses.length
                    && progresses[currentIndex] + (speeds[currentIndex] * currentProgressDate) >= 100)
            {
                currentIndex++;
                finishedNumber++;
            }
            if(finishedNumber > 0)
            {
                answerList.add(finishedNumber);
            }
            currentProgressDate++;
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++)
        {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
