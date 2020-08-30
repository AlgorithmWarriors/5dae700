package Chunghee.Level2;

import java.util.Arrays;

public class N_LCM {
    public int solution(int[] arr) {

        Arrays.sort(arr);
        if(arr.length==1)return arr[0];
        if(arr.length==2)return LCM(arr[0],arr[1]);
        int answer = LCM(arr[0],arr[1]);

        for(int i =2;i<arr.length;i++){
            answer = LCM(answer,arr[i]);
        }
        return answer;
    }

    static int GCD(int a,int b){
        if(b == 0)
            return a;
        return GCD(b, a % b);
    }

    static int LCM(int a,int b){
        return a*b/GCD(a,b);
    }
}
