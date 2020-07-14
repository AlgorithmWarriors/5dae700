package Chunghee.backjoon.Graph;

public class FloydWarshall {
    public static int cityCount;
    public static int[][] distance;
    public static final int INF = 1000000000;

    public int[][] solution(int busCount,int cityCount, int [][]route) {

        this.cityCount=cityCount;
        int BusCount = busCount;
        distance = new int[cityCount][cityCount];
        for(int i=0; i < cityCount; i++) {
            for(int j=0; j < cityCount; j++) {
                if(i == j) continue;
                distance[i][j] = INF;
            }
        }
        while(busCount-- > 0) {
            int start = route[busCount][0];
            int end = route[busCount][1];
            int time = route[busCount][2];;

            distance[start-1][end-1] = Math.min(distance[start-1][end-1], time);
        }
        floydWarshall();
        return distance;
    }

    public static void floydWarshall() {
        for(int k = 0; k < cityCount; k++)
            for(int i=0; i < cityCount; i++) {
                for(int j=0; j < cityCount; j++) {
                    distance[i][j] = Math.min(distance[i][k] + distance[k][j], distance[i][j]);
                }
            }
    }
}


