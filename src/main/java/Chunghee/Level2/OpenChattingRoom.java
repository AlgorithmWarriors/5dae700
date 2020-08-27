package Chunghee.Level2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class OpenChattingRoom {
    public String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String,String> IdHash = new HashMap<>();
        Queue<String> myQueue = new LinkedList<>();
        ArrayList<String> myArrayList = new ArrayList<>();
        String[] comend;
        for(String str : record){
            String[] temp = str.split(" ");
            switch (temp[0]){
                case "Enter":
                    myQueue.add(temp[1]+" 님이 들어왔습니다.");
                    IdHash.put(temp[1],temp[2]);
                    break;
                case "Leave":
                    myQueue.add(temp[1]+" 님이 나갔습니다.");
                    break;
                case "Change":
                    IdHash.put(temp[1],temp[2]);
            }
        }
        while (!myQueue.isEmpty()){
            comend = myQueue.peek().split(" ");
            myArrayList.add(myQueue.poll().replaceAll(comend[0]+" ",IdHash.get(comend[0])));
        }
        answer = myArrayList.toArray(new String[0]);
        return answer;
    }
}
