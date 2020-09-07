package YeongCheol.Level3;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
        for(int i = 0; i < genres.length; i++)
        {
            if(!hashMap.containsKey(genres[i]))
            {
                hashMap.put(genres[i], new ArrayList<>());
            }
            hashMap.get(genres[i]).add(i);
        }

        SimpleEntry<String, Integer>[] entrys = new SimpleEntry[hashMap.size()];
        int idx = 0;
        Iterator<String> iter = hashMap.keySet().iterator();
        while(iter.hasNext())
        {
            String key = (String)iter.next();
            if(key != null && key != "")
            {
                int genrePlay = 0;
                for (int songNumber : hashMap.get(key))
                {
                    genrePlay += plays[songNumber];
                }

                entrys[idx++] = new AbstractMap.SimpleEntry<String, Integer>(key, genrePlay);
            }
        }
        Arrays.sort(entrys, (o1, o2) -> o2.getValue() - o1.getValue());

        ArrayList<Integer> returnList = new ArrayList<>();
        for (SimpleEntry entry : entrys) {
            ArrayList<Integer> genreSongs = hashMap.get(entry.getKey());
            genreSongs.sort((o1, o2) -> plays[o2] - plays[o1]);
            returnList.add(genreSongs.get(0));
            if(genreSongs.size() >= 2)
            {
                returnList.add(genreSongs.get(1));
            }
        }

        int[] answer = new int[returnList.size()];
        for(int i = 0; i < returnList.size(); i++)
        {
            answer[i] = returnList.get(i);
        }
        return answer;
    }
}
