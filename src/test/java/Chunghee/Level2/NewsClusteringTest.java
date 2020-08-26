package Chunghee.Level2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NewsClusteringTest {
    @Test
    public void 뉴스클러스터링테스트(){
        NewsClustering newsClustering =new NewsClustering();
        String[] str1 = {"FRANCE","handshake","aa1+aa2","E=M*C^2"};
        String[] str2 = {"french","shake hands","AAAA12","e=m*c^2"};
        int[] answer  ={16384,65536,43690,65536};
        assertThat(newsClustering.solution(str1[2],str2[2]),is(answer[2]));
    }
}
