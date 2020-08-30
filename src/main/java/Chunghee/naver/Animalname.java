package Chunghee.naver;

public class Animalname {
    public boolean solution(String[] namelist) {
            if (namelist.length<=1)return false;
            if (namelist.length==2&&namelist[0]==namelist[1])return true;
            if (namelist.length==2&&namelist[0]!=namelist[1])return false;

            for(int i=0; i<=namelist.length-1;i++){
                for(int j=i+1;j<=namelist.length-2;j++){
                    if(namelist[i].contains(namelist[j])) return true;
                }
            }
            for(int i=namelist.length-1; i>=1;i--){
                for(int j=i-1;j>=0;j--){
                    if(namelist[i].contains(namelist[j])) return true;
            }
        }
            return false;

    }

}
