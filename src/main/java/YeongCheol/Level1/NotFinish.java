package YeongCheol.Level1;

import java.util.HashMap;
import java.util.Iterator;

public class NotFinish {
    public String solution(String[] participants, String[] completions) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        String answer = "";
        for (String participant : participants)
        {
            if(!hashMap.containsKey(participant))
            {
                hashMap.put(participant, 1);
            }
            else
            {
                hashMap.replace(participant, hashMap.get(participant)+1);
            }
        }
        for (String completion : completions)
        {
            if(hashMap.get(completion) == 1)
            {
                hashMap.remove(completion);
            }
            else
            {
                hashMap.replace(completion, hashMap.get(completion)-1);
            }
        }
        Iterator<String> iter = hashMap.keySet().iterator();
        while(iter.hasNext())
        {
            String key = (String)iter.next();
            if(key != null && key != "")
            {
                answer = key;
            }
        }

        return answer;
    }
}
