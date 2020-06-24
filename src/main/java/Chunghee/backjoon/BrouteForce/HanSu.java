package Chunghee.backjoon.BrouteForce;

public class HanSu {
    public int solution(int numbers) {
        if (numbers < 100) {
            return numbers;
        }
        else {
            int result = 99;
            for (int i = 100; i <= numbers; ++i) {
                result += checkHanNumber(i);
            }
            if (numbers == 1000) result--;
            return result;
        }
    }


    private int checkHanNumber(int number) {
        int num1 = number / 100 % 10;
        int num2 = number / 10 % 10;
        int num3 = number % 10;

        if (num2 * 2 == num1 + num3) {
            return 1;
        }
        return 0;
    }
}
