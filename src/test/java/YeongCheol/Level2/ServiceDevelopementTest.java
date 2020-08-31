package YeongCheol.Level2;

import YeongCheol.Level2.ServiceDevelopement;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class ServiceDevelopementTest {
    @Test
    public void 기능개발(){
        ServiceDevelopement serviceDevelopement = new ServiceDevelopement();
        assertThat(serviceDevelopement.solution(new int[]{93,30,55}, new int[]{1, 30, 5}), is(new int[]{2,1}));
        assertThat(serviceDevelopement.solution(new int[]{95,90,99,99,80,99}, new int[]{1,1,1,1,1,1}), is(new int[]{1,3,2}));
    }
}
