package Chunghee.Level2;

import java.util.Arrays;

public class lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int peopleNum =people.length-1;

        Arrays.sort(people);
        for (int i= 0; i<=peopleNum;i++,answer++){
            while (peopleNum > i && people[i] + people[peopleNum--]>limit)
                answer++;
        }
        return answer;
    }
}
