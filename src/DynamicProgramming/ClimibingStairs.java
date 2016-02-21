package DynamicProgramming;

public class ClimibingStairs {
	public int climbStairs(int n) {
        int count =0;
	      	int[] dp=new int[n+1];
	      	if(n == 0)
	      	{
	      		dp[0]=0;
	      	}
	      	if(n == 1)
	      	{
	      		dp[0]=0; dp[1]=1;
	      	}
	      	if(n >= 2)
	      	{
	      		dp[0]=0; dp[1]=1; dp[2]=2;
 	      	for(int i=3; i<=n; i++)
 	      	{
 	      		dp[i]=dp[i-2]+dp[i-1];
 	      	}
	      	}
	      	
	      	return dp[n];
 }
}