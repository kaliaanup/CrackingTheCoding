package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
		
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        res.add(row);
        if(nums.length>0)
        {
        	int i=0;
            while(i<nums.length)
            {
            	res = combineOutputs(res, nums[i]);
            	i++;
            }
        }
        return res;
        
    }
    
    public List<List<Integer>> combineOutputs(List<List<Integer>> res, int num)
    {
    	List<List<Integer>> res1= new ArrayList<List<Integer>>(); 
    	for(int i=0; i<res.size(); i++)
        {
            List<Integer> row = new ArrayList<Integer>();
            row = res.get(i);
            res1.add(row);
            //copy row to row1
            List<Integer> row1 = new ArrayList<Integer>();
            
            for(int j=0; j<row.size();j++)
            {
            	row1.add(row.get(j));
            }
            //add num to new row1
            row1.add(num);
            //add row1 to res
            res1.add(row1);
        }
    	return res1;
    }
    
    public static void main(String args[])
    {
    	SubSets obj = new SubSets();
    	int []nums={4,1,0};
    	System.out.println(obj.subsets(nums));
    }
}
