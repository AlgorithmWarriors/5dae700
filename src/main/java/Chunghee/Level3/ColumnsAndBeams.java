package Chunghee.Level3;


public class ColumnsAndBeams {
    static boolean[][] Column;
    static boolean[][] Beams;
    static int buildcount = 0 ;
    static int colums = 0;
    static int beam = 1;
    public int[][] solution(int n, int[][] build_frame) {
        Column = new boolean[n+3][n+3];
        Beams = new boolean[n+3][n+3];
        for (int[] comend : build_frame){
            DoComend(comend);
        }
        int index = 0;
        int[][] answer = new int[buildcount][3];
        for(int i = 1 ; i <= n + 1 ; ++i){
            for(int j = 1 ; j <= n + 1 ; ++j){
                if(Column[i][j]) answer[index++] = new int[]{i - 1, j - 1, colums};
                if(Beams[i][j]) answer[index++] =new int[]{i - 1, j - 1, beam};
            }
        }
        return answer;
    }

    private void DoComend(int[] comend) {
        int x = comend[0]+1;
        int y = comend[1]+1;
        if(comend[3]==1) {
            Build(comend, x, y);
        }
        else if (comend[3]==0){
            Deleate(comend,x,y);
        }
    }

    private void Deleate(int[] comend, int x, int y) {
        if (comend[2] == colums) {
            Column[x][y] = false;
        }
        else if(comend[2]==beam) {
            Beams[x][y] = false;
        }
        if(CanDelete()){
            buildcount--;
            return;
        }
        if (comend[2] == colums)
            Column[x][y]=true;
        else if(comend[2]==beam)
            Beams[x][y] = true;
    }

    private boolean CanDelete() {
        int n = Column.length-3;
        for(int i = 1 ; i <= n + 1 ; ++i){
            for(int j = 1 ; j <= n + 1 ; ++j){
                if(Column[i][j] && !canBuildColums(i, j)){
                    return false;
                }
                if(Beams[i][j] && !canBuildBeam(i, j)){
                    return false;
                }
            }
        }
        return true;
    }

    private void Build(int[] comend, int x, int y) {
        if (comend[2] == colums&& canBuildColums(x,y)) {
            Column[x][y] = true;
            buildcount++;
        } else if(comend[2]==beam && canBuildBeam(x,y)){
            Beams[x][y] = true;
            buildcount++;
        }
    }
    private boolean canBuildColums(int x, int y){
        return y == 1 || Column[x][y - 1] || Beams[x][y] || Beams[x - 1][y];
    }

    private boolean canBuildBeam(int x, int y){
        return Column[x][y - 1] || Column[x + 1][y - 1] || (Beams[x - 1][y] && Beams[x + 1][y]);
    }
}
