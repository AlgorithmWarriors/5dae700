package Chunghee.Level2;

public class JoyStiick {
    public int solution(String name) {
        char[] myString = name.toCharArray();
        int  straightAnswer = 0;
        int BackAnswer = CharactertoInteger(myString[0]);
        int Anum=0;
        int BackAnum;
        int StraightAnum;
        for(int i= 0; i<myString.length;i++){
            if(myString[i]=='A')Anum++;
        }
        if(Anum==myString.length)return 0;

        StraightAnum=Anum;
        BackAnum=Anum;
        if(myString[0]=='A')BackAnum--;
        for(int i= myString.length-1; i>=1;i--){
            if(i==BackAnum)break;
            if(i>=1)BackAnswer++;
            if(myString[i]=='A')BackAnum--;
            BackAnswer= BackAnswer+CharactertoInteger(myString[i]);
        }
        for(int i= 0; i<myString.length;i++){
            if(myString[i]=='A')StraightAnum--;
            straightAnswer= straightAnswer+CharactertoInteger(myString[i]);
            if(myString.length-i-1==StraightAnum)break;
            if(i+1<myString.length)straightAnswer++;
        }
        return Math.min(straightAnswer,BackAnswer);
    }

    private int CharactertoInteger(char c) {
        if(c<78)return c-65;
        else return 91-c;
    }
}
