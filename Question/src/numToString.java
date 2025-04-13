public class numToString {


    public static String intToRoman(int num) {
        StringBuilder roman= new StringBuilder();


        String[] ab = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


//        String[] ab={'M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I'};
        int[] arr={1000,900,500,400,100,50,9,5,4,1};

            for(int i=0;i<num;i++){
                while (num >= arr[i]) { // Use while instead of if to allow multiple occurrences
                    roman.append(ab[i]);
                    num -= arr[i]; // Reduce num
                }
//                else{
////                    i++;
//                }
            }

        return roman.toString();
    }


}
