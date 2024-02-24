import java.util.*;
public class dupliString {
    public static void removeDuplicates(String str, int idex,StringBuilder newStr, boolean map[]){
        //base case
        if(idex == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idex);
        if(map[currChar - 'a'] == true){
            //duplicate 
            removeDuplicates(str,idex+1,newStr,map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idex+1,newStr.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
    }
}