package YeongCheol.Level2;

public class IntactSquare {
    public long solution(int w, int h) {
        long answer = (long)w * (long)h;
        int gcd = Gcd(w, h);
        int wSmall = w / gcd;
        int hSmall = h / gcd;
        long notIntactSquare;
        if(wSmall > hSmall)
        {
            notIntactSquare = gcd * hSmall * RoundUp(wSmall, hSmall);
        }
        else
        {
            notIntactSquare = gcd * wSmall * RoundUp(hSmall, wSmall);
        }
        answer -= notIntactSquare;

        return answer;
    }

    public int Gcd(int a, int b)
    {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int r = max % min;

        if (r == 0)
            return min;
        else
            return Gcd(r, b);
    }

    public long RoundUp(int dividend, int divisor)
    {
        return dividend % divisor == 0 ? dividend / divisor : (dividend / divisor) + 1;
    }
}
