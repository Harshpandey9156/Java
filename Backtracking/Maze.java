package Backtracking;

public class Maze {
    public static void main(String[] args) {
        route("",3,3);

    }

    public static int routes(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left =routes(r-1,c);
        int right= routes(r, c-1);

        return left+right;
    }


    public static void route(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            route(p+'D' ,r-1,c);
        }
        if(c>1){
            route(p+'R' , r, c-1);
        }
    }

}
