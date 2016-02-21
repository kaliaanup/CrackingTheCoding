package Strings;

public class ReverseCharacters {
	public String reverse(String str)
    {
    	char[] array = str.toCharArray();
    	int i=0;
    	int j=str.length()-1;
    	while(i<j)
    	{
    		char temp=array[i];
    		array[i]=array[j];
    		array[j]=temp;
    		i++;
    		j--;
    	}
    	return new String(array);
    }
}
