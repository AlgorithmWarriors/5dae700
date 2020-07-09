package YeongCheol.Level2;

import java.util.ArrayList;

public class ColoringBook {
    int width;
    int height;
    int[][] m_picture;
    boolean[][] hasArea;
    ArrayList<Integer> area;
    int currentArea;

    public int[] solution(int m, int n, int[][] picture) {
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        width = m;
        height = n;
        m_picture = picture;
        hasArea = new boolean[m][n];
        area = new ArrayList<Integer>();
        currentArea = 0;

        for(int r = 0; r < width; r++)
        {
            for (int c = 0; c < height; c++)
            {
                currentArea = 0;
                Find(r, c, m_picture[r][c]);
                if(currentArea > 0)
                    area.add(currentArea);
            }
        }

        if(area.size() > 0)
        {
            maxSizeOfOneArea = area.get(0);
        }
        for(int elem : area)
        {
            if(maxSizeOfOneArea < elem)
                maxSizeOfOneArea = elem;
        }

        answer[0] = area.size();
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private void Find(int r, int c, int myColor)
    {
        if(r < 0 || width <= r || c < 0 || height <= c || hasArea[r][c] || m_picture[r][c] == 0 || m_picture[r][c] != myColor)
        {
            return;
        }
        currentArea++;
        hasArea[r][c] = true;
        Find(r+1, c, myColor);
        Find(r, c+1, myColor);
        Find(r-1, c, myColor);
        Find(r, c-1, myColor);
    }
}
