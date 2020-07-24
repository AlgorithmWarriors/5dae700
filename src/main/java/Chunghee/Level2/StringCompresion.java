package Chunghee.Level2;

public class StringCompresion {
    public int solution(String s) {
        char[] word = s.toCharArray();
        if (word.length==2)return 2;
        int CompresionNumber=0;
        int min=s.length();
        String Startword ="";
        String Endword ="";

        for(int i=1;i<s.length()/2+1;i++){
            int thismin = s.length();
            for(int j=0;j<s.length()-2*i+1;j=j+i){
                Startword=makeString(word,i,j);
                Endword =makeString(word,i,j+i);
                if(Startword.equals(Endword)){
                    CompresionNumber++;
                    thismin=thismin-i;
                }
                else if(CompresionNumber!=0){
                    thismin++;
                    CompresionNumber=0;
                }
            }
            if(CompresionNumber!=0){
                thismin++;
            }

            if (thismin<min)min=thismin;
        }
        return min;
    }

    private String makeString(char[] word, int i,int t) {
        String myString = "";
        for(int k=0;k<i;k++){
            myString = myString + word[k+t];
        }
        return myString;
    }
}
