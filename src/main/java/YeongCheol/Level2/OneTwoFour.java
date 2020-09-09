package YeongCheol.Level2;

public class OneTwoFour {
    public String solution(int n) {
        char[] oneTwoFour = {'1','2','4'};
        StringBuilder sb = new StringBuilder();
        do{
            sb.append(oneTwoFour[--n % 3]);
        } while ((n /= 3) > 0);
        return sb.reverse().toString();
    }
}
