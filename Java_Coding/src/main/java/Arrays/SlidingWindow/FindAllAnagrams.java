package Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = p.length();
        char[] anamArray = p.toCharArray();
        Arrays.sort(anamArray);

        for(int i = 0; i <= s.length()- n; i++) {
            String temp = s.substring(i,i+n);
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);

            if(Arrays.equals(ch, anamArray)) {
                list.add(i);
            }
        }

        return list;
    }
}
