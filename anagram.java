import java.util.*;

public class anagram {
    public static void main(String[] args) {
        // leetcode Qno.242
        System.out.println(isanagram("earth","heart"));
}

public static boolean isanagram(String s,String t){
     char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
}
}

// changing the git file