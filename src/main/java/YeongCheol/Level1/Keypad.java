package YeongCheol.Level1;

class PointKeypad
{
    public int x;
    public int y;

    public PointKeypad(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public static PointKeypad ConversionIntToPointKeypad(int input)
    {
        switch (input)
        {
            case 1: return new PointKeypad(0, 0);
            case 4: return new PointKeypad(0, 1);
            case 7: return new PointKeypad(0, 2);
            case 2: return new PointKeypad(1, 0);
            case 5: return new PointKeypad(1, 1);
            case 8: return new PointKeypad(1, 2);
            case 0: return new PointKeypad(1, 3);
            case 3: return new PointKeypad(2, 0);
            case 6: return new PointKeypad(2, 1);
            case 9: return new PointKeypad(2, 2);
            default: return new PointKeypad(-1,-1);
        }
    }

    public int distance(PointKeypad input)
    {
        return Math.abs(this.x - input.x) + Math.abs(this.y - input.y);
    }
}

public class Keypad {

    PointKeypad currentLeftFingerPos;
    PointKeypad currentRightFingerPos;
    boolean isLeftHander;

    public String solution(int[] numbers, String hand) {
        String answer = "";
        currentLeftFingerPos = new PointKeypad(0, 3);
        currentRightFingerPos = new PointKeypad(2, 3);
        if(hand == "left")
        {
            isLeftHander = true;
        }
        else if(hand == "right")
        {
            isLeftHander = false;
        }

        for(int number : numbers)
        {
            int finger = PressFinger(number);
            if(finger == 0)
            {
                answer += "L";
            }
            else if(finger == 1)
            {
                answer += "R";
            }
            else
                answer += "?";
        }

        return answer;
    }

    // 0 : 왼손, 1 : 오른손, -1 : 오류
    public int PressFinger(int inputNumber)
    {
        PointKeypad point = PointKeypad.ConversionIntToPointKeypad(inputNumber);
        if(point.x == 0)
        {
            currentLeftFingerPos = point;
            return 0;
        }
        else if(point.x == 2)
        {
            currentRightFingerPos = point;
            return 1;
        }
        else if(point.x == 1)
        {
            int leftFingerDistance = currentLeftFingerPos.distance(point);
            int rightFingerDistance = currentRightFingerPos.distance(point);

            if(leftFingerDistance < rightFingerDistance)
            {
                currentLeftFingerPos = point;
                return 0;
            }
            else if(leftFingerDistance > rightFingerDistance)
            {
                currentRightFingerPos = point;
                return 1;
            }
            else
            {
                if(isLeftHander)
                {
                    currentLeftFingerPos = point;
                    return 0;
                }
                else
                {
                    currentRightFingerPos = point;
                    return 1;
                }
            }
        }
        else
        {
            return -1;
        }
    }
}
