package YeongCheol.Level3;

public class LockAndKey {

    static int[][] m_key;
    static int[][] m_lock;

    public boolean solution(int[][] key, int[][] lock) {
        m_key = key;
        m_lock = lock;

        for(int rotation = 0; rotation < 4; rotation++)
        {
            for(int moveX = 1 - m_key.length; moveX < m_key.length-1 + m_lock.length; moveX++)
            {
                for(int moveY = 1 - m_key.length; moveY < m_key.length-1 + m_lock.length; moveY++)
                {
                    if(TryKey(moveX, moveY))
                    {
                        return true;
                    }
                }
            }

            if(rotation == 3) break;

            // key 회전
            for(int layer = 0; layer < m_key.length / 2; layer++)
            {
                int first = layer;
                int last = m_key.length - 1 - layer;
                for(int i = first; i < last; i++)
                {
                    int offset = i - first;
                    int top = key[first][i];

                    key[first][i] = key[last-offset][first];
                    key[last-offset][first] = key[last][last-offset];
                    key[last][last-offset] = key[i][last];
                    key[i][last] = top;
                }
            }
        }
        return false;
    }

    public boolean TryKey(int moveX, int moveY)
    {
        for(int row = 0; row < m_lock.length; row++)
        {
            for(int col = 0; col < m_lock.length; col++)
            {
                int keyPosX = row - moveX;
                int keyPosY = col - moveY;
                if(0 <= keyPosX && keyPosX < m_key.length && 0 <= keyPosY && keyPosY < m_key.length)
                {
                    if((m_key[keyPosX][keyPosY] ^ m_lock[row][col]) == 0)
                    {
                        return false;
                    }
                }
                else
                {
                    if(m_lock[row][col] == 0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
