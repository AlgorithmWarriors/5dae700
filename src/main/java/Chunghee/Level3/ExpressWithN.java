package Chunghee.Level3;

public class ExpressWithN {
    static int answer = -1;

    public int solution(int N, int number) {
        MakeDictionnary(N,number,0,0);
        return answer;
    }

    private void MakeDictionnary(int n, int Target, int count, int num) {
        int nn = n;

        if(count>8) {
            answer = -1;
            return;
        }
        if(num==Target) {
            if (count < answer || answer == -1) {
                answer = count;
            }
            return;
        }
        for(int i=1;i<9-count;i++){
            MakeDictionnary(n,Target,count+i,num+nn);
            MakeDictionnary(n,Target,count+i,num-nn);
            MakeDictionnary(n,Target,count+i,num*nn);
            MakeDictionnary(n,Target,count+i,num/nn);
            nn = nn*10+n;
        }
        return ;

    }


}
