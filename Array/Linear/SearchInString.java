package Array.Linear;

public class SearchInString {
    public static void main(String[] args) {

        String name = "Harsh";
        char character='q';
        System.out.println(stringSearch(name, character));
        
    }


    static boolean stringSearch2(String str, char target){
        


        return true;

    }





    static boolean stringSearch(String str , char target){
        if(str.isEmpty()){
            return false;

        }
        for(int i=0 ;i<str.length(); i++){
            if(target ==str.charAt(i))
            {
                return true;
            }

        }
        



        return false;


    }

     
    
}
