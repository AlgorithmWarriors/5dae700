package Chunghee.Level2;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class OpenChattingRoomTest {
    @Test
    public void 오픈쳇팅테스트(){
        OpenChattingRoom openChattingRoom = new OpenChattingRoom();
        String[] records = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] answer ={"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        assertThat(openChattingRoom.solution(records),is(answer));
    }
}
