package Chunghee.Level2;

public class MaxAndMin {
    static char[] myArray;
    public String solution(String s) {
        String answer = "";
        myArray = s.toCharArray();
        int Max=findNumber(0);
        int Min=findNumber(0);

        for(int i=0;i<myArray.length;i++){
            Max = Math.max(Max,findNumber(i));
            Min = Math.min(Min,findNumber(i));
            i+=IndexCalcul(i);
        }
        return answer+Min+" "+Max;
    }

    private int IndexCalcul(int StartIndex) {
        int index=0;
        for(int i=StartIndex;i<myArray.length;i++){
            if(myArray[i]==' ')break;
            index++;
        }
        return index;
    }

    private int findNumber(int StartIndex) {
        int Minus = 1;
        int Number =0;
        for(int i=StartIndex;i<myArray.length;i++){
            if(myArray[i]==' ')break;
            if(myArray[i]=='-') {
                Minus = -1;
                continue;
            }
            Number = Number*10+Integer.valueOf(myArray[i]-'0');
        }
        return Minus*Number;
    }

}
