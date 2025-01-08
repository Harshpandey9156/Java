package Math;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        factor3(40);
        
    }

    public static void factor(int n){
        for(int i=1;i<= n;i++){
            if(n%i==0){
                System.out.println(i +" ");
            }

        }
       
    }

    public static void factor2(int n){
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }
                else{
                    System.out.print(i +" " + n/i+ " ");
                }
            }
            
        }
    }
    public static void factor3(int n){
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }
                else{
                    System.out.print(i +" " );
                    list.add(n/i);
                }
            }
            
        }
        for (int j = list.size()-1; j >=0; j--) {
            System.out.print(list.get(j)+ " ");
            
        }
    }
}
