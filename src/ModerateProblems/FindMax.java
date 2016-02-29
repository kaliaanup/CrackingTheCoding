package ModerateProblems;

public class FindMax {
	int findMax( int x, int y)
	{
	   int z = x - y;
	   int i  = (z  >>  31)  &  0x1;
	   int  max  =  x - i  *  z;
	   return max;
	}

	public static void main(String args[])
	{
		FindMax inst=new FindMax();
		
		System.out.print(inst.findMax(4, 5));
	}
}
