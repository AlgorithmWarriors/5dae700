package Chunghee.Level2;

public class JadenCase {
    public String solution(String s) {
        String answer = s;
        StringBuilder stringBuilder =new StringBuilder();
        answer = s.toLowerCase();
        char[] chars = answer.toCharArray();
        if(Character.isAlphabetic(chars[0]))chars[0]=Character.toUpperCase(chars[0]);
        Boolean isUppperCase = false;
        for(int i=0 ;i<chars.length;i++){
          if(chars[i]==' ')isUppperCase=true;
          if(chars[i]!=' '&&!Character.isAlphabetic(chars[i]))isUppperCase=false;
          if(isUppperCase==true&&Character.isAlphabetic(chars[i])){
              isUppperCase=false;
              chars[i]=Character.toUpperCase(chars[i]);
          }
          stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
