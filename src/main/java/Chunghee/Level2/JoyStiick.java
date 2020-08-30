package Chunghee.Level2;

public class JoyStiick {
    public int solution(String name) {

        int Updown=0;
        int Anum=0;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i)!= 'A') {
                Updown += CharactertoInteger(name.charAt(i));
            }
            else
                Anum++;
        }
        if(Anum==name.length())return 0;
        int minMove = name.length() - 1;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i) != 'A') {
                int next = i+1;
                while(next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                int move = 2 * i + name.length() - next;
                minMove = Math.min(move, minMove);
            }
        }
        return Updown+minMove;
    }

    private int CharactertoInteger(char c) {
        if(c<78)return c-65;
        else return 91-c;
    }
}
