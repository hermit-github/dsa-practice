import java.util.Arrays;

/* LeetCode Problem: 724. Find Pivot Index */

public class PivotIndex {

	public static int pivotIndex(int[] nums){

		int[] prefixSumArray = new int[nums.length];
		Arrays.fill(prefixSumArray,0);
		prefixSumArray[0] = nums[0];

		// compute the prefix sum for all the array indexs
		for(int i = 1;i < nums.length ; i++){
			prefixSumArray[i] = prefixSumArray[i-1] + nums[i];
		}
		


	
		for(int i = 0;i < prefixSumArray.length ; i++){

			/*
				 in prefix array look for i such that :
				  prefix[i-1] = prefix[prefix.length - 1] - prefix[i] */

			try{

				int leftSum = prefixSumArray[i-1];
				int rightSum = prefixSumArray[prefixSumArray.length - 1] - prefixSumArray[i];

				if(leftSum == rightSum){
					return i;
				}

			} catch(Exception e) {
				int leftSum = 0;
				int rightSum = prefixSumArray[prefixSumArray.length - 1] - prefixSumArray[i];

				if(leftSum == rightSum){
					return i;
				}
			}
		}


		return -1;
	}

	// optimized approach

	public static int pivotIndexOptimized(int[] nums){

		// to store the total sum of the array
		int totalSum = 0;

		// to store the left sum
		int leftSum = 0;

		// compute total sum
		for(int element:nums)
			totalSum += element;

		for( int i = 0;i<nums.length;leftSum += nums[i++]){
			if(leftSum*2 == totalSum - nums[i]){
				return i;
			}
		}



		return -1;
	}

	public static void main(String[] args){

		int[] nums = {1,7,3,6,5,6};
		// int[] nums = {2,1,-1};

		System.out.println(pivotIndex(nums));
		System.out.println(pivotIndexOptimized(nums));

		
	}

}