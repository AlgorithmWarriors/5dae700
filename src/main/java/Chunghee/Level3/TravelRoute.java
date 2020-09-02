package Chunghee.Level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelRoute {
    static boolean[] check;
    static String[] answer;
    static String[][] route;
    static String Stringroute ="";
    static List<String> arrayList = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        route = tickets;
        check = new boolean[tickets.length];
        FindTravelRoute(0,"ICN");
        Collections.sort(arrayList);
        answer = arrayList.get(0).split(" ");
        return answer;
    }

    public void FindTravelRoute(int index,String start){
        Stringroute += start + " ";
        if(index==check.length){
            arrayList.add(Stringroute);
            return;
        }
        for(int i=0;i<check.length;i++){
            if(!check[i]&&route[i][0].equals(start)){
                check[i]=true;
                FindTravelRoute(index+1,route[i][1]);
                check[i]=false;
                Stringroute = Stringroute.substring(0,Stringroute.length()-4);
            }
        }
    }
}
