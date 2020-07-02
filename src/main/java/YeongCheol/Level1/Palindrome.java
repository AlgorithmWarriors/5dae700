package YeongCheol.Level1;

public class Palindrome {
    public int JudgePalindrome(String inputStr)
    {
        if(IsPalindrome(inputStr)) return 0;
        else if(IsPseudoPalindrome(inputStr)) return 1;
        else return 2;
    }

    public boolean IsPalindrome(String inputStr)
    {
        int middleLength = inputStr.length() / 2;
        StringBuffer backStrHalfReverse;
        String frontStrHalf = inputStr.substring(0, middleLength);
        if(inputStr.length() % 2 == 0)
            backStrHalfReverse = new StringBuffer(inputStr.substring(middleLength)).reverse();
        else
            backStrHalfReverse = new StringBuffer(inputStr.substring(middleLength + 1)).reverse();

        if(frontStrHalf.contentEquals(backStrHalfReverse))
            return true;
        else
            return false;
    }

    public boolean IsPseudoPalindrome(String inputStr)
    {
        for(int charPos = 0; charPos < inputStr.length(); charPos++)
        {
            StringBuffer inputStrBuffer = new StringBuffer(inputStr);
            if (IsPalindrome(inputStrBuffer.deleteCharAt(charPos).toString())) return true;
        }
        return false;
    }
}