package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();
        res.add(row);
        for(int i=0; i<nums.length; i++)
        {
            res = createPermutations(res, nums[i]);
        }
        
        return res;
        
    }
    public List<List<Integer>> createPermutations(List<List<Integer>> res, int num)
    {
        List<List<Integer>> res1 = new ArrayList<List<Integer>>();
        for(int i=0; i<res.size();i++)
        {
            List<Integer> row = res.get(i);
            List<Integer> row1= new ArrayList<Integer>();
            row1.add(0,num);
            int[] array=new int[row.size()+1];
            array[0]=num;
            if(row.size() >0)
            {
            	for(int j=0;j<row.size();j++)
                {
                    row1.add(j+1,row.get(j));
                    array[j+1]=row.get(j);
                }
                res1.add(row1);
                for(int j=0; j<array.length;j++)
                {
                	//swap array[j] and array[j+1]
                	if(j+1<array.length)
                	{
                	int temp = array[j];
                	array[j]=array[j+1];
                	array[j+1]=temp;
                	List<Integer> row2= new ArrayList<Integer>();
	                	for(int k=0; k<array.length;k++)
	                	{
	                		row2.add(array[k]);
	                	}
	                res1.add(row2)	;
                	}
                }
            }
            else
            {
                res1.add(row1);
            }
        }
        return res1;
    }
    
    public static void main(String args[])
    {
    	Permutations obj = new Permutations();
    	int[] nums={1,2,3,4};
    	System.out.println(obj.permute(nums));
    	//[[0,1],[1,0]]
    }
}
