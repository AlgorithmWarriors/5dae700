package YeongCheol.CodingTest;

import java.util.ArrayList;

public class SetImplementation {
    public int[] solution(int[] arrayA, int[] arrayB)
    {
        int[] answer = new int[5];
        ArrayList<Integer> arrayListA = new ArrayList<Integer>();
        ArrayList<Integer> arrayListB = new ArrayList<Integer>();

        for(int elem : arrayA)
            if(!arrayListA.contains(elem))
                arrayListA.add(elem);
        for(int elem : arrayB)
            if(!arrayListB.contains(elem))
                arrayListB.add(elem);

        arrayListA.sort(Integer::compareTo);
        arrayListB.sort(Integer::compareTo);

        ArrayList<Integer> sumList = set(arrayListA, arrayListB);
        ArrayList<Integer> complementList = complement(arrayListA, arrayListB);
        ArrayList<Integer> intersectList = intersect(arrayListA, arrayListB);

        answer[0] = arrayListA.size();
        answer[1] = arrayListB.size();
        answer[2] = sumList.size();
        answer[3] = complementList.size();
        answer[4] = intersectList.size();

        return answer;
    }

    public ArrayList<Integer> set(ArrayList<Integer> base, ArrayList<Integer> other)
    {
        ArrayList<Integer> sumList;
        if(base.size() == 0)
        {
            sumList = other;
            return sumList;
        }
        if(other.size() == 0)
        {
            sumList = base;
            return sumList;
        }

        sumList = new ArrayList<Integer>();
        int baseCount = 0;
        int otherCount = 0;

        while(baseCount != base.size() && otherCount != other.size())
        {
            if(base.get(baseCount) == other.get(otherCount))
            {
                sumList.add(base.get(baseCount));
                baseCount++;
                otherCount++;
            }
            else if(base.get(baseCount) < other.get(otherCount))
            {
                sumList.add(base.get(baseCount));
                baseCount++;
            }
            else
            {
                sumList.add(other.get(otherCount));
                otherCount++;
            }
        }
        for(; baseCount < base.size(); baseCount++)
        {
            sumList.add(base.get(baseCount));
        }
        for(; otherCount < other.size(); otherCount++)
        {
            sumList.add(other.get(otherCount));
        }

        return sumList;
    }

    public ArrayList<Integer> complement(ArrayList<Integer> base, ArrayList<Integer> other)
    {
        ArrayList<Integer> complementList;
        if(base.size() == 0 || other.size() == 0)
        {
            complementList = base;
            return complementList;
        }
        complementList = new ArrayList<Integer>();
        int baseCount = 0;
        int otherCount = 0;

        while(baseCount != base.size() && otherCount != other.size())
        {
            if(base.get(baseCount) == other.get(otherCount))
            {
                baseCount++;
                otherCount++;
            }
            else if(base.get(baseCount) < other.get(otherCount))
            {
                complementList.add(base.get(baseCount));
                baseCount++;
            }
            else
            {
                otherCount++;
            }
        }
        for(; baseCount < base.size(); baseCount++)
        {
            complementList.add(base.get(baseCount));
        }

        return complementList;
    }

    public ArrayList<Integer> intersect(ArrayList<Integer> base, ArrayList<Integer> other)
    {
        ArrayList<Integer> intersectList = new ArrayList<Integer>();
        if(base.size() == 0 || other.size() == 0)
            return intersectList;
        int baseCount = 0;
        int otherCount = 0;

        while(baseCount != base.size() && otherCount != other.size())
        {
            if(base.get(baseCount) == other.get(otherCount))
            {
                intersectList.add(base.get(baseCount));
                baseCount++;
                otherCount++;
            }
            else if(base.get(baseCount) < other.get(otherCount))
            {
                baseCount++;
            }
            else
            {
                otherCount++;
            }
        }

        return intersectList;
    }
}
