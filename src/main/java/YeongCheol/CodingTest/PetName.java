package YeongCheol.CodingTest;

import java.util.ArrayList;

public class PetName {
    public boolean solution(String[] name_list)
    {
        boolean answer = false;
        ArrayList<String> currentNameList = new ArrayList<String>();
        for(String elem : name_list)
        {
            for(String currentElem : currentNameList)
            {
                if(elem.contains(currentElem) || currentElem.contains(elem))
                    return true;
            }
            currentNameList.add(elem);
        }
        return answer;
    }
}