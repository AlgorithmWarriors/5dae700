package Chunghee.Level2;

import java.util.ArrayList;

public class FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        int max=Deadline(progresses[0],speeds[0]);
        int maxNum=1;

        for(int i=1; i<progresses.length;i++){
            if (max<Deadline(progresses[i],speeds[i])){
                myArrayList.add(maxNum);
                max = Deadline(progresses[i],speeds[i]);
                maxNum = 1;
            }
            else maxNum++;
        }
        myArrayList.add(maxNum);

        int[] answer = new int[myArrayList.size()];
        int size=0;
        for(int temp :myArrayList) {
            answer[size++]=temp;
        }
        return answer;
    }

    private int Deadline(int progress, int speed) {
        if ((100-progress)%speed==0) return (100-progress)/speed;
        else return (100-progress)/speed+1;
    }
}
