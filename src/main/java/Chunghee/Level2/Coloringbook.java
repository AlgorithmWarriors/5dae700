package Chunghee.Level2;

import java.util.Stack;

public class Coloringbook {
    Stack<Integer> IndexY = new Stack<>();
    Stack<Integer> IndexX = new Stack<>();

    public int[] solution(int m, int n, int[][] picture) {
        boolean[][] visited = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        int color=0;
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count = 0;
                if(picture[i][j]>0&&visited[i][j]==false) {
                    color = picture[i][j];
                    answer[0]++;
                    plus(j,i);
                }

                while(!IndexX.isEmpty()) {
                    int x = IndexX.pop();
                    int y = IndexY.pop();
                        //위 이동
                        if(y > 0 && picture[y - 1][x] == color&&visited[y-1][x]==false) {
                            visited[y-1][x] = true;
                            count = Move(count, y - 1, x);
                        }
                        // 좌측 이동
                        if(x > 0 && picture[y][x - 1] == color&&visited[y][x - 1] == false) {
                            visited[y][x-1] = true;
                            count = Move(count, y, x - 1);
                        }
                        // 아래 이동
                        if(y < m - 1 && picture[y + 1][x] == color && visited[y + 1][x] == false) {
                            visited[y+1][x] = true;
                            count = Move(count,y + 1, x);
                        }
                        // 우측 이동
                        if(x < n - 1 && picture[y][x + 1] == color && visited[y][x + 1] == false) {
                            visited[y][x+1] = true;
                            count = Move(count, y, x + 1);
                        }
                    }
                    answer[1] = Math.max(answer[1], count);
                }

        }


        return answer;
    }

    private int Move( int count, int y, int x) {
        plus(x, y);
        count++;
        return count;
    }

    private void plus(int x,int y) {
        IndexY.push(y);
        IndexX.push(x);
    }
}
