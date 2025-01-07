package Math;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n=40;
        int p=3;

        System.out.printf("%.3f", sqrt(n,p));

    }

    static double sqrt(int num, int p){

        int s=0;
        int e=num;
        
        double root=0.0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(mid*mid==num ){
                return mid;
            }
            if(mid*mid>num){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }


        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=num){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }





        return root;

    }
}
