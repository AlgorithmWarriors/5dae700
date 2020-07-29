package YeongCheol.Level1;

import java.util.ArrayList;

public class CrainDollPulling {
    int[][] m_board;
    ArrayList<Integer> basket;

    public int solution(int[][] board, int[] moves) {
        m_board = board;
        basket = new ArrayList<Integer>();
        int answer = 0;
        for (int elem:moves)
        {
            int dollNumber = Pull(elem);
            answer += PushBasket(dollNumber);
        }
        return answer;
    }

    public int Pull(int column)
    {
        int dollNumber = 0;
        for(int[] elem : m_board)
        {
            if(elem[column-1] != 0)
            {
                dollNumber = elem[column-1];
                elem[column-1] = 0;
                return dollNumber;
            }
        }
        return dollNumber;
    }

    public int PushBasket(int dollNumber)
    {
        if(dollNumber == 0) return 0;

        if(basket.size() == 0)
        {
            basket.add(dollNumber);
            return 0;
        }

        if(basket.get(basket.size() - 1) == dollNumber)
        {
            basket.remove(basket.size() - 1);
            return 2;
        }
        else
        {
            basket.add(dollNumber);
            return 0;
        }
    }
}
