package Chunghee.Level2;


import java.util.HashSet;
import java.util.Set;

public class Prime_number_Finder {


    static int answer =0;
    static Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        char[] number = numbers.toCharArray();
        boolean[] visited = new boolean[number.length];
        char[] output = new char[number.length];

        for(int i=1;i<=number.length;i++) {
            permutations(number,visited,output,0,numbers.length(),i);
        }
        return answer;
    }

    public static void permutations(char[] number, boolean[] select, char[] output, int startIndex, int size, int permuLength) {
        if (startIndex == permuLength) {
            if (isPrime(output, permuLength)) {
                answer++;
            }
            return;
        }

        for (int i = 0; i < size; i++) {
            if (select[i]) {
                continue;
            }
            select[i] = true;
            output[startIndex] = number[i];
            permutations(number, select, output, startIndex + 1, size, permuLength);
            select[i] = false;
        }
    }

    public static boolean isPrime(char[] output, int size) {
        if (output[0]=='0') return false;
        String str = "";

        for (int i = 0; i < size; i++) {
            str += output[i];
        }
        int num = Integer.parseInt(str);

        if (num <= 1 || set.contains(num)) {
            return false;
        }
        for (int i = 2; i*i <= num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        set.add(num);
        return true;
    }
}
