package Chunghee.Level2;

import java.util.Arrays;

public class BiggistSquare {
    public int solution(int [][]board)
    {
        int answer = 0;

        for(int y=1;y<board.length;y++){
            for(int x=1;x<board[y].length;x++){
                if(board[y][x]==1) {
                    board[y][x] = Math.min(Math.min(board[y - 1][x - 1], board[y][x - 1]), board[y - 1][x]) + 1;
                }
            }
        }
        for(int y=0;y<board.length;y++){
            for(int x=0;x<board[y].length;x++){
                    answer = Math.max(board[y][x], answer);
            }
        }
        return answer*answer;
    }
}
