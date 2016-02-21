package DynamicProgramming;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
        int [][] grid=new int[m][n];
	        for(int i=0;i<m;i++)
	        {
	        	for(int j=0;j<n;j++)
	        	{
	        		if(i==0||j==0)
	        			grid[i][j]=1;
	        		else
	        			grid[i][j]=grid[i-1][j]+grid[i][j-1];
	        	}
	        }
	        return grid[m-1][n-1];
    }
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	
    	int m=obstacleGrid.length;//row
    	int n=obstacleGrid[0].length;
    	int s[][]=new int[m][n];
    	s[0][0]=obstacleGrid[0][0]==0? 1:0;
    	for(int i=0;i<m;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			if(obstacleGrid[i][j] == 1)
    			{
    				s[i][j]=0;
    			}
    			else if(i>0 && j==0)
    			{
    				s[i][0]=s[i-1][0];
    			}
    			else if(i==0 && j>0)
    			{
    					s[0][j]=s[0][j-1];
    			}
    			else if(i>0 & j>0)
    			{	
    					s[i][j]=s[i-1][j]+s[i][j-1];
    			}
	    	}
    	}
    	
    	
    	return s[m-1][n-1];
    }
}
