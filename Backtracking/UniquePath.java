package Backtracking;

public class UniquePath {




    public static void main(String[] args) {

        int m=3,n=2;
        System.out.println(uniquePaths(m,n));




    }


    public static int uniquePaths(int m, int n) {

        if(m==1 && n==1){
            return 1;
        }
        int count=0;
        int left=routes(m,n ,count);
        int right=routes(m,n,count);






        return left+right;

    }

    public static int routes(int m, int c ,int count){
        if(m==1 && c==1){
            count++;
        }

        if(m>1){
             m--;
        }
        if(c>1){
            c--;
        }
   return count;

    }


}
