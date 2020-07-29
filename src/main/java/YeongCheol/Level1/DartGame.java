package YeongCheol.Level1;

public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        int[] stageResult = new int[3];
        int currentStage = -1;
        for(int i = 0; i < dartResult.length(); i++)
        {
            char dartChar = dartResult.charAt(i);
            if(Character.isDigit(dartChar))
            {
                currentStage++;
                if(dartResult.charAt(i+1) == '0')
                {
                    stageResult[currentStage] = 10;
                    i++;
                }
                else
                {
                    stageResult[currentStage] = (int)dartChar - (int)'0';
                }
            }
            else if(dartChar == 'S')
            {
                stageResult[currentStage] = Power(stageResult[currentStage], 1);
            }
            else if(dartChar == 'D')
            {
                stageResult[currentStage] = Power(stageResult[currentStage], 2);
            }
            else if(dartChar == 'T')
            {
                stageResult[currentStage] = Power(stageResult[currentStage], 3);
            }
            else if(dartChar == '*')
            {
                stageResult[currentStage] *= 2;
                if(currentStage != 0)
                    stageResult[currentStage-1] *= 2;
            }
            else if(dartChar == '#')
            {
                stageResult[currentStage] *= -1;
            }
        }
        for(int elem : stageResult)
            answer += elem;
        return answer;
    }

    public int Power(int input, int powerNum)
    {
        int result = 1;
        for(int i = 0; i < powerNum; i++)
        {
            result *= input;
        }
        return result;
    }
}
