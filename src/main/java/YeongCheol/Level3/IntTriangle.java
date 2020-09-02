package YeongCheol.Level3;

public class IntTriangle {
    public int solution(int[][] triangle) {
        int answer = 0;
        if(triangle.length == 1)
        {
            return triangle[0][0];
        }
        int[][] maxTriangle = new int[triangle.length][triangle.length];
        // 경로별 최댓값 구하기
        maxTriangle[0][0] = triangle[0][0];
        for(int i = 1; i < triangle.length; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if(j == 0)
                {
                    maxTriangle[i][j] = maxTriangle[i-1][j] + triangle[i][j];
                }
                else if(j == i)
                {
                    maxTriangle[i][j] = maxTriangle[i-1][j-1] + triangle[i][j];
                }
                else
                {
                    maxTriangle[i][j]
                            = Math.max(maxTriangle[i-1][j-1], maxTriangle[i-1][j])
                            + triangle[i][j];
                }
            }
        }
        // 마지막 층 최대값 구하기
        for(int i = 0; i < triangle.length; i++)
        {
            if(maxTriangle[triangle.length-1][i] > answer)
            {
                answer = maxTriangle[triangle.length-1][i];
            }
        }
        return answer;
    }
}
