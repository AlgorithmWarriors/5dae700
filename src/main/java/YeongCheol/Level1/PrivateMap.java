package YeongCheol.Level1;

public class PrivateMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] fullMap = new int[n];
        for(int i = 0; i < n; i++)
        {
            fullMap[i] = arr1[i] | arr2[i];
            int tester = 1 << (n-1);
            answer[i] = new String("");
            for(int j = 0; j < n; j++)
            {
                int bit = fullMap[i] & tester;
                if(bit >= 1)
                {
                    answer[i] += "#";
                }
                else
                {
                    answer[i] += " ";
                }
                tester >>= 1;
            }
        }
        return answer;
    }
}
