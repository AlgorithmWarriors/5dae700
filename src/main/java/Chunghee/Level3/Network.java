package Chunghee.Level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Network {

    static int answer = 0;
    static int[][] myComputer;
    static boolean[] check;
    public int solution(int n, int[][] computers) {

        check = new boolean[n];
        myComputer = computers;

        for(int i =0;i<n;i++){
            if(!check[i]){
                findNetwork(i);
                answer++;
            }
        }
        return answer;
    }

    private void findNetwork(int index) {
        check[index] =true;
        for(int i= 0;i<myComputer.length;i++){
            if(index != i &&myComputer[index][i]==1&&check[i]==false){
                findNetwork(i);
            }
        }
        return ;
    }
}
