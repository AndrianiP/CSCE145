//Adriani Perez

public class StringHelper {
    //Check first character then check the rest use str.length in a for loop
    public static boolean hasAllUniqueCharacters(String str){

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static String meshString(String str1, String str2){
        if (str1 == null || str2 == null){
            return null;
        }

        String bString = str1;
        String sString = str2;

        if(str1.length() < str2.length()){
            bString = str2;
            sString = str1;
        }

        String ret = "";

        for (int i = 0; i < sString.length(); i++){
            ret += (str1.charAt(i)+""+str2.charAt(i));
        }
        ret += bString.substring(sString.length());
        return ret;
    }
    
    public static String replaceVowelsWithOodle(String str){
        String ret = "";
        str = str.toLowerCase();

        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                ret+= "oodle";
            }
            else{
                ret += str.substring(i, i+1);
            }
        }
        return ret;
    }
    public static double weight(String str){
        double ret = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                ret += 2.5;
            }
            else{
                ret += 4.3;
            }
        }
        return ret;
    }

}

