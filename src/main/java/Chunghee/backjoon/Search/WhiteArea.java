package Chunghee.backjoon.Search;

public class WhiteArea {
    public Integer solution(String chessboard[][]) {
        int answer =0;
        int spare=0;
        for(int i=0;i<8;i++) {
            if (i == i / 2 * 2) spare = 0;
            else spare = 1;
            for (int j = 0 + spare; j < 8; j += 2) {
                if (chessboard[i][j] == "F") answer++;
            }
        }
        return answer;
    }
}
