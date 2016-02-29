package SortingSearching;

public class SearchRotatedArray {
	public int search(int[] nums, int target) {
        
	 	int ret = rBinarySearch(0, nums.length-1, nums, target );
		return ret;
    }
    
 public int rBinarySearch(int low, int high, int[] nums, int target)
 {
	 if(low>high)
	 {
		 return -1;
	 }
	 
	 int mid = (low+high)/2;
	 if(target == nums[mid])
	 {
		 return mid;
	 }
	 //1st array is sorted
	 if(nums[low]<=nums[mid])
	 {
		 if(target>=nums[low] && target<=nums[mid])
		 {
			 return rBinarySearch(low, mid-1, nums, target);
		 }
		 else
		 {
			 return rBinarySearch(mid+1, high, nums, target);
		 }
	 }
	 //2nd array is sorted
	 if(nums[mid]<=nums[high])
	 {
		 if(target>=nums[mid]&& target<=nums[high])
		 {
			 return rBinarySearch(mid+1, high, nums, target);
		 }
		 else
		 {
			 return rBinarySearch(low, mid-1, nums, target);
		 }
	 }
	 
	 return -1;
 }
  
 //allow duplicates in rotated array
 public boolean search1(int[] nums, int target) {
        
	 	boolean ret = rBinarySearch1(0, nums.length-1, nums, target );
		return ret;
    }
 public boolean rBinarySearch1(int low, int high, int[] nums, int target)
 {
	 if(low>high)
	 {
		 return false;
	 }
	 
	 int mid = (low+high)/2;
	 if(target == nums[mid])
	 {
		 return true;
	 }
	 if(nums[low] == nums[mid])
	 {
		 for(int i=low;i<mid;i++)
		 {
			 if(target == nums[i])
			 {
				 return true;
			 }
		 }
	 }
	 if(nums[mid] == nums[high])
	 {
		 for(int i=mid+1;i<high;i++)
		 {
			 if(target == nums[i])
			 {
				 return true;
			 }
		 }
	 }
	 //1st array is sorted
	 if(nums[low]<=nums[mid])
	 {
		 if(target>=nums[low] && target<=nums[mid])
		 {
			 return rBinarySearch1(low, mid-1, nums, target);
		 }
		 else
		 {
			 return rBinarySearch1(mid+1, high, nums, target);
		 }
	 }
	 //2nd array is sorted
	 if(nums[mid]<=nums[high])
	 {
		 if(target>=nums[mid]&& target<=nums[high])
		 {
			 return rBinarySearch1(mid+1, high, nums, target);
		 }
		 else
		 {
			 return rBinarySearch1(low, mid-1, nums, target);
		 }
	 }
	 
	 return false;
 }
}
