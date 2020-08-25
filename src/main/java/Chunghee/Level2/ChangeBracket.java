package Chunghee.Level2;
public class ChangeBracket {
    public String solution(String p) {
        return correctBracket(p);
    }

    public String correctBracket(String p) {
        if(p.length()==0)return "";

        int index = getIndex(p);
        String u = p.substring(0,index);
        String v = p.substring(index,p.length());

        if(isCorrect(u)){
            return u+correctBracket(v);
        }else {
            String temp = '('+correctBracket(v)+')';
            u = u.substring(1,u.length()-1);
            u = reverse(u);
            return temp + u ;
        }
    }

    public int getIndex(String p) {
        int close =0,open = 0;
        int index;
        for (index = 0; index < p.length(); index++) {
            if (p.charAt(index) == '(') open++;
            else close++;
            if (open == close) return index+1;
        }
        return index;
    }

    public boolean isCorrect(String myString) {
        int count = 0;
        for(int i = 0 ; i < myString.length(); i++) {
            if(myString.charAt(i) == '(') {
                count++;
            }else
                count--;
            if(count < 0)
                return false;
        }
        return count == 0;
    }

    public String reverse(String mystring) {

        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i < mystring.length() ; i++) {
            if(mystring.charAt(i) == ')') {
                stringBuffer.append('(');
            }else
                stringBuffer.append(')');
        }
        return stringBuffer.toString();
    }
}
