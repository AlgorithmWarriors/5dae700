package YeongCheol.Level3;

public class IntTriangle {
    public int solution(int[][] triangle) {
        int answer = 0;
        if(triangle.length == 1)
        {
            return triangle[0][0];
        }
        // 경로별 최댓값 구하기
        for(int i = 1; i < triangle.length; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if(j == 0)
                {
                    triangle[i][j] = triangle[i-1][j] + triangle[i][j];
                }
                else if(j == i)
                {
                    triangle[i][j] = triangle[i-1][j-1] + triangle[i][j];
                }
                else
                {
                    triangle[i][j]
                            = Math.max(triangle[i-1][j-1], triangle[i-1][j])
                            + triangle[i][j];
                }
            }
        }
        // 마지막 층 최대값 구하기
        for(int i = 0; i < triangle.length; i++)
        {
            if(triangle[triangle.length-1][i] > answer)
            {
                answer = triangle[triangle.length-1][i];
            }
        }
        return answer;
    }
}
