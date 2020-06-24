package Chunghee.Level2;

public class countryOf124 {
    public String solution(int n) {
        String a = "";
        int Subject =0;
        while(!(n/3==0&&n%3==0)) {
            if(n%3==0) {
                a=String.valueOf(changetwo(4-Subject))+a;
                Subject =1;
            }
            else if(n%3-Subject==0) a=a;
            else {
                a=String.valueOf(changetwo(n%3-Subject))+a;
                Subject = 0;
            }
            n=n/3;
        }
        return a;
    }

    private int changetwo(int i) {
        if(i==3) return 2;
        else return i;
    }


}
