package Chunghee.Level2;

public class NdecimalGame {
    public String solution(int n, int numberOfAnswers, int peopleNum, int tubeturn) {

        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        int GameCount =0;
        int Gamenum = 0;
        while ((peopleNum)*numberOfAnswers+tubeturn+1>GameCount){
            String NDecimalNum = makeNDecimal(Gamenum,n);
            GameCount += NDecimalNum.length();
            sb.append(NDecimalNum);
            Gamenum++;
        }
        for(int i=0;i<numberOfAnswers;i++){
           answer.append(sb.charAt(i*peopleNum+tubeturn-1));
        }


        return answer.toString();
    }
    public String makeNDecimal(int num,int n){
        if(num==0)return ""+0;
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            if (num/n==0) sb.append(ConvertNum(num));
            else sb.append(ConvertNum(num%n));
            num/=n;
        }
        return sb.reverse().toString();
    }

    private char ConvertNum(int i) {
        if(i<10)return (char)(i+'0');

        switch (i){
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15 :
                return 'F';
        }
        return (char) i;
    }
}
