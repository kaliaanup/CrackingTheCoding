package SortingSearching;

public class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexA=m-1, indexB=n-1, mergedIndex=m+n-1;
        
        //compare elements of nums1 and nums2 until everything is exhausted
        //if we insert in the beginning of nums1, we need to shift everything to the back
        //hence better to insert element into the back of an array
        while(indexA>=0 && indexB>=0)
        {
        	if(nums1[indexA]>=nums2[indexB])
        	{
        		nums1[mergedIndex]=nums1[indexA];
        		indexA--;
        		mergedIndex--;
        	}
        	else
        	{
        		nums1[mergedIndex]=nums2[indexB];
        		indexB--;
        		mergedIndex--;
        	}
        }
        /*copy the remaining elements from b into place*/
        while(indexB>=0)
        {
        	nums1[mergedIndex]=nums2[indexB];
        	indexB--;
        	mergedIndex--;
        }
        
    }
}
