package Strings;

import java.util.Arrays;

public class ValidAnagram {
	//if one string is a permutation of another
	//O(n) space
	public static boolean isAnagram(String s, String t) {

	    int count1[] = new int[26];
	    int count2[] = new int[26];

	    if(s.length()!=t.length())
	    return false;

	   for(int i=0;i<s.length();i++){
	       count1[(s.charAt(i) - 'a')]++;
	       count2[(t.charAt(i)-'a')]++;
	   }

	   if(Arrays.equals(count1,count2))
	   return true;
	   else
	   return false;

	}
	//O(1) space O(nlogn) time
	public static boolean isAnagram1(String s, String t) {
        if(s.length() == t.length())
        {
            char[] s1 = s.toCharArray();
            Arrays.sort(s1);
            s = new String(s1);

            char[] t1 = t.toCharArray();
            Arrays.sort(t1);
            t = new String(t1);
            
            if(s.equals(t))
            {
	            return true;
            }
            else
            {
	            return false;
            }
        }
        else
        {
            return false;
        }
    }
}
