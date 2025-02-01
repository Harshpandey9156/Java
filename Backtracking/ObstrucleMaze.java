package Backtracking;

public class ObstrucleMaze {
    public static void main(String[] args) {
        boolean[][]  maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
        Obstrucl("", maze,0,0);

    }

    public static void Obstrucl(String p, boolean[][] maze, int c , int r){
        if(!maze[r][c]){
            return;
        }
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }


        if(r<maze.length-1){
             Obstrucl(p+"R" ,maze,c,r+1);
        }
        if(c<maze[0].length-1){
            Obstrucl(p+"D" ,maze,c+1,r);
        }

    }
}
