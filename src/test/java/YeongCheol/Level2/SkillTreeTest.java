package YeongCheol.Level2;

import YeongCheol.Level1.CrainDollPulling;
import YeongCheol.Level2.SkillTree;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class SkillTreeTest {
    @Test
    public void 스킬트리(){
        SkillTree skillTree = new SkillTree();
        assertThat(skillTree.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}), is(2));
    }
}
