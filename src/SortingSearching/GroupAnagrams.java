package SortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> array = new ArrayList<List<String>>();
        Map<String, List<String>> groups = new HashMap<String, List<String>>();
        
        //sort the array containing strings
        Arrays.sort(strs);
        for(int i=0; i<strs.length; i++)
        {
        	//get the key for each group..a group of anagram have the same key when sorted
            String key = getKey(strs[i]);
            if(!groups.containsKey(key))
            {
            	//create a new group
                List<String> group = new ArrayList<String>();
                group.add(strs[i]);
                groups.put(key, group);
            }
            else
            {
            	//add to the existing group
            	List<String> group = groups.get(key);
                group.add(strs[i]);
                groups.replace(key, group);
            }
        }
        //put all hashtable elements to the array
        Iterator it = groups.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            List<String> group = (List<String>) pair.getValue();
            array.add(group);
        }
        
        return array;
    }
    //create a key for a group by sorting the elements
    public String getKey(String str)
    {
    	char[] c=str.toCharArray();
    	Arrays.sort(c);
    	return String.valueOf(c);
    }
}
