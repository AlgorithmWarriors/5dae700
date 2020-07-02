package YeongCheol.Level1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseInteger {
    public long Solution(long n) {
        ArrayList<Long> longArr = new ArrayList<Long>();
        long answer = 0;
        while(n != 0)
        {
            longArr.add(n % 10);
            n /= 10;
        }
        longArr.sort(Long::compareTo);
        Collections.reverse(longArr);
        for (long number : longArr)
        {
            answer *= 10;
            answer += number;
        }
        return answer;
    }
}
