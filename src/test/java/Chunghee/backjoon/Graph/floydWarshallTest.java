package Chunghee.backjoon.Graph;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class floydWarshallTest {
    @Test
    public void 플로이드와샬테스트(){
        FloydWarshall floydWarshall = new FloydWarshall();
        int[][] route = {
                {1,2,2},
                {1,3,3},
                {1,4,1},
                {1,5,10},
                {2,4,2},
                {3,4,1},
                {3,5,1},
                {4,5,3},
                {3,5,10},
                {3,1,8},
                {1,4,2},
                {5,1,7},
                {3,4,2},
                {5,2,4}};
        int[][] answer ={
                {0,2,3,1,4},
                {12,0,15,2,5},
                {8,5,0,1,1},
                {10,7,13,0,3},
                {7,4,10,6,0}};
        assertThat(floydWarshall.solution(14,5,route),is(answer));
    }

}
