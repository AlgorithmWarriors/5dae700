package YeongCheol.Level2;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String trying : skill_trees)
        {
            if(IsLearnableSkillTree(skill, trying))
            {
                answer++;
            }
        }
        return answer;
    }

    public boolean IsLearnableSkillTree(String skill, String trying)
    {
        int currentSkillTreeIndex = 0;
        for(int i = 0; i < trying.length(); i++)
        {
            for(int search = currentSkillTreeIndex; search < skill.length(); search++)
            {
                if(skill.charAt(search) == trying.charAt(i))
                {
                    if(search == currentSkillTreeIndex)
                    {
                        currentSkillTreeIndex++;
                        continue;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
