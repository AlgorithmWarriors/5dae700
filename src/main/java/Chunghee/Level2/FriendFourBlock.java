package Chunghee.Level2;

import java.util.Arrays;

public class FriendFourBlock {
    static char[][] myboard;
    static boolean[][] visited;
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        int beforeNumber = 0;
        myboard = new char[m][n];
        visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            myboard[i]=board[i].toCharArray();
        }
        for(int i=0;i<visited.length;i++) {
            Arrays.fill(visited[i], false);
        }
        while (true){
            beforeNumber = answer;
            for(int i=0;i<m-1;i++){
                for(int j=0;j<n-1;j++){
                    pang(i,j);
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(visited[i][j]){
                        myboard[i][j]='0';
                        visited[i][j]=false;
                        answer++;
                    }
                }
            }
            DropBlock();
            if(beforeNumber==answer) break;
        }
        return answer;
    }

    private void pang(int i,int j) {
        if(myboard[i][j]=='0')return;
        if(visited[i][j]==true)return;
        if(i+1<myboard.length&&j+1<myboard[0].length){
            if(isaPang(i, j)) {
                pang(i + 1, j + 1);
                pang(i , j + 1);
                pang(i + 1, j );
                changeVisted(i, j);
            }
        }
    }

    private void changeVisted(int i, int j) {
        visited[i][j] = true;
        visited[i+1][j] = true;
        visited[i][j+1] = true;
        visited[i+1][j+1] = true;
    }

    private boolean isaPang(int i, int j) {
        return myboard[i][j]==myboard[i+1][j]&&myboard[i][j+1]==myboard[i+1][j+1]
                &&myboard[i+1][j+1]==myboard[i][j];
    }
    public void DropBlock(){
        for(int j=0;j<myboard[0].length;j++){
            for(int i=0;i<myboard.length;i++){
                if(myboard[i][j]=='0'){
                    for(int k=i;k>=0;k--){
                        if(k==0) myboard[0][j]='0';
                        else myboard[k][j]=myboard[k-1][j];
                    }
                }
            }
        }
    }
}
