package YeongCheol.Level2;

public class PrimeMaker {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++)
            for(int j = i+1; j < nums.length-1; j++)
                for(int k = j+1; k < nums.length; k++)
                {
                    int comb = nums[i] + nums[j] + nums[k];
                    if(IsPrime(comb)) answer++;
                }

        return answer;
    }

    public boolean IsPrime(int number)
    {
        if(number <= 1) return false;
        for(int i = 2; i <= Math.sqrt((double)number); i++)
            if(number % i == 0) return false;
        return true;
    }
}
