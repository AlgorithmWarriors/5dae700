package Chunghee;


import java.lang.reflect.Array;
import java.util.*;

public class IntSum {
    public int[] solution(int[] numbers) {

        ArrayList<Integer> myArrayResult = new ArrayList<>();
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(!myArrayResult.contains(numbers[i]+numbers[j]))myArrayResult.add(numbers[i]+numbers[j]);
            }
        }
        Collections.sort(myArrayResult);
        Iterator<Integer> Itr = myArrayResult.iterator();
        int[] answer = new int[myArrayResult.size()];
        int index = 0;
        while (Itr.hasNext()){
            answer[index++]=Itr.next();
        }
        return answer;
    }
}
