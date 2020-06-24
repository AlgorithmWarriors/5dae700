package Chunghee;

import Chunghee.Level2.FunctionDevelop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class FunctionDevelopTest {
    @Test
    public void 기능개발테스트(){
        FunctionDevelop functionDevelop = new FunctionDevelop();
        int[] progress ={93,30,55};
        int[] speed = {1,30,5};
        int[] result = {2,1};
        assertThat(functionDevelop.solution(progress,speed),is(result));
    }
}
