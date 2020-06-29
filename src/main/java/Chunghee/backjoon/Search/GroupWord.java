package Chunghee.backjoon.Search;

public class GroupWord {


    public Boolean solution(String myString) {
        int index = 0;
        if(myString.length()==1)return true;

        char[] mychar = new char[myString.length()+1];
        mychar[0] = myString.charAt(0);
        for(int i=1;i<myString.length();i++){
            if(myString.charAt(i-1)!=myString.charAt(i)) {
                for (int j =0; j<index;j++) {
                    if (mychar[j] == myString.charAt(i)) return false;
                }
                index++;
                mychar[index]=mychar[i];
            }
        }
        return true;
    }
}
