package Chunghee.Level2;

import java.util.*;

public class biggestNumber {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<numbers.length;i++){
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(strings[0].equals("0"))return "0";
        for (int i = 0; i < strings.length; i++) {
            answer.append(strings[i]);
        }
        return answer.toString();
    }
}
