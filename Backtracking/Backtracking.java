package Backtracking;

public class Backtracking {


    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true , true, true},
                {true, true, true}
        };
        Obstrucl("", maze,0,0);
    }



    public static void Obstrucl(String p, boolean[][] maze, int c , int r){


        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;


        if(r<maze.length-1){
            Obstrucl(p+"R" ,maze,c,r+1);
        }
        if(c<maze[0].length-1){
            Obstrucl(p+"D" ,maze,c+1,r);
        }
        if(r>0){
            Obstrucl(p+'U',maze,r-1,c);

        }
        if(c>0){
            Obstrucl(p+'L',maze,r,c-1);
        }
        maze[r][c]=true;

    }
}
