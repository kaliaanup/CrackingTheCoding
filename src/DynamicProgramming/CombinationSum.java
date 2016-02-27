package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        generateCombinationSum(res, candidates, target, row);
        return res;
    }
    
    public void generateCombinationSum(List<List<Integer>> res, int[] candidates, int target, List<Integer> row)
    {
    		if(target<0) return;
            if(target==0)
            {
                res.add(row);
                return;
            }
            for(int i=0; i<candidates.length; i++)
            {
            	row.add(candidates[i]);
                generateCombinationSum(res, candidates, target-candidates[i], row);
                row.remove(candidates[i]);
            }
     }
    
    public static void main(String args[])
    {
    	CombinationSum obj = new CombinationSum();
    	int[] candidates={5,10,8,4,3,12,9};
    	System.out.println(obj.combinationSum(candidates, 27));
    }
}
