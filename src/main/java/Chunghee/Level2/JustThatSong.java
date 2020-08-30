package Chunghee.Level2;


import java.util.ArrayList;

public class JustThatSong {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        String Starttime;
        String Endtime;
        ArrayList<String> AnswerArray = new ArrayList<>();
        int length;
        int Max=0;
        String[] cut;
        m = ChangeSong(m);
        for (String temp : musicinfos){
            cut = temp.split(",");
            Starttime = cut[0];
            Endtime = cut[1];
            length = CalculLendgth(Starttime,Endtime);
            cut[3] = MakeSong(length, cut[3]);
            cut[3] = ChangeSong(cut[3]);
            if(cut[3].contains(m)){
                if(Max<length)answer=cut[2];
            }
        }
        return answer;
    }

    public String MakeSong(int length, String cut) {
        String Sheetmusic ="";
        if(length<cut.length())Sheetmusic=cut.substring(0,length);
        else {
            for (int i =0; i<length/cut.length();i++) {
                Sheetmusic = Sheetmusic + cut;
            }
            Sheetmusic = Sheetmusic + cut.substring(0,length%cut.length());
        }
        return Sheetmusic;
    }

    public int CalculLendgth(String starttime, String endtime) {
        String[] FirstTime = starttime.split(":");
        String[] SecondTime = endtime.split(":");
        return 60*(Integer.valueOf(SecondTime[0])- Integer.valueOf(FirstTime[0]))
                +(Integer.valueOf(SecondTime[1])- Integer.valueOf(FirstTime[1]));
    }
    public String ChangeSong(String song){
        song = song.replaceAll("C#", "c").replaceAll("D#", "d").replaceAll("F#", "f").replaceAll("A#", "a");
        return song;
    }
}
