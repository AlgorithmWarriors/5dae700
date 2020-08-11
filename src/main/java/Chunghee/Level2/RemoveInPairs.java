package Chunghee.Level2;

public class RemoveInPairs {
    public int solution(String s)
    {
        int answer = 0;
        char[] myString = s.toCharArray();
        int size = myString.length;
        int CheckSize;
        while (true){
            CheckSize = size;

            for(int i = 0 ;i<size-1;i++){
                if(myString[i]==myString[i+1]){
                    for(int j=i;j<size-2;j++)
                        myString[j]=myString[j+2];
                    size-=2;
                }
            }
            if(size==0)return 1;
            if(CheckSize==size) break;
        }

        return answer;
    }
}
