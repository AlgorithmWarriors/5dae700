package Chunghee.Level3;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class TheWayToSchoolTest {
    @Test
    public void 등굣길테스트(){
        TheWayToSchool theWayToSchool = new TheWayToSchool();
        int [][] paddle  = {{2,2}};
        assertThat(theWayToSchool.solution(4,3,paddle),is(4));
    }
}
