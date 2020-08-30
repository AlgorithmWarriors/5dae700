package Chunghee.Level2;

public class StringCompresion {
    public int solution(String s) {
        if (s.length()<=2)return s.length();
        int answer = s.length();
        for(int i=1;i<=s.length()/2;i++){
            String startword = "";
            String endword = "";
            String CompressionString = "";
            int CompressionNumber = 1;
            for(int j=0;j<=s.length()/i;j++){
                int start = j * i;
                int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
                startword = endword;
                endword = s.substring(start, end);

                if(startword.equals(endword)) {
                    CompressionNumber++;
                } else {
                    CompressionString += (processHit(CompressionNumber) + startword);
                    CompressionNumber = 1;
                }

            }
            CompressionString +=(processHit(CompressionNumber)+endword);
            answer = Math.min(answer,CompressionString.length());

        }
        return answer;
    }
    private static String processHit(int hit) {
        return hit > 1 ? String.valueOf(hit) : "";
    }
}
