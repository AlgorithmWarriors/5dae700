package Chunghee.Level2;

import java.util.Arrays;
import java.util.HashSet;

public class Phonketmon {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> myHash = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            myHash.add(nums[i]);
        }
        return Math.min(myHash.size(),nums.length/2);
    }
}
