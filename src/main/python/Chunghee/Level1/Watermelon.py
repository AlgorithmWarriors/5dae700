def solution(n):
    answer = ''
    for i in range(0,int(n/2)):
        answer += '수박' 
    if n!=int(n/2)*2:
        answer=answer+'수'
    return answer