package Chunghee.Level2;

import java.util.Arrays;

public class Phonketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int[] num = new int[200000];
        Arrays.fill(num,0);
        for(int i = 0;i<nums.length;i++){
            num[nums[i]-1]++;
        }
        for(int i = 0;i<num.length;i++){
            if(num[i]!=0)answer++;
        }

        return Math.max(answer,nums.length/2);
    }
}
