package Chunghee.backjoon.Search;

public class MovieDirectorShoum {
    public Integer solution(int SeriesNumber) {

        int answer  = 0;
        int count = SeriesNumber;
        while(count > 0) {
            answer++;
            if(String.valueOf(answer).contains("666")) {
                count--;
            }

        }
        return answer;
    }
}
