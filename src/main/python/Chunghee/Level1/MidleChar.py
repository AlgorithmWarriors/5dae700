def solution(s):
    i = len(s);
    if i!= int(i/2)*2 :
        answer =  s[int(i/2)]        
    else : 
        answer = s[int(i/2-1)]+s[int(i/2)]
    return answer
