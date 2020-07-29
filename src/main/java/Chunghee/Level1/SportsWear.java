package Chunghee.Level1;

public class SportsWear {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student= new int[n+1];
        int answer = 0;
        for(int i=1; i<=n;i++){
            student[i]++;
        }
        for(int i=0;i<reserve.length;i++){
            student[reserve[i]]++;
        }
        for(int i=0;i<lost.length;i++){
            student[lost[i]]--;
        }
        for(int i=1; i<n;i++){
            if (student[i]==0) {
                if (student[i + 1] == 2 && i <= n - 1) {
                    student[i + 1]--;
                    student[i]++;
                } else if (student[i - 1] == 2 && i >= 2) {
                    student[i - 1]--;
                    student[i]++;
                }
            }
        }
        for(int i=1; i<=n;i++){
            if(student[i]>=1)answer++;
        }

        return answer;
    }
}
