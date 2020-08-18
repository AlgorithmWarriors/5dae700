def solution(participant, completion):
    
    participant.sort();
    completion.sort();

    for par,com in zip(participant,completion):
        if par !=com :
            print(zip)
            return par
    print(completion[-1])   
    return participant[-1]    