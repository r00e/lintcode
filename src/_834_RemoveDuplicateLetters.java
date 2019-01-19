import java.util.*;

public class _834_RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
//        String result = Character.toString(s.charAt(0));
        StringBuffer sb = new StringBuffer("0");

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(!map.containsKey(currentChar)){
                map.put(currentChar, 1);
            }
            else{
                map.replace(currentChar, map.get(currentChar) + 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            map.replace(currentChar, map.get(currentChar) - 1);

            if(set.contains(currentChar)) continue;

            set.add(currentChar);

//            for(int j = result.length() - 1; i != 0 && j >= 0; j--){
//                char lastCharOfResult = result.charAt(j);
//
//                if(currentChar > lastCharOfResult || map.get(lastCharOfResult) == 0){
//                    result = result.substring(0, j + 1) + currentChar;
//                    break;
//                }
//                if(currentChar < lastCharOfResult && map.get(lastCharOfResult) > 0){
//                    set.remove(lastCharOfResult);
//                }
//
//                if(j == 0) result = "" + currentChar;
//            }
            char lastCharOfResult = sb.charAt(sb.length() - 1);
            while(currentChar < lastCharOfResult && map.get(lastCharOfResult) > 0){
                sb.deleteCharAt(sb.length() - 1);
                set.remove(lastCharOfResult);
                lastCharOfResult = sb.charAt(sb.length() - 1);
            }
            sb.append(currentChar);

        }

//        return result;
        return sb.substring(1).toString();
    }
}
