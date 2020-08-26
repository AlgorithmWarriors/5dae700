package Chunghee.Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class NewsClustering {
    public int solution(String str1, String str2) {
        ArrayList<String> str1Arraylist = new ArrayList<>();
        ArrayList<String> str2Arraylist = new ArrayList<>();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i=0;i<str1.length()-1;i++){
            if(Character.isLetter(str1.charAt(i))&&Character.isLetter(str1.charAt(i+1)))
                    str1Arraylist.add(str1.substring(i,i+2));
        }
        for(int i=0;i<str2.length()-1;i++){
            if(Character.isLetter(str2.charAt(i))&&Character.isLetter(str2.charAt(i+1)))
                    str2Arraylist.add(str2.substring(i,i+2));
        }
        if(str1Arraylist.size()==0&&str2Arraylist.size()==0)return 65536;
        int Intersecting = IntersectingUnion(str1Arraylist,str2Arraylist);
        int union = makeunion(str1Arraylist,str2Arraylist);



        return (int)Math.floor((double)Intersecting/(double)union*65536);
    }

    private int makeunion(ArrayList<String> str1Arraylist, ArrayList<String> str2Arraylist) {
        str1Arraylist = (ArrayList<String>) str1Arraylist.clone();
        str2Arraylist = (ArrayList<String>) str2Arraylist.clone();
        ArrayList<String> temp = new ArrayList<>();
        for(String str : str1Arraylist){
            if(str2Arraylist.contains(str)){
                str2Arraylist.remove(str);
            }
            temp.add(str);
        }
        temp.addAll(str2Arraylist);
        return temp.size();
    }

    private int IntersectingUnion(ArrayList<String> str1Arraylist, ArrayList<String> str2Arraylist) {
        str1Arraylist = (ArrayList<String>) str1Arraylist.clone();
        str2Arraylist = (ArrayList<String>) str2Arraylist.clone();
        ArrayList<String> temp = new ArrayList<>();
        for(String str : str1Arraylist){
            if(str2Arraylist.contains(str)){
                temp.add(str);
                str2Arraylist.remove(str);
            }
        }
        return temp.size();
    }
}
