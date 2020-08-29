package Chunghee.Level2;

public class TargetNumber {
    static int answer = 0;
    static int[] mynumbers;
    public int solution(int[] numbers, int target) {
        mynumbers = numbers;
        FindTargetNumber(target,0,numbers.length,0);
        return answer;
    }

    private void FindTargetNumber(int target, int beforIndex, int targetindex,int befornumber) {
        int number = befornumber;
        if (targetindex==beforIndex){
            if(target==befornumber)answer++;
            return;
        }
        FindTargetNumber(target,beforIndex+1,targetindex,number+mynumbers[beforIndex]);
        FindTargetNumber(target,beforIndex+1,targetindex,number-mynumbers[beforIndex]);
    }
}
