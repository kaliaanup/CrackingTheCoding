package DynamicProgramming;

public class ClimibingStairs {
	
	//n steps can hop 1 or 2
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
	
	//n steps can hop 1, 2, or 3
	
	public int climbStairs1(int n) {
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
	      	if(n == 2)
	      	{
	      		dp[0]=0; dp[1]=1; dp[2]=2;
	      	}
	      	if(n == 3)
	      	{
	      		dp[0]=0; dp[1]=1; dp[2]=2; dp[3]=4;
	      	}
	      	if(n >= 4)
	      	{
	      		dp[0]=0; dp[1]=1; dp[2]=2; dp[3]=4;
	 	      	for(int i=4; i<=n; i++)
	 	      	{
	 	      		dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
	 	      	}
	      	}
	      	
	      	return dp[n];
 }
}
