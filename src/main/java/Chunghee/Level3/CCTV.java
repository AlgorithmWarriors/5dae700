package Chunghee.Level3;

import java.util.Arrays;
import java.util.Comparator;

public class CCTV {
    public int solution(int[][] routes) {
        int answer = 0;
        int camera = -30001;
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for (int[] route : routes) {
            if (camera < route[0]) {
                camera = route[1];
                answer++;
            }
        }
        return answer;

    }
}
