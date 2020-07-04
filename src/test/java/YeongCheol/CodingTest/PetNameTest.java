package YeongCheol.CodingTest;

import YeongCheol.CodingTest.PetName;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PetNameTest {
    @Test
    public void 펫이름검사(){
        PetName petName = new PetName();
        assertThat(petName.solution(new String[]{"가을", "우주", "너굴"}), is(false));
        assertThat(petName.solution(new String[]{"봄", "여울", "봄봄"}), is(true));
        assertThat(petName.solution(new String[]{"봄봄", "여울", "봄"}), is(true));
        assertThat(petName.solution(new String[]{"너굴", "너울", "여울", "서울"}), is(false));
    }
}
