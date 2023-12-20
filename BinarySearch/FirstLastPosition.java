import java.util.Arrays;

class FirstLastPosition {

	public int firstOccurence(int[] nums,int target){
		int firstOccurenceIndex = -1;

		int start = 0;
		int end = nums.length - 1;

		while(start<=end){

			// calculate mid
			int mid = start - (start-end)/2;

			if(target == nums[mid]){
				firstOccurenceIndex = mid;
				end = mid - 1;
			} else if(target < nums[mid]){
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}


		return firstOccurenceIndex;
	}

	public int lastOccurence(int[] nums,int target){
		int lastOccurenceIndex = -1;

		int start = 0;
		int end = nums.length - 1;

		while(start<=end){

			// calculate mid
			int mid = start - (start-end)/2;

			if(target == nums[mid]){
				lastOccurenceIndex = mid;
				start = mid + 1;
			} else if(target < nums[mid]){
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return lastOccurenceIndex;
	}


	public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        int startingIndex = firstOccurence(nums,target);

        int endingIndex = lastOccurence(nums,target);

        result[0] = startingIndex;
        result[1] = endingIndex;


        return result;
    }

	public static void main(String[] args){

		int[] nums = {5,7,7,8,8,10};

		FirstLastPosition object = new FirstLastPosition();

		System.out.println(Arrays.toString(object.searchRange(nums,8)));
	        	
	}
}