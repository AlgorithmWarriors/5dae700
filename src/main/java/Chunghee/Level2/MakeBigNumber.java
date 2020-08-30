package Chunghee.Level2;

public class MakeBigNumber {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int lenght = number.length() - k;
        int left = 0;
        int right = number.length() - lenght;
        int max = -1;
        int index = 0;

        while(lenght > 0) {
            max = -1;
            for(int j = left ; j <= right ; ++j){
                int num = number.charAt(j) - '0';
                if(num > max){
                    index = j;
                    max = num;
                }
            }
            sb.append(number.charAt(index));
            left = index + 1;
            right = number.length() - --lenght;
        }

        return sb.toString();
    }
}
