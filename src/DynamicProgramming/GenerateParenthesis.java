package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generateParenthesisPerm(res, n, n, "");
        return res;
    }
    
    public void generateParenthesisPerm(List<String> res, int leftn, int rightn, String str)
    {
        if(leftn==0 && rightn==0) 
        {
            res.add(str);
            return;
        }
        if(leftn>0) generateParenthesisPerm(res, leftn-1, rightn, str+"(");
        if(rightn>leftn) generateParenthesisPerm(res, leftn, rightn-1, str+")");
    }
}
