package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;

public class JustThatSongTest {

    JustThatSong justThatSong = new JustThatSong();
    @Test
    public void 시간계산테스트(){
        assertThat(justThatSong.CalculLendgth("12:00","13:00"),is(60));
        assertThat(justThatSong.CalculLendgth("12:00","12:03"),is(3));
    }
    @Test
    public void 노래확인(){
        assertThat(justThatSong.MakeSong(3,"abcd"),is("abc"));
        assertThat(justThatSong.MakeSong(5,"abcd"),is("abcda"));
        assertThat(justThatSong.MakeSong(9,"abcd"),is("abcdabcda"));
    }
    @Test
    public void 노래변경확인(){
        assertThat(justThatSong.ChangeSong("C#CCBC#"),is("cCCBc"));
        assertThat(justThatSong.ChangeSong("C#CCBC"),is("cCCBC"));
        assertThat(justThatSong.ChangeSong("C"),is("C"));
    }
    @Test
    public void 솔루션테스트(){
        String[][] musicinfos ={{"03:00,04:30,ans,CC#B","03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B","03:00,04:30,F0d,CC#B"},
                                {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}};
        assertThat(justThatSong.solution("CC#BCC#BCC#BCC#B",musicinfos[0]),is("ans"));
        assertThat(justThatSong.solution("ABCDEFK",musicinfos[1]),is("(None)"));
    }
}
