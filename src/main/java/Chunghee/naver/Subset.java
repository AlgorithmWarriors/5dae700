package Chunghee.naver;

import java.util.LinkedList;
import java.util.List;

public class Subset {
    public int[] solution(int[] arrayA,int[] arrayB) {
        int[] save= new int[1000000];
        int[] answer = new int[5];
        int inttersect=0;
        for(int i=0; i<1000001;i++){
            save[i]=0;
        }
        LinkedList<Integer> arrayAList = new LinkedList<>();
        LinkedList<Integer> arrayBList = new LinkedList<>();

        for(int i=0;i<arrayA.length;i++){
           if(save[arrayA[i]]!=1){
               save[arrayA[i]]=1;
               arrayAList.add(arrayA[i]);
           }
        }
        for(int i=0;i<arrayB.length;i++){
            if(save[arrayB[i]]==0){
                save[arrayB[i]]=2;
                arrayBList.add(arrayA[i]);
            }
            else if(save[arrayB[i]] == 1)
            {
                save[arrayA[i]] = 2;
                arrayBList.add(arrayA[i]);
                inttersect++;
            }
        }
        answer[0]=arrayAList.size();
        answer[1]=arrayBList.size();
        answer[2]=answer[0]+answer[1]-inttersect;
        answer[3]=Math.max(answer[0],answer[1])-answer[4];
        answer[4]=inttersect;
        return answer;
    }
}
