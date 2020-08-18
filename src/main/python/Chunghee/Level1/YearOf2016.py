def solution(a, b):
    Dayoftheweek = ["THU","FRI","SAT","SUN","MON","TUE","WED"]
    DatofMonth = [31,29,31,30,31,30,31,31,30,31,30,31]
    date = 0;
    for i in range(1,a):
        date +=int(DatofMonth[i-1])
    return  Dayoftheweek[(date+b)%7]