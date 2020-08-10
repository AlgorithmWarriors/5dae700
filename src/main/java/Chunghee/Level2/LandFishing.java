package Chunghee.Level2;

public class LandFishing {
    int solution(int[][] land) {
        int answer = 0;
        int Max =0;
        for(int i=1;i<land.length;i++){
            for(int j=0;j<land[i].length;j++)
                land[i][j]=BeforeMax(land[i-1],j) + land[i][j];
        }
        for(int i=0;i<land[0].length;i++){
            answer = Math.max(land[land.length-1][i],answer);
        }
        return answer;
    }

    private int BeforeMax(int[] land, int j) {
        int Max =0;
        for(int i=0; i<land.length;i++){
            if(i!=j) Max = Math.max(Max,land[i]);
        }
        return Max;
    }
}
