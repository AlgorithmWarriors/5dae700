package YeongCheol.Level2;

public class StringCompress {
    public int solution(String s) {
        int answer = s.length();
        for(int i = 1; i <= s.length() / 2; i++)
        {
            int compressLength = CalculateCompressStringLength(s, i);
            if(answer > compressLength)
            {
                answer = compressLength;
            }
        }
        return answer;
    }

    private int CalculateCompressStringLength(String str, int cuttingSize)
    {
        int currentStrIdx = 0;
        int compStrLength = 0;
        while (currentStrIdx + cuttingSize <= str.length())
        {
            String substr = str.substring(currentStrIdx, currentStrIdx + cuttingSize);
            int repeatCount = 0;
            while(currentStrIdx + cuttingSize <= str.length()
                    && str.regionMatches(currentStrIdx, substr, 0, cuttingSize))
            {
                currentStrIdx += cuttingSize;
                repeatCount++;
            }
            compStrLength += (repeatCount == 1) ? cuttingSize : cuttingSize + GetIntStringLength(repeatCount);
        }
        return compStrLength + (str.length() - currentStrIdx);
    }

    private int GetIntStringLength(int number)
    {
        int length = 1;
        while((number /= 10) > 0)
        {
            length++;
        }
        return length;
    }
}
