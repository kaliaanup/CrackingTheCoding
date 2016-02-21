package Trees;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BinarySearchTreeToLinkedListArrays {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arrays = new ArrayList<List<Integer>>(); 
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        if(root!=null)
        {
        		List<Integer> row = new ArrayList<Integer>();    
            	row.add(root.val);
            	map.put(0, row);
                levelOrderTraversal(root.left, map, 1);
                levelOrderTraversal(root.right, map, 1);
        }
        
        Iterator itr = map.keySet().iterator();
        while(itr.hasNext())
        {
        	Integer key = (Integer)itr.next();
        	List<Integer> row = map.get(key);
        	arrays.add(row);
        }
        
        return arrays;
    }
    
    public int levelOrderTraversal(TreeNode root, Map<Integer,List<Integer>> map, int height)
    {
                if(root==null) return height;
                if(map.containsKey(height))
                {
                    List<Integer> row = map.get(height);
                    if(!row.contains(root.val))
                    {
                        row.add(root.val);
                        map.replace(height,row);
                    }
                }
                else
                {
                    List<Integer> row = new ArrayList<Integer>();    
                    row.add(root.val);
                    map.put(height, row);
                }
                levelOrderTraversal(root.left, map, height+1);
                levelOrderTraversal(root.right, map, height+1);
      return -1;          
    }   
}
