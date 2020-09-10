package Chunghee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TriangleSum {

    public int[] solution(int n) {

        int[][] triangle = new int[n][n];;
        int mode = 0;
        int len = 0 ;
        int height = 0 ;
        int Maxlen = triangle.length;
        int Maxheight = triangle.length;
        int index = 2;
        for(int i = 0 ; i<n;i++){
            Arrays.fill(triangle[i],0);
        }
        triangle[0][0]=1;
      while (index<=n*(n+1)/2){
          switch (mode){
              case 0 :
                  while (height<Maxheight-1){
                      if(index==n*(n+1)/2+1|| triangle[height+1][len]!=0)break;
                      triangle[height+1][len]=index++;
                      height++;

                  }
                  Maxheight--;
                  mode = 1;
                  break;
              case 1:
                  while (len<Maxlen-1){
                      if(index==n*(n+1)/2+1|| triangle[height][len+1]!=0)break;
                      triangle[height][len+1]=index++;
                      len++;
                  }
                  Maxlen--;
                  mode = 2;
                  break;
              case  2:
                  while(triangle[height-1][len-1]==0){
                      if(index==n*(n+1)/2+1|| triangle[height-1][len-1]!=0)break;
                      triangle[height-1][len-1]=index++;
                      len--;
                      height--;
                  }
                  mode = 0;
                  break;
          }
      }
      ArrayList<Integer> answerArray = new ArrayList<>();
      for(int i = 0 ; i<n;i++){
          for(int j=0;j < n;j++){
              if(triangle[i][j]!=0)answerArray.add(triangle[i][j]);
              else break;
          }
      }
      Iterator<Integer>Itr = answerArray.iterator();
      int k = 0;
      int[] answer = new int[answerArray.size()];
      while (Itr.hasNext()){
            answer[k++]=Itr.next();
      }

      return answer;
    }


}
