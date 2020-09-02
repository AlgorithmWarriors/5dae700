package YeongCheol.Level1;

import java.util.ArrayList;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] person1 = new int[]{1,2,3,4,5};
        int[] person2 = new int[]{2,1,2,3,2,4,2,5};
        int[] person3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int[] personsPassNum = new int[]{0,0,0};

        for(int i = 0; i < answers.length; i++)
        {
            if(person1[i % person1.length] == answers[i])
            {
                personsPassNum[0]++;
            }
            if(person2[i % person2.length] == answers[i])
            {
                personsPassNum[1]++;
            }
            if(person3[i % person3.length] == answers[i])
            {
                personsPassNum[2]++;
            }
        }

        ArrayList<Integer> answerList = new ArrayList<>();

        if(personsPassNum[0] >= personsPassNum[1] && personsPassNum[0] >= personsPassNum[2])
        {
            answerList.add(1);
        }
        if(personsPassNum[1] >= personsPassNum[0] && personsPassNum[1] >= personsPassNum[2])
        {
            answerList.add(2);
        }
        if(personsPassNum[2] >= personsPassNum[0] && personsPassNum[2] >= personsPassNum[1])
        {
            answerList.add(3);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++)
        {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
