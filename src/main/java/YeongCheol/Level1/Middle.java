package YeongCheol.Level1;

public class Middle {
    public String Solution(String s)
    {
        int middle = s.length() / 2;
        String answer = "";
        if(s.length() % 2 == 1)
        {
            answer = s.substring(middle, middle+1);
        }
        else
        {
            answer = s.substring(middle-1, middle+1);
        }
        return answer;
    }
}
